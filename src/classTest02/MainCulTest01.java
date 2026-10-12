package classTest02;

public class MainCulTest01 {

	public static void main(String[] args) {
		
		Calculator cal1 = new Calculator();
				int add = cal1.add(20, 10);
				int subtrack = cal1.subtrack(20, 10);
				int multiply = cal1.multiply(20, 10);
				double divide = cal1.divide(20, 10);
				System.out.println(add);
				System.out.println(subtrack);
				System.out.println(multiply);
				System.out.println(divide);
	}

}
