package classTest03;

public class Movie {
	
	String title;
	String genre;
	int runtime;
	
	public boolean isLongMovie() {
			if(runtime >= 120) {
				return true;
			}
			return false;
	}

}
