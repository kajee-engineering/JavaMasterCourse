package Section7_OOP_Part1_Inheritance.RecordProject.src;

public class Student {

    private String id;
    private String name;
    private String dateBirth;
    private String classList;

    public Student(String id, String name, String dateBirth, String classList) {
        this.id = id;
        this.name = name;
        this.dateBirth = dateBirth;
        this.classList = classList;
    }

    // IDE が多くのことをやってくれる
    // この種のコードには名前がありボイラープレートコードと呼ばれている
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateBirth='" + dateBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }
}
