package case4.solution;

public class ElectricCar implements Vehicle {
    private int batteryLevel;

    public ElectricCar(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void drive() {
        System.out.println("Carro elétrico está dirigindo.");
    }

    public void recharge(int amount) {
        if (amount > 0) {
            batteryLevel += amount;
            System.out.println("Carro elétrico recarregado. Nível da bateria: " + batteryLevel);
        }
    }
}