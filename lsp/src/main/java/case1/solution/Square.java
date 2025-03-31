package case1.solution;

public class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getArea() {
        return side * side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}