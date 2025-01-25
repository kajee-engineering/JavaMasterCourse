package Section5_Expressions_Statements_And_More.MethodCallenge.src;

public class Main {

    public static void main(String[] args) {
        displayHighScorePosition("Tim", calculateHighScorePosition(1500));
        displayHighScorePosition("Bob", calculateHighScorePosition(1000)); // この境界には問題が潜んでいることがあるので、テストの値にピッタリだ。
        displayHighScorePosition("Percy", calculateHighScorePosition(500));
        displayHighScorePosition("Gilbert", calculateHighScorePosition(100));
        displayHighScorePosition("James", calculateHighScorePosition(25));
        displayHighScorePosition("James", calculateHighScorePosition(-1000));
        }

    private static int calculateHighScorePosition(int i) {
        int position = 0;

        if (1000 <= i) {
            position = 1;
        } else if (500 <= i) {
            position = 2;
        } else if (100 <= i) {
            position = 3;
        } else {
            position = 4;
        }
        return position;
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " is in position [ " + position + " ].");
    }
}