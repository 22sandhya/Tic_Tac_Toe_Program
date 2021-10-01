
public class TicTacToe {

		static char[] board = new char[10];

		public static void main(String[] args) {
			System.out.println("Welcome to Tic Tac Toe Program !");
			createBoard();
		}

		public static void createBoard() {
			for (int i = 1; i < 10; i++) {
				board[i] = ' ';
			}
		}
	}
