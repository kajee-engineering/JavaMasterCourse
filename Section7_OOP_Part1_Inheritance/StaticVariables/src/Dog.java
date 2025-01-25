package Section7_OOP_Part1_Inheritance.StaticVariables.src;

public class Dog {

    private String name;
    private static String ID; // メンバ変数と呼ばれ全てのインスタンスで共有される

    public Dog(String name, String email) {
        this.name = name; // インスタンス変数
        Dog.ID= ID; // クラスのメンバ変数
    }

    // 静的であるべきか?
    public void printName() {
        System.out.println("name = " + name); // オブジェクトのフィールド（やインスタンスメソッド）を使用している
        System.out.println("email = " + ID); //

        // 静的ではない
    }

    public void bark() { // クラス経由でアクセスできない
        System.out.println("wan wan");
    }

    public static void run() { // メンバメソッド、オブジェクトかクラス経由でアクセス
        System.out.println("running");
    }
}
