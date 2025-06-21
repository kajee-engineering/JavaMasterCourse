package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    record Person (String firstName, String lastName) {
        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    } // 暗黙的にstatic

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Main.Person("Sally", "Brown"),
                new Main.Person("Linus", "Van Belt"),
                new Person("Peppermint", "Patty"),
                new Person("Charlie", "Brown")
        ));

        // 匿名クラス
        var comparatorLastName = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.lastName().compareTo(o2.lastName());
            }
        };

        // List.sort
        people.sort(comparatorLastName);
        System.out.println(people);


    }
}
