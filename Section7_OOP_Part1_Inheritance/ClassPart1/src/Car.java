package Section7_OOP_Part1_Inheritance.ClassPart1.src;// クラスはソースコード内で定義される
// そして他のクラスやメソッドのコードブロックに囲まれていない場合、トップレベルクラスと呼ばれる
// トップレベルクラスで有効なアクセス修飾子は public か none の 2つだけです

public class Car { // クラスとはこれから作成するオブジェクトの設計図であることを覚えておいてほしい

    // オブジェクトには大きく二つの要素がある
    // 一つ目は 「状態 state」
    // 変数や属性と呼ばれるフィールドに格納する
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;
    // 上記の時点ではインスタンス（実例）によって値が異なるので、値は決まっていない。

    // getter ... プライベートフィールドの値を取得して返す
    // getter や setter は 通常手入力することはない。IDE の code - generate - getter を選択すると作成してくれるからだ
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getDoors() {
        return doors;
    }

    // setter
    // セッターを使ってメソッド経由で private の make 属性を更新する
    public void setMake(String make) {
        if (make == null)  make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake) {
            case "holden", "porshce", "tesla" -> this.make = make;
            default -> {
                this.make = "Unsupported";
                // this を使って メソッドの引数とクラスの属性を区別している
            }
        }
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }
    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public boolean isConvertible() {
        return convertible;
    }

    // 二つ目は 「振る舞い behavior」
    public void describeCar() {
        System.out.println(doors + "-Doors" +
                color + " "  +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : "" )
        );
    }
}
