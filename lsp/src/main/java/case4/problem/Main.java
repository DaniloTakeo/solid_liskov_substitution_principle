package case4.problem;

public class Main {
    public static void main(String[] args) {
        Car myCar = new ElectricCar(); // Problema aqui!
        myCar.refuel(50); // Lança uma exceção inesperada
    }
}