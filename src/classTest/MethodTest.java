package classTest;

public class MethodTest {
	
//	int num = 10; //전역변수(global)
	int value = 10;
	
	//전역변수와 지역변수의 이름이 같을 때는 지역변수가 우선한다.
	public int test01() {
		int num = 100; //지역변수(local)
		return num + value + 100; //210
	}
	
	public int test02( ) {
		int num = 100; //지역변수(local)
		return num + 200; //300
	}
	

}
