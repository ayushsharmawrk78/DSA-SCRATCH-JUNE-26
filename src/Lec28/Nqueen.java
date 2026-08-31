package Lec28;

public class Nqueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean [][]board  = new boolean[4][4];
nqueen(board, 0, 0, 4);
	}
	
	
	public static void nqueen(boolean[][]board , int cr ,int qpsf , int tq) {
		
		if(qpsf==tq) {
			display(board);
			return;
		}
		
		
		for (int i = 0; i < board.length; i++) {
			if(isafe(board,cr,i)) {
				board[cr][i]=true;
				nqueen(board, cr+1,  qpsf+1, tq);
				board[cr][i]=false;	
			}
	
		}
		
		
		
	}


	private static boolean isafe(boolean[][] board, int cr, int cc) {
		// TODO Auto-generated method stub
		int row =cr;
		while(row>=0) {
			if(board[row][cc]==true) {
				return false;
			
			}
			row--;
		}
		
		row=cr;
		int col = cc;
		
		while(row>=0&&col>=0) {
			if(board[row][col]==true) {
				return false;
			
			}
			row--;
			col--;
		}
		row=cr;
		 col = cc;
		 while(row>=0&&col<board.length) {
				if(board[row][col]==true) {
					return false;
				
				}
				row--;
				col++;
			}
		
		return true;
	}


	private static void display(boolean [][]arr) {
		// TODO Auto-generated method stub
		String ans ="";
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length; j++) {
				if(arr[i][j]==true) {
					ans =ans+"q";
				}else {
					ans = ans+".";
				}
			}
			System.out.println(ans);
			ans="";
		}
	}

}
