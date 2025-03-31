package case1.problem;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Square();
        rect.setWidth(5);
        rect.setHeight(10);
        
        System.out.println("Área esperada: " + (5 * 10));
        System.out.println("Área real: " + rect.getArea()); // Problema aqui!
    }
}