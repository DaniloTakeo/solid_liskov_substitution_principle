package case2.problem;

public class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Pinguins não podem voar!");
    }
}