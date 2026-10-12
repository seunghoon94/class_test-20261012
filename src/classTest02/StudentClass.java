package classTest02;

public class StudentClass {

	private static String name;

	public static void main(String[] args) {
		
		Student01 student1 = new Student01();
		
		student1.name = "홍길동";
		student1.score = 75;
		
		student1.introduce();
		
		boolean pass = student1.isPass();
		System.out.println(pass);
		String res = student1.getGrade();
		System.out.println(res);
		student1.weightscore(50);
	}

}
