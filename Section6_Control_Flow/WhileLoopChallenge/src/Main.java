package Section6_Control_Flow.WhileLoopChallenge.src;

public class Main {

    public static void main(String[] args) {

        int number = 4;
        int evenCount = 0;
        int oddCount= 0;
        int finishNumber = 20;

        while (number <= finishNumber) {
            number ++;
            if (! isEvenNumber(number)) {
                oddCount ++;
                continue;
            }
            System.out.println("Even number " + number);
            evenCount ++;
        }
        System.out.println("Total even numbers  found " + evenCount);
        System.out.println("Total odd numbers found " + oddCount);
    }

    public  static boolean isEvenNumber(int number) {

        if ((number % 2) == 0)  {
            return true;
        } else{
            return false;
        }
    }
}