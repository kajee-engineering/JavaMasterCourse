package Section5_Expressions_Statements_And_More.MegaBytesConverter.src;

public class BarkingDog {
    public static void main(String[] args) {

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if ((0 <= hourOfDay && hourOfDay < 8) || (hourOfDay == 23)) {
            if (barking) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

