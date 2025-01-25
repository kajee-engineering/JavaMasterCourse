package Section6_Control_Flow.Switch.src;

public class Main {
    public static void main(String[] args) {

        // int value = 1;
        // if (value == 1) {
        //     System.out.println("Value was 1");
        // } else if (value == 2) {
        //     System.out.println("Value was 2");
        // } else {
        //     System.out.println("Was not 1 or 2");
        // }
        int switchValue = 3;

        // if-then か switch-case かで書き換えることができるが多くはスタイルの問題である
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value wa 2 ");
            case 3: case 4: case 5:
                System.out.println("Was a 3 or 4 or 5");
                System.out.println("Actually was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
                break;
        }
        String month = "XYZ";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }
    // 強化版switchを使っていない、多くの企業がLTS版から1から2バージョン前のバージョンを使っている
    public static String getQuarter(String month) {
        switch (month) {
            case "JANUARY": case "FEBRUARY": case "MARCH":
                return "1st";
            case "APRIL": case "MAY": case "JUNE":
                return "2nd";
            case "JULY": case "AUTUST": case "SEPTEMBER":
                return "3rd";
            case "OCTOBER": case "NOVEMBER": case "DECEMBER":
                return "4th";
        }

        String badResponse = month + " is bad";
        return badResponse;
    }
}