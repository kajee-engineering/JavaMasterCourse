package Section7_OOP_Part1_Inheritance.StringFormatting.src;

public class Main {
    public static void main(String[] args) {

        System.out.println("Print line...");

        int age = 35;
        System.out.printf("Your age is %d\n" , age); // print format

        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);

        for (int i = 1; i <= 10000; i *= 10) {
            System.out.printf("Printing %6d %n", i);
        }

        String formatedString = String.format("Your age is %d", age);
        System.out.println(formatedString);
        formatedString += " Your age is %d".formatted(age);
        System.out.println(formatedString);
    }
}