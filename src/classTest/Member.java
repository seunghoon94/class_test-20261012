package classTest;

public class Member {
	
	//아이디, 비밀번호, 회원이름, 회원나이, 회원주소
	String id; //회원 아이디
	String pass; //회원 비밀번호
	String name; //회원 이름
	int age; //회원 나이
	String address; //회원 주소
	
	
	
	public Member() { //기본생성자 -> 생략 가능
		
	}
	
	public Member(String id, String pass, String name, int age, String address) {
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.age = age;
		this.address = address;
	}



	public String adultPass() { //"성년" or "미성년" 문자열 반환
		
		if(this.age >= 19) { //참이면 성인
			return "성년입니다.";
		} else {
			return "미성년입니다.";
		}
		
//		public void adultPass() { //"성년" or "미성년" 문자열 반환
//			
//			if(this.age >= 19) { //참이면 성인
//				System.out.println("성년입니다.");
//			} else {
//				System.out.prinln("미성년입니다.")
//	}
}
}

