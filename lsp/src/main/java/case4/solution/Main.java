package case4.solution;

public class Main {
    public static void main(String[] args) {
        Vehicle myGasolineCar = new GasolineCar(50);
        myGasolineCar.drive();

        // Apenas carros a combustível podem ser abastecidos
        if (myGasolineCar instanceof FuelPowered) {
            ((FuelPowered) myGasolineCar).refuel(20);
        }

        Vehicle myElectricCar = new ElectricCar(80);
        myElectricCar.drive();

        // Apenas carros elétricos podem ser recarregados
        if (myElectricCar instanceof ElectricCar) {
            ((ElectricCar) myElectricCar).recharge(30);
        }
    }
}