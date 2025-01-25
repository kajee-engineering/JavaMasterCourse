package Section6_Control_Flow.IfKeywordAndCodeBlocks.src;

public class MainChallenge {

    // psvm と入力して main メソッドを作成する
    public static void main(String[] args) {

        // プログラミングをするときに唯一の答えが存在することはめったにありません
        // より効率的なもの、より読みやすいもの、より将来的に再利用しやすいものもあるだろう
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The first highScore is " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        System.out.println("The second highScore is " +
                calculateScore(gameOver, score, levelCompleted, bonus));
        // コードをコピーアンドペーストするときは重複している箇所を全て覚えておく必要がある
        // それでも齟齬や間違いを起こすことがある。それを防ぐためにメソッドという方法がある
        // 気づいていないかもしれないが、main メソッドはすでにメソッドである
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) { // 実装直後に関数名にホバーすると、この関数がどこにも使用されていないことがわかる、IDE は視覚的（灰色）にも知らせてくれる

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
        }
        return finalScore;
    }
}

// JavaJDK 17では、暗黙的に宣言されたクラスはサポートされていない
// public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//     }

// 値を返さないメソッドをプロシージャ(procedure)と呼ぶ。最近は耳にしなくなったが java では void を返すメソッドがプロシージャに該当する
// 呼び出し側(呼び出し元)、呼び出される側(呼び出し先)

