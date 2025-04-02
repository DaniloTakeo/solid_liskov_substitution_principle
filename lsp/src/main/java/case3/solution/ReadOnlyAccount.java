package case3.solution;

class ReadOnlyAccount implements Account {
    private final BankAccount bankAccount;

    public ReadOnlyAccount(double balance) {
        this.bankAccount = new BankAccount(balance);
    }

    @Override
    public double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public void deposit(double amount) {
        bankAccount.deposit(amount);
    }
}