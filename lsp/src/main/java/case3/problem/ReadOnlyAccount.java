package case3.problem;

class ReadOnlyAccount extends BankAccount {
    public ReadOnlyAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        throw new UnsupportedOperationException("Essa conta não permite saques!");
    }
}