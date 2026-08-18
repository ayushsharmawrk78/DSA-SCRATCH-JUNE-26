package Lec25;

public class Backtrack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean []board = new boolean[4];

		Boardqueen2(board, 0, 2, "" ,0);
		
	}

	
	public static void Boardqueen(boolean []board,int qpsf , int tq,String ans ) {
		if(tq==qpsf) {
			System.out.println(ans);
			return;
		}
		
		
		
		
		for(int i =0;i<board.length;i++) {
			if(board[i]==false) {
				board[i]=true;
				Boardqueen(board, qpsf+1, tq, ans+"b"+i+"q"+qpsf);
				board[i]=false; // backtracking
			}
		
		}
	}
	public static void Boardqueen2(boolean []board,int qpsf , int tq,String ans , int index ) {
		if(tq==qpsf) {
			System.out.println(ans);
			return;
		}
		
		
		
		
		for(int i =index;i<board.length;i++) {
			if(board[i]==false) {
				board[i]=true;
				Boardqueen2(board, qpsf+1, tq, ans+"b"+i+"q"+qpsf ,i+1);
				board[i]=false; // backtracking
			}
		
		}
	}
}
