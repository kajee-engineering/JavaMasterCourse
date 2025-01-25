package Section7_OOP_Part1_Inheritance.InheritanceChallenge.src;

public class Worker {

    private String name;
    private String birthDate;
    protected String endDate; // サブクラス以下で定義することになりそうなのでprotectedにする

    public Worker() {
        // 継承先でデフォルトのコンストラクタを作ることができる
        // 継承先でコンパイルエラーにならない
    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        int currentYear = 2025;
        int birthYear = Integer.parseInt(birthDate.substring(6)); // mm/dd/yyyy

        return (currentYear - birthYear);
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
