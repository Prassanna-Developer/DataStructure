import java.util.Scanner;


public class Sudoku {
	
	
	private static int[][] board = new int[9][9];
	
	
	public static void main(String[] args) {
		
		Scanner  scanner = new Scanner(System.in);
		createInitialBoard(scanner);
		printBoard();
		
		System.out.println("Solved State");
		if(solve(1,0,0)) printBoard();
		else System.out.println("failed");
		
	}

	private static boolean  solve(int number,int i, int j) {
		
		int[] openCell = findOpenCell(i,j);
		
		if(openCell == null) return false;
		 
		int xPosition = openCell[0];
		int yPosition = openCell[1];
		
		for(int currentNumber = findNumber(number,xPosition,yPosition); currentNumber!=-1;currentNumber = findNumber(currentNumber+1, xPosition, yPosition)){
			
			
			if(xPosition > 8){
				solve(1,0, yPosition+1);
			}
			else{
				solve(currentNumber,xPosition+1, yPosition);
			}
			
			if(isDone()) return true;
			else solve(1,0, yPosition+1);
			
		}
		
		return false;
		
	}

	private static int findNumber(int number, int xPosition, int yPosition) {
		if(number > 9) return -1;
		if(checkRow(number,xPosition) && checkColumn(number,yPosition) && checkBox(number,xPosition,yPosition)){
			board[xPosition][yPosition] = number;
			return number;
		}
		return findNumber(number+1, xPosition, yPosition);
	}

	private static boolean checkBox(int number, int xPosition, int yPosition) {
		
		int i= (xPosition / 3) * 3;
		int j = (yPosition / 3) * 3;
		
		for(int row = i ; row < i+3; row++){
			for(int column = j ; column < j+3; column ++){
				if(board[row][column] == number ) return false;
			}
		}
		return true;
	}

	private static boolean checkColumn(int number, int yPosition) {
		for(int row =0;row < 9;row ++){
			if(board[row][yPosition] == number) return false;
		}
		return true;
	}

	private static boolean checkRow(int number, int xPosition) {
		for(int column = 0;column<9;column++){
			if(board[xPosition][column] == number )  return false;
		}
		return true;
	}

	private static int[] findOpenCell(int i, int j) {
		for(int row=i;row<9;row++){
			for(int column =j;column < 9 ; column ++){
				 if(board[row][column] == 0) return new int[]{row,column};
			}
		}
		return null;
	}

	private static  void createInitialBoard(Scanner scanner) { 
		for(int x=0;x<9;x++){
			System.out.println("Enter the Values: ");
			for(int y=0;y<9;y++){
				board[x][y]  = 0;
			}
		}
	}
	
	public static void printBoard(){
		for(int x=0; x <9;x++){
			if(x%3==0) System.out.println("");
			for(int y=0;y<9;y++){
				if(y%3 ==0 ) System.out.print(" ");
				System.out.print(board[x][y] + " ");
				
			}
			System.out.println("");
		}
		System.out.println("-------------------------------------------------");
	}
	
	public static boolean isDone(){
		for(int row=0;row<9;row++){
			for(int column=0;column<9;column++){
				if(board[row][column] == 0){
					return false;
				}
			}
		}
		
		return true;
	}
	

}
