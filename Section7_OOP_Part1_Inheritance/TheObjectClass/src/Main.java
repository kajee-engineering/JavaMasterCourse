package Section7_OOP_Part1_Inheritance.TheObjectClass.src;

public class Main extends java.lang.Object { // 冗長な記述であるが、確かに継承している

    public static void main(String[] args) {
        Student max = new Student("Max", 21);
        System.out.println(max); // インスタンス固有のハッシュコードを表示する
        // デバッグのために使う。

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy", 8,
                "Carole");
        System.out.println(jimmy);

    }
}

class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // java が暗黙的に呼び出してくれるコードを明示的にしただけ
    // @Override
    // public String toString() {
    //     return super.toString();
    // }

    @Override
    public String toString() {
        return name + " is " + age;

        // return "Student{" +
        //         "name='" + name + '\'' +
        //         ", age=" + age +
        //         '}';
    }
}

class PrimarySchoolStudent extends Student {

    private String parentName;

    public PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " + super.toString();
    }
}