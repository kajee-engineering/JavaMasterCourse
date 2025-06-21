import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class SingleConsoleInputTimerDemo {

    // サブスレッドで実行されるタイマークラス
    static class TimerThread extends Thread {
        private volatile boolean timerInterruptedByException = false;
        private final long durationMillis;

        public TimerThread(long durationMillis) {
            this.durationMillis = durationMillis;
            setName("TimerThread"); // スレッドに名前を付ける
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": タイマーを開始します (" + durationMillis / 1000 + "秒)。");
            try {
                int second = 5;
                for (int i = second; 0 < i; i--) {
                    System.out.print("\r" + i + " ");
                    Thread.sleep(1000);
                }
                System.out.print("\r"+0);
                System.out.println(Thread.currentThread().getName() + ": タイマーが正常に完了しました。");
            } catch (InterruptedException e) {
                timerInterruptedByException = true;
                System.out.println(Thread.currentThread().getName() + ": タイマーがInterruptedExceptionにより中断されました。");
            }
        }

        public boolean wasTimerInterruptedByException() {
            return timerInterruptedByException;
        }
    }

    // コンソールからの入力を一度だけ受け付け、タイマー中断試行と最終入力の役割を担うスレッド
    static class UniversalInputReaderThread extends Thread {
        private TimerThread timerToInterrupt;
        // スレッドセーフに入力値を保持するために AtomicReference を使用
        private AtomicReference<String> userInputHolder = new AtomicReference<>(null);

        public UniversalInputReaderThread(TimerThread timer) {
            this.timerToInterrupt = timer;
            setName("UniversalInputReaderThread");
        }

        @Override
        public void run() {
           System.out.println(Thread.currentThread().getName() +
                    ": 何か入力してEnterキーを押してください。\n" +
                    "  (タイマー動作中に入力するとタイマーを中断できます。)");

            Scanner scanner = new Scanner(System.in);
            String input = null;
            try {
                input = scanner.nextLine(); // ユーザーからの入力を待つ (ブロッキング処理)
                this.userInputHolder.set(input); // 取得した入力値を保持
                System.out.println(Thread.currentThread().getName() + ": 入力処理完了。入力内容: \"" + input + "\"");

                // 入力があった時点でタイマースレッドがまだ生きていれば割り込みをかける
                if (timerToInterrupt.isAlive()) {
                    System.out.println(Thread.currentThread().getName() + ": タイマースレッド ("+ timerToInterrupt.getName() +") にinterrupt()を送信します。");
                    timerToInterrupt.interrupt();
                } else {
                    System.out.println(Thread.currentThread().getName() + ": タイマースレッド ("+ timerToInterrupt.getName() +") は既に終了していたため、割り込みは試みませんでした。");
                }
            } catch (Exception e) { // 例: Scanner が NoSuchElementException や IllegalStateException をスローする場合など
                System.err.println(Thread.currentThread().getName() + ": 入力処理中にエラーが発生しました: " + e.getMessage());
                // エラーが発生した場合、userInputHolder は null のままか、直前の値のままになる。
            }
            // scanner.close(); // ここで System.in を閉じてしまうと、万が一他の場所で必要になった場合に困るため、閉じない。
        }

        // メインスレッドがユーザーの入力値を取得するためのメソッド
        public String getUserInput() {
            return userInputHolder.get();
        }
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": メインプログラムを開始します。");

        TimerThread timerThread = new TimerThread(5000); // 5秒タイマー
        UniversalInputReaderThread inputReaderThread = new UniversalInputReaderThread(timerThread);

        timerThread.start();       // タイマースレッドを開始
        inputReaderThread.start(); // 入力処理スレッドを開始

        // 1. タイマースレッドの終了を待つ
        //    この間、inputReaderThread がユーザーの入力に基づき timerThread に割り込む可能性がある。
        try {
            timerThread.join();
            System.out.println(Thread.currentThread().getName() + ": タイマースレッド ("+ timerThread.getName() +") の処理が終了したのを確認しました。");
        } catch (InterruptedException e) {
            System.err.println(Thread.currentThread().getName() + ": タイマースレッドのjoin待機中にメインスレッドが割り込みを受けました。");
            // メインスレッドが割り込まれた場合、他のスレッドも適切に処理する必要があるかもしれない
            if (timerThread.isAlive()) {
                timerThread.interrupt(); // タイマースレッドにも割り込みを試みる
            }
            Thread.currentThread().interrupt(); // メインスレッドの割り込みステータスを再設定
        }

        // 2. 入力スレッドの終了を待つ
        //    もしユーザーがまだ入力していなければ、ここでユーザーの入力が完了するまでメインスレッドは待機する。
        //    もしユーザーが既に入力済みであれば、この join はすぐに完了する。
        try {
            inputReaderThread.join();
            System.out.println(Thread.currentThread().getName() + ": 入力スレッド ("+ inputReaderThread.getName() +") の処理が終了したのを確認しました。");
        } catch (InterruptedException e) {
            System.err.println(Thread.currentThread().getName() + ": 入力スレッドのjoin待機中にメインスレッドが割り込みを受けました。");
            if (inputReaderThread.isAlive()) {
                // InputReaderThread内のScanner.nextLine()はinterrupt()に直接反応しにくいが、念のため。
                inputReaderThread.interrupt();
            }
            Thread.currentThread().interrupt();
        }

        // 結果の表示
        System.out.println("-------------------- 結果 --------------------");
        if (timerThread.wasTimerInterruptedByException()) {
            System.out.println("タイマーの結果: InterruptedExceptionにより中断されました。");
        } else {
            System.out.println("タイマーの結果: 中断されませんでした（正常完了）。");
        }

        String userInput = inputReaderThread.getUserInput();
        if (userInput != null) {
            System.out.println("ユーザーが入力した内容: \"" + userInput + "\"");
        } else {
            System.out.println("ユーザーからの入力は得られませんでした（または入力処理中にエラーが発生しました）。");
        }
        System.out.println("---------------------------------------------");

        System.out.println(Thread.currentThread().getName() + ": メインプログラムを終了します。");
    }
}