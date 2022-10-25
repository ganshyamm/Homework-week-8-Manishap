import java.awt.*;

public class P16Point {
    int x;
    int y;

    public void Point() {
    }

    public void Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {

        Point first = new Point(6, 5);

        Point second = new Point(3, 1);

        first.getX();
        first.getY();

        second.getY();
        second.getX();

        System.out.println("distance from point 'first' to point 'second = " + first.distance(second));

    }


    public double distance() {
        return distance(0, 0);
    }

    public double distance(int x, int y) {
        System.out.println("this.x and this.y " + this.x + " " + this.y);

        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    public double distance(Point secondPoint) {

        return distance(secondPoint.x, secondPoint.y);
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

}
