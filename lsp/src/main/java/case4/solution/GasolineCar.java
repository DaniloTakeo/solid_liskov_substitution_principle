package case4.solution;

public class GasolineCar implements Vehicle, FuelPowered {
    private int fuelLevel;

    public GasolineCar(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void drive() {
        System.out.println("Carro a gasolina está dirigindo.");
    }

    @Override
    public void refuel(int amount) {
        if (amount > 0) {
            fuelLevel += amount;
            System.out.println("Carro abastecido. Nível de combustível: " + fuelLevel);
        }
    }
}
