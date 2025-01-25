package Section5_Expressions_Statements_And_More.PlayingCat.src;

public class Main {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {

        boolean isPlay = 25 <= temperature && temperature <= 35;

        if (summer) {
            if (25 <= temperature && temperature <= 45) {
                isPlay = true;
            }
        }

        return isPlay;
    }
}
