package case1.problem;

public class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width; // Mantém um quadrado
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
        this.width = height; // Mantém um quadrado
    }
}