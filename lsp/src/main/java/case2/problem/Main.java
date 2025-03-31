package case2.problem;

public class Main {
    public static void main(String[] args) {
        Bird bird1 = new Sparrow();
        bird1.fly(); 
        
        Bird bird2 = new Penguin();
        bird2.fly(); 
    }
}