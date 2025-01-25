package Section5_Expressions_Statements_And_More.MegaBytesConverter.src;

public class LeapYear {
    public static void main(String[] args) {

    }

    public static boolean isLeapYear(int year) {

        boolean isLeap = false;

        if ((1 <= year) && (year <= 9999)) {
            isLeap = ((year % 4 == 0) && (year % 100 != 0)) ||
                    ((year % 100 == 0) & (year % 400 == 0));

            if ((year % 100 == 0) && (year % 400 != 0)) {
                isLeap = false;
            }
            return isLeap;
        }
        return false;
    }
}
