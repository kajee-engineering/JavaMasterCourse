package Section5_Expressions_Statements_And_More.Sum3And5Challenge.src;

public class Main {

    public static void main(String[] args) {

        int countOfMatches = 0;
        int sumOfMatches = 0;

        for (int i = 1; countOfMatches < 10 && i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 ==0 ) {
                System.out.println(i + " is divided by both 3 and 5" );
                countOfMatches++;
                sumOfMatches += i;
            }
        }
        System.out.println("total is " + countOfMatches);
        System.out.println("sum = " + sumOfMatches);
    }
}
