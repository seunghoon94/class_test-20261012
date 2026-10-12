package classTest;

public class MainClass2 {

	public static void main(String[] args) {
		
		ConTest cont2 = new ConTest(); //객체 선언
		ConTest cont = new ConTest(10, "이순신", 85.5); //생성자 호출
		ConTest cont3 = new ConTest(15, "김유신");

		
		cont.number = 10;
		cont.name = "이순신";
		cont.score = 85.5;
		
		System.out.println(cont3.name);
		
	}

}
