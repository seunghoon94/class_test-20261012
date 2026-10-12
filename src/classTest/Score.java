package classTest;

public class Score {
	
	int kor; //국어점수
	int eng; //영어점수
	int math; //수학점수
	
	public Score() { //기본 생성자 -> 빈공간 마우스 오른쪽 버튼 -> source 클릭 -> constructor from superclass 클릭
		
	}

	public Score(int kor, int eng, int math) {
		
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public Score(int kor, int eng) {
		
		this.kor = kor;
		this.eng = eng;
	}

	public Score(int kor) {
		
		this.kor = kor;
	}
	
	
	
	

}
