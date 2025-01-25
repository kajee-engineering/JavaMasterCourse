package Section7_OOP_Part1_Inheritance.MethodOverLoading.src;

public class Main {
    public static void main(String[] args) {
        System.out.println("New score is " + calculateScore("Tim", 500));
        System.out.println("New score is " + calculateScore(10));
    }


    public static int calculateScore(String playeraName, int score) {
        System.out.println("Player " + playeraName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        return calculateScore("Anonymous", score);
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }
}
