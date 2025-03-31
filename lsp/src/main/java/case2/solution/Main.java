package case2.solution;

public class Main {
    public static void main(String[] args) {
        FlyingBird sparrow = new Sparrow();
        sparrow.fly(); 
        sparrow.eat();

        Bird penguin = new Penguin();
        penguin.eat(); 
    }
}