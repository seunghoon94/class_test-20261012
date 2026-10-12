package privateTest;

public class MainTest {

	public static void main(String[] args) {
		
		PrivateTest privateTest = new PrivateTest();
		//private 멤버변수도 생성자를 통한 초기화는 가능하다
		
//		PrivateTest privateTest = new PrivateTest("홍길동", 90);
		
		privateTest.name = "홍길동";
//		privateTest.score = 90;
		
		privateTest.inputScore(100);
		
		privateTest.test(); //테스트 추가

	}
	
}
