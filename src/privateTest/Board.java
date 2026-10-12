package privateTest;

public class Board {
	
	private int boardNum; //게시판 글번호
	private String writer; //글쓴이
	private String title; //글제목
	private String content; //글내용
	private String date; //글쓴일자
	private int hit; //조회수

	//외부로부터 받아온 인수를 멤버변수인 boardNum에 저장해주는 메소드 -> setter
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	public void setBoardNum1(String writer) {
		this.writer = writer;
	}
	public void setBoardNum2(String title) {
		this.title = title;
	}
	public void setBoardNum3(String content) {
		this.content = content;
	}
	public void setBoardNum4(String date) {
		this.date = date;
	}
	public void setBoardNum5(int hit) {
		this.hit = hit;
	}
	
	//멤버변수 boardNum을 반환해주는 메소드 -> getter
	public int getBoardNum() {
		return this.boardNum;
	}

}
