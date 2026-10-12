package privateTest;

public class Member {
	
	//멤버변수, 생성자 2개, getter, setter 
	
	//멤버변수 : 회원 이름,태어난년,월,일,태어난시,태어난지역
	
	private String name;
	private int birth;
	private int month;
	private int day;
	private String time;
	private String address;
	
	
	public Member() {
	}


	public Member(String name, int birth, int month, int day, String time, String address) {
		this.name = name;
		this.birth = birth;
		this.month = month;
		this.day = day;
		this.time = time;
		this.address = address;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getBirth() {
		return birth;
	}


	public void setBirth(int birth) {
		this.birth = birth;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
}
