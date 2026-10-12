package privateTest;

public class MainBoard {

	public static void main(String[] args) {
		
		Board board = new Board();
		
		board.setBoardNum(1);
		board.setBoardNum1("홍길동");
		board.setBoardNum2("똥쌌니");
		board.setBoardNum3("아니오");
		board.setBoardNum4("20261011");
		board.setBoardNum5(20);
		
//		System.out.println(board.boardNum); ->private 접근제어자 이므로 실패
		System.out.println(board.getBoardNum()); //boardNum값인 1을 반환
	}

}
