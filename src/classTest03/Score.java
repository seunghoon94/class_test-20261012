package classTest03;

public class Score {
	
	int kor;
	int eng;
	int math;
	
	
	public Score() {
	}
	
	public Score(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public void printScore() {
		System.out.println("총점 : " + (kor+eng+math)); //총점 출력
		System.out.println("평균 : " + ((kor+eng+math)/3.0)); //평균 출력
	}
	
	public void printPass() {
		
		double avg = (kor+eng+math)/3.0; //평균점수
		
		if(avg >= 90) {
			System.out.println("우수");
		} else if(avg < 60) {
			System.out.println("재시험");
		} else {
			System.out.println("보통");
		}
	}
}
   
  
 

   

