package edu.jsu.mcis;

public class TicTacToeModel {
	boolean winnerHorizontal;
	boolean noWinnerTie;
	int myTurn = 0;
	public enum WinnerStatus{NONE, X, O, TIE};
	private WinnerStatus winner;
	private int[][] grid;
	
	public TicTacToeModel() {
		grid = new int[3][3];
	}
	
	public String getMark(int row, int col) {
		if(grid[row][col] == 0) return "";
		else if(grid[row][col] == 1) return "X";
		else return "O";
	}
	
	public void makeMark(String mark, int row, int col) {
		if(grid[row][col] == 0) {
			if(mark.equals("X")) grid[row][col] = 1;
			else if(mark.equals("O")) grid[row][col] = 2;
			else if(mark.equals("")) grid[row][col] = 0;
		}
	}
	public boolean gameStillRunning(){
		if(myTurn == 9){
			return true;
		}
		else return false;
		
	}
	public boolean checkForHorizontalWinner(){
		
		for(int g = 0; g < 3; g++){
			if(getMark(0, g).equals("X") || getMark(0, g).equals("O")){
				winnerHorizontal = true;
			
			}
			else if(getMark(1, g).equals("X") || getMark(1, g).equals("O")){
				winnerHorizontal = true;
				
			}
			else if(getMark(2, g).equals("X") || getMark(2, g).equals("O")){
				winnerHorizontal = true;
				
		
			}
			else{
				winnerHorizontal = false;
			}
			
		}
		return winnerHorizontal;
	}
	public boolean checkForNoWinnerTie(){
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
			if(grid[i][j] == 2){
				noWinnerTie = false;
			}
		}
		
		}
		
		return true;
	}
	
	
	/*public void checkForTie(){
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(("X" || "O"), model.getMark(i, j)
			}
		}
		
	}
	public String getWinner(){
		return "X";
	}
	public void checkIfLocationAlreadyHasAmark(){
		
	}
	public class TicTacToeModel {
 	 public enum positionState {Blank, X, O, TIE};
 	 private int n = 3;
 	 private positionState[][] boardArray = new positionState[n][n];
 	 private int moveCounter;
 	 private positionState turn;
 	 
 	public TicTacToeModel() {
 		initializeBoard();
 		turn = positionState.X;
 		moveCounter = 0;
 	}
 
 	public void initializeBoard() {
		for (int i = 0; i < boardArray.length; i++) {
 			for (int j = 0; j < boardArray[0].length; j++) {
 				boardArray[i][j] = positionState.Blank;
 			}
 		}
 	}
 	
 	public void playerMark(int row, int column) {
 		if (row >= 0 && row <= 2 && column >= 0 && column <= 2) {
 			if (boardArray[row][column] == positionState.Blank) {
 				boardArray[row][column] = turn;
 			moveCounter++;
 				if(turn == positionState.X) turn = positionState.O;
 				else turn = positionState.X;
 			}
 		}
 	}*/
 	
 	/*public positionState checkWinner() {
 		if(boardArray[0][0] == boardArray[1][1] && boardArray[1][1] == boardArray[2][2]) 
 			return boardArray[0][0];
 		else if(boardArray[0][0] == boardArray[0][1] && boardArray[0][1] == boardArray[0][2]) 
 			return boardArray[0][0];
 		else if(boardArray[1][0] == boardArray[1][1] && boardArray[1][1] == boardArray[1][2]) 
 			return boardArray[1][0];
 		else if(boardArray[2][0] == boardArray[2][1] && boardArray[2][1] == boardArray[2][2]) 
 			return boardArray[2][0];
 		else if(boardArray[0][0] == boardArray[1][0] && boardArray[1][0] == boardArray[2][0]) 
 			return boardArray[0][0];
 		else if(boardArray[0][1] == boardArray[1][1] && boardArray[1][1] == boardArray[2][1]) 
 			return boardArray[0][1];
 		else if(boardArray[0][2] == boardArray[1][2] && boardArray[1][2] == boardArray[2][2]) 
 			return boardArray[0][2];
 		else if(boardArray[0][2] == boardArray[1][1] && boardArray[1][1] == boardArray[2][0]) 
			return boardArray[0][2];
 		else if(moveCounter == 9) 
 			return positionState.TIE;
 		else return positionState.Blank;
 	}
 	
 	/*public positionState getTurn() {
 		return turn;
 	}
 	
 	public positionState getBoardAt(int row, int col) {
 		return boardArray[row][col];
 	}*/
  } 














