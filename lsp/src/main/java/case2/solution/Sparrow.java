package case2.solution;

public class Sparrow implements FlyingBird {
    @Override
    public void eat() {
        System.out.println("O pardal está comendo.");
    }

    @Override
    public void fly() {
        System.out.println("O pardal está voando!");
    }
}