package mypackage.com;

public class Tic_tac_toe {
	public static void main(String[] args) {

		/**
		 * Notes: _ | _ | _ _ | _ | _ | | Helpful indices [0][0] , [0][2] , [0][4]
		 * [1][0] , [1][2] , [1][4] [2][0] , [2][2] , [2][4]
		 * 
		 **/

		char[][] gameBoard = { { '_', '|', '_', '|', '_' }, { '_', '|', '_', '|', '_' }, { ' ', '|', ' ', '|', ' ' } };

		printBoard(gameBoard);

	}

	public static void printBoard(char[][] gameBoard) {

		for (char[] row : gameBoard) {
			for (char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
