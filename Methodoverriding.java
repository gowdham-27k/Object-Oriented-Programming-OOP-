class BankAccount {

    void calculateInterest() {
        System.out.println("General Interest");
    }
}

class SavingsAccount extends BankAccount {

    @Override
    void calculateInterest() {
        System.out.println("Savings Interest = 5%");
    }
}

class CurrentAccount extends BankAccount {

    @Override
    void calculateInterest() {
        System.out.println("Current Interest = 0%");
    }
}

public class Main {

    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount();
        s.calculateInterest();

        CurrentAccount c = new CurrentAccount();
        c.calculateInterest();

    }
}
