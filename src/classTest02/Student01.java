package classTest02;

public class Student01 {
	
	String name;
	int score;
	
	public void introduce() {
		System.out.println("이름 : " + this.name);
		System.out.println("점수 : " + this.score);
	}
	
	public boolean isPass() {
		if(score >= 60) {
			return true;
		}
		return false;
	}
	public String getGrade() {
		
		String result;
		
		if(score >= 90) {
			result = "A";
		} else if (score >= 80) {
			result = "B";
		} else if (score >= 70) {
			result = "C";
		} else {
			result = "F";
		}
		return result;
	}
	
	//가산점을 전달받아 학생의 점수(score) + 가산점을 출력하시오.
	public void weightscore(int weightscore) {
		System.out.print(this.score + weightscore); //this. 을 붙이면 멤버변수를 우선하게 된다
	}

}
