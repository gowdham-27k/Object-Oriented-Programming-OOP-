class BankAccount {
    private double balance;  // Protected data

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
