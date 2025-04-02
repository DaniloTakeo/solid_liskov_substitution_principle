package case3.problem;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new ReadOnlyAccount(1000);
        System.out.println("Saldo inicial: " + account.getBalance());
        
        // Depósito funciona normalmente
        account.deposit(500);
        System.out.println("Saldo após depósito: " + account.getBalance());

        // Tentativa de saque gera uma exceção!
        account.withdraw(200);
        System.out.println("Saldo final: " + account.getBalance());
    }
}