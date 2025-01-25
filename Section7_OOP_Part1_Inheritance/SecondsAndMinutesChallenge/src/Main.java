package Section7_OOP_Part1_Inheritance.SecondsAndMinutesChallenge.src;

public class Main {
    public static void main(String[] args) {
        System.out.println(getDuarationString(-3945));
        System.out.println(getDuarationString(-65, 45));
        System.out.println(getDuarationString(65, 145));
        System.out.println(getDuarationString(65, 45));
        System.out.println(getDuarationString(3945));
    }

    public static String getDuarationString(int seconds) {
        if (seconds < 0 ) {
            return "Invalid data for seconds(" + seconds + ")";
        }

        return getDuarationString(seconds / 60, seconds % 60);
    }

    public static String getDuarationString(int minutes, int seconds) {
        if (minutes < 0 ) {
            return "Invalid data for minutes(" + minutes + ")";
        }
        if (seconds < 0 || seconds > 59) {
            return "Invalid data for minutes(" + seconds + ")";
        }

        return minutes / 60 + "h " + minutes % 60+ "m " + seconds + "s";
    }
}