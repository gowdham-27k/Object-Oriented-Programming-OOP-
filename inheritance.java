class BankAccount{

    void deposit(){
        System.out.println("Money Deposited");
    }

}
class SavingsAccount extends BankAccount{

    void interest(){
        System.out.println("5% Interest");
    }

}
public class Main{

    public static void main(String args[]){

        SavingsAccount s = new SavingsAccount();

        s.deposit();

        s.interest();

    }

}
