package classTest;

public class Account {
	
	String owner;
	int balance;
	
	public Account() {
		
	}

	public Account(String owner, int balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	public int depoist(int money) { //return 값이 있어도 없어도 상관 무
		balance = balance + money;
		return balance;
	}
	
	public void withdraw(int money) {
		balance = balance - money;
	}
	
	public void showBalance() {
		System.out.println(owner + "님의 잔액 : " + balance + "원");
	}
	
	
	
	

}
