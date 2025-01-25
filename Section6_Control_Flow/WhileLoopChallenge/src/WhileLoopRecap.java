package Section6_Control_Flow.WhileLoopChallenge.src;

public class WhileLoopRecap {
    public static void main(String[] args) {
        int number = 0;

        while (number < 15) {
            number ++;

            if (number <= 5) {
                System.out.println("Skipping number  " + number);
                continue; // ループの継続を注意深く吟味したい
            }
            System.out.println("number =  " +  number);

            if (number >= 10) {
                System.out.println("Breaking at " + number );
                break; // ループの終了を注意深く吟味したい, 無限ループになるかもしれないからだ
            }
        }
    }
}
