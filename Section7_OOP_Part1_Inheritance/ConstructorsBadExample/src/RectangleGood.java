package Section7_OOP_Part1_Inheritance.ConstructorsBadExample.src;

public class RectangleGood {

    private int x;
    private int y;
    private int width;
    private int height;

    public RectangleGood() {
        this(0, 0); // このクラスにある2つの引数を受け取るコンストラクタを呼び出す
    }

    public RectangleGood(int width, int height) {
        this(0, 0, width, height);
    }

    public RectangleGood(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
