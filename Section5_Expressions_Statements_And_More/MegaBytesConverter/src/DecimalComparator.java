package Section5_Expressions_Statements_And_More.MegaBytesConverter.src;

public class DecimalComparator {
    public static void main(String[] args) {

    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int num1Int = (int) (num1 * 1000);
        int num2Int = (int) (num2 * 1000);
        return num1Int == num2Int;
    }
}
