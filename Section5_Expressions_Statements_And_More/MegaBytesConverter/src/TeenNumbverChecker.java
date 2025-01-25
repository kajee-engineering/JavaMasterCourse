package Section5_Expressions_Statements_And_More.MegaBytesConverter.src;

public class TeenNumbverChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));  // should return true
        System.out.println(hasTeen(23, 15, 42)); // should return true
        System.out.println(hasTeen(22, 23, 34)); // should return false
    }
    public static boolean hasTeen(int firstInt, int secondInt, int thirdInt) {
        return (firstInt >= 13 && firstInt <= 19) ||
                (secondInt >= 13 && secondInt <= 19) ||
                (thirdInt >= 13 && thirdInt <= 19);

    }
}
