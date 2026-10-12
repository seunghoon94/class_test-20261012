package classTest;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum;
		
		Student student1 = new Student();
		student1.name = "홍길동";
		student1.hakbun = "20261001";
		student1.grade = 3;
		student1.age = 17;
		student1.score = 90;
		
		System.out.println(student1.name);
		
		student1.hello();
		
		sum = student1.add(10, 20, 30); //괄호 안의 들어갈 숫자 = 인수(인자값) argument
		
		student1.greeting("김유신");
	}

}
