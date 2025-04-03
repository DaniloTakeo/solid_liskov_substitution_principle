package case4.problem;

public class ElectricCar extends Car {
    public ElectricCar() {
        super(0);
    }

    @Override
    public void refuel(int amount) {
        throw new UnsupportedOperationException("Carros elétricos não usam combustível!");
    }
}