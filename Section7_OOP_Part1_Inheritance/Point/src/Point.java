package Section7_OOP_Part1_Inheritance.Point.src;

public class Point {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(
                (this.getX() - 0) * (this.getX() - 0)
                        + (this.getY() - 0) * (this.getY() - 0)
        );
    }

    public double distance(Point second) {
        return Math.sqrt(
                (second.getX() - this.getX()) * (second.getX() - this.getX())
                        + (second.getY() - this.getY()) * (second.getY() - this.getY())
        );
    }

    public double distance(int x, int y) {
        Point second = new Point(x, y);

        return distance(second);
    }
}
