package Section7_OOP_Part1_Inheritance.InheritanceChallenge.src;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");

        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Age = " + tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee(
                "Joe", "11/11/1990", "03/03/2020", 35000);
        System.out.println(joe);
        System.out.println("Age = " + joe.getAge());
        System.out.println("Age = " + joe.collectPay());

        joe.retire();
        System.out.println(joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970",
                "03/03/2021", 15);
        System.out.println(mary);
        System.out.println(mary.collectPay());
        System.out.println(mary.getDoublePay());
    }
}