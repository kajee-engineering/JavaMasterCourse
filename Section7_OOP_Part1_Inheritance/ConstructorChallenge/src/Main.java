package Section7_OOP_Part1_Inheritance.ConstructorChallenge.src;

public class Main {
    public static void main(String[] args) {
        Person defaultPerson = new Person();
        System.out.println(defaultPerson);

        Person specifiedPerson = new Person(true, "tom");
        System.out.println(specifiedPerson);

        Person person = new Person("tom", 100, false);
        System.out.println(person);
        // name has private access
        // System.out.println(person.name);
        // use getter to access name
        System.out.println(person.getName());
    }
}