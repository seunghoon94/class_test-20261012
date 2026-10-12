package classTest;

public class Car {
	
	String model; 
	String color;
	int speed;
	
	public Car() {
	
	}

	public Car(String model, String color, int speed) {
		
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
	
	public void showinfo() {
		System.out.println("모델 : " + this.model);
		System.out.println("색상 : " + this.color);
		System.out.println("속도 : " + this.speed);
		
	}
	
	
	

}
