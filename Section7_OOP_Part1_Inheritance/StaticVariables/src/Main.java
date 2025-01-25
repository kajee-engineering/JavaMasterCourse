package Section7_OOP_Part1_Inheritance.StaticVariables.src;

public class Main {
    public static void main(String[] args) {

        Dog a = new Dog("a", "a@email"); // 右辺でメモリにデータを生成, 参照するには変数に代入する
        Dog b = new Dog("b", "b@email");
        a.printName();
        b.printName();

        a.bark();
        b.bark();

        a.run();

    }
}