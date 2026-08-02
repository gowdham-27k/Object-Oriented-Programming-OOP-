abstract class Bank {
	abstract void withdraw();
}
class account extends Bank {
	public void withdraw() {
		System.out.print("money is withdrawing");
	}
}

interface bank {
	void ban();
}
interface loan {
	void loa();
}
class sbi implements bank,loan {
	public void ban() {
		System.out.println("here i am the bank");
	}
	public void loa() {
		System.out.println("here is your loan");
	}
}
class Main {
	public static void main(String[]args) {
		sbi s=new sbi();
		s.loa();
		s.ban();
		account a=new account();
		a.withdraw();
	}
}
