package classTest;

public class ConTest {
	
	int number;
	String name;
	double score;
	
	public ConTest() { //기본 생성자 -> 표시 생략 가능
		
	}
	
	public ConTest(int number, String name, double score) {
		this.number = number; //this. -> 멤버변수를 나타낸다
		this.name = name; //this. -> 멤버변수를 나타낸다
		this.score = score; //this. -> 멤버변수를 나타낸다
	}
	
	public ConTest(int number, String name) {
		this.number = number;
		this.name = name;
	}

}
