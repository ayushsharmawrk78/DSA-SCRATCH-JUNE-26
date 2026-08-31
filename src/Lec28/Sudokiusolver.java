package Lec28;

public class Sudokiusolver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][]grid ={ { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, 
		{ 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
		{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
		{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };


sudoku(grid, 0, 0);
	}
	
	
	public static void sudoku(int [][]grid,int cr , int cc) {
		
		if(cc==9) {
			cr++;
			cc=0;
		}
		if(cr==9) {
			Display(grid);
			return;
		}
		
		
		if(grid[cr][cc]!=0) {
sudoku(grid, cr, cc+1);
		}
		else {
			for (int i = 1; i <=9; i++) {
				if(ispossible(grid,cr,cc,i)) {
					grid[cr][cc]=i;
					sudoku(grid, cr, cc+1);
					grid[cr][cc]=0;
				}
			}
		}
		
		
	}


	private static boolean ispossible(int[][] grid, int cr, int cc, int i) {
		// TODO Auto-generated method stub
		
		
		int r=0;
		while(r<9) {
			if(grid[r][cc]==i) {
				return false;
			}
			r++;
		}
		int c=0;
		while(c<9) {
			if(grid[cr][c]==i) {
				return false;
			}
			c++;
		}
		
		// 3*3
		int sr = cr- cr%3;
		int sc= cc- cc%3;
		
		
		for (int j = sr; j < sr+3; j++) {
			
			for (int j2 = sc; j2 < sc+3; j2++) {
				if(grid[j][j2]==i) {
					return false;
				}
			}
		}
		return   true;
	}


	private static void Display(int[][] grid) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < grid.length; i++) {
			
			for (int j = 0; j < grid.length; j++) {
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
	}

}
