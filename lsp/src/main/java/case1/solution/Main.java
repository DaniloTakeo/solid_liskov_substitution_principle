package case1.solution;

public class Main {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 10);
        System.out.println("Área do Retângulo: " + rect.getArea());

        Shape square = new Square(5);
        System.out.println("Área do Quadrado: " + square.getArea());
    }
}