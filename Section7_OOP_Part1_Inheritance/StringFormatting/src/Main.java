package Section7_OOP_Part1_Inheritance.StringFormatting.src;

public class Main {
    public static void main(String[] args) {

        System.out.println("Print line...");

        int age = 35;
        System.out.printf("Your age is %d\n" + age); // print format

        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Birth year = %d", age, yearOfBirth);
    }
}