package classTest03;

public class MainTemperature {

	public static void main(String[] args) {
		
		Temperature tem1 = new Temperature();
		
		tem1.celsius = 25;
		
		double result = tem1.toFahrenheit();
		
		System.out.println("화씨 온도 : " + result);
		
	}

}
