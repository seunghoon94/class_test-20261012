package privateTest;

public class PrivateTest {
	
	String name;
	private int score; //접근제어자 private 적용
	
	public PrivateTest() {
	}
	
	public PrivateTest(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public void inputScore(int score) {
		this.score = score;
	}
	
	public void test() {
		System.out.println(name); //이름 출력
		System.out.println(score); //성적 출력

	}

}
