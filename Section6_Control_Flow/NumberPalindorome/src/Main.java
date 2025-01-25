package Section6_Control_Flow.NumberPalindorome.src;

public class Main {

    public static void main(String[] args) {
        System.out.println(
                isPalindrome(-1221) // true
        );

        System.out.println(
                isPalindrome(707) // true
        );

        System.out.println(
                isPalindrome(11212) // false
        );
    }

    public static boolean isPalindrome(int number) {
        int originalNum = number;
        int reverse = 0; // 1 -> 12 -> 122 -> 1221

        // number = 1221  -> 122 -> 12 -> 1 -> 0
        while (number != 0) {
            int lastDigit = number % 10; // 1 -> 2 -> 2 -> 1
            reverse = reverse * 10 + lastDigit; // 0 + 1 -> 2 + 10 -> 2 + 120 -> 1220 + 1
            number /= 10; // 122 -> 12 -> 1 -> 0
        }

        return originalNum == reverse;
    }
}