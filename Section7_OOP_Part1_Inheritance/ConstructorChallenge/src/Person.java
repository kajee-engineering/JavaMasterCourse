package Section7_OOP_Part1_Inheritance.ConstructorChallenge.src;

public class Person {

    private String name;
    private int age;
    private boolean gender;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isGender() {
        return gender;
    }

    public Person() {
        this("Default name", 150, true);
    }

    public Person(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(boolean gender, String name) {
        this(name, 0, gender);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
