package classTest03;

public class MainProduct {

	public static void main(String[] args) {
		
		Product pro1 = new Product();
		int total = pro1.getTotalPrice(2000, 100);
		System.out.println("총 가격 : " + total);
	}

}
