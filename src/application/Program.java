package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		// jogo de chadrez

		Scanner sc = new Scanner(System.in);
		ChessMatch match = new ChessMatch();

		while (true) {
			try {
				UI.clearScreen();
				UI.printBoard(match.getPieces());
				System.out.println();
				System.out.print("source : ");
				ChessPosition source = UI.readChessPosition(sc);

				System.out.println();
				System.out.print("target : ");
				ChessPosition target = UI.readChessPosition(sc);

				ChessPiece capturedPiece = match.performChessMove(source, target);
			} catch (ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}

			catch (InputMismatchException d) {
				System.out.println(d.getMessage());
				sc.nextLine();
			}

		}
	}

}
