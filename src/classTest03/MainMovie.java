package classTest03;

public class MainMovie {

	public static void main(String[] args) {
		
		Movie mov1 = new Movie();
		
		mov1.runtime = 140;
		
		boolean run = mov1.isLongMovie();
		System.out.println("긴 영화인가요? " + run);
	}

}
