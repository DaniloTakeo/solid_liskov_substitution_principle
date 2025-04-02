package case3.solution;

public class Main {
    public static void main(String[] args) {
        Account account = new ReadOnlyAccount(1000);
        System.out.println("Saldo inicial: " + account.getBalance());

        // Depósito funciona normalmente
        account.deposit(500);
        System.out.println("Saldo após depósito: " + account.getBalance());

        // Tentativa de saque removida, pois ReadOnlyAccount não expõe esse método
    }
}