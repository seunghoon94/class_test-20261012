package classTest;

public class MainClass5 {

	public static void main(String[] args) {
		
		Account account = new Account("홍길동", 10000);
		
		account.depoist(5000);
		account.withdraw(3000);
		account.showBalance();
	}

}
