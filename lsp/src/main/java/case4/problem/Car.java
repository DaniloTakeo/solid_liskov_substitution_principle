package case4.problem;

public class Car {
    protected int fuelLevel;

    public Car(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void refuel(int amount) {
        if (amount > 0) {
            fuelLevel += amount;
            System.out.println("Carro abastecido. Nível de combustível: " + fuelLevel);
        }
    }
}