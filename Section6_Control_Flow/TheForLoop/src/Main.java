package Section6_Control_Flow.TheForLoop.src;

public class Main {
    public static void main(String[] args) {

        // for (int counter = 1; counter <= 5; counter++) {
        //     System.out.println(counter);
        // }

        // for (double rate = 2.0; rate <= 5.0; rate++) {
        //     double interestAmount = calculateInterest(10000.0, rate);
        //     System.out.println("10,000 at " + rate  + " % interest = " +interestAmount);
        // }
        for (double i = 7.5; i <= 10.0; i+=0.25) {
            double interestAmount = calculateInterest(100.0, i);
            if (interestAmount > 8.5) {
                break;
            }

            System.out.println("100 at " + i  + " % interest = " +interestAmount);

        }
    }

    public static double calculateInterest(double amount, double interrestRate) {
        return (amount * (interrestRate / 100));
    }
}