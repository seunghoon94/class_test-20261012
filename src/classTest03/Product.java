package classTest03;

public class Product {
	
	String name; //상품명
	int price; //가격
	int quantity; //수량
	
	
	public int getTotalPrice(int price, int quantity) {
		return (price * quantity);
	}
	
}
