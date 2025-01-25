package Section5_Expressions_Statements_And_More.MegaBytesConverter.src;

public class Main {
    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        int kiloBytesPerMegaByte = 1024;

        int megaBytes = kiloBytes / kiloBytesPerMegaByte;
        int remainBytes = kiloBytes % kiloBytesPerMegaByte;

        if (kiloBytes >= 0) {
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB"
                    + " and " + remainBytes + " KB");
        } else {
            System.out.println("Invalid Value");
        }
    }
}