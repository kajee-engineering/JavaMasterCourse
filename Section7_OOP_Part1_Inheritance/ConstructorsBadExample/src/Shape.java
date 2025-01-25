package Section7_OOP_Part1_Inheritance.ConstructorsBadExample.src;

class Shape {
    private int x;
    private int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Rectangle2 extends Shape {

    private int width;
    private int height;

    public Rectangle2(int x, int y) {
        this(x, y, 0, 0);
    }

    public Rectangle2(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }
}
