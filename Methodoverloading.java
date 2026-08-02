class Bank {

    // Method 1
    void deposit(int amount) {
        System.out.println("Deposited Rs." + amount);
    }

    // Method 2
    void deposit(int amount, String note) {
        System.out.println("Deposited Rs." + amount + " (" + note + ")");
    }

    // Method 3
    void deposit(double amount) {
        System.out.println("Deposited Rs." + amount);
    }
}

public class Main {
    public static void main(String[] args) {

        Bank b = new Bank();

        b.deposit(5000);
        b.deposit(7000, "Salary");
        b.deposit(2500.50);

    }
}
