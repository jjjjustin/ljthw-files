import java.util.Scanner;

public class TicTacToe {
	public static void main( String[] args ) {
		String a, b, c, d, e, f, g, h, i, play;
		Scanner keyboard = new Scanner(System.in);
		int next;
		boolean won = false;
		boolean turn = false;

		a = b = c = d = e = f = g = h = i = " ";

		System.out.print("Would you like to play Tic Tac Toe? (Y/N) ");
		play = keyboard.next();

		
		if (play.equals("Y") || play.equals("y")) {
			System.out.println("\n");
			System.out.println("\nOK, let's begin the game!");

			while (won == false) {

				System.out.println("\nHere's the current board:");
				System.out.println("\n");
				System.out.println(" "+a+" "+"|"+" "+b+" "+"|"+" "+c+" ");
				System.out.println(" ---------");
				System.out.println(" "+d+" "+"|"+" "+e+" "+"|"+" "+f+" ");
				System.out.println(" ---------");
				System.out.println(" "+g+" "+"|"+" "+h+" "+"|"+" "+i+" ");

				if (turn == false) {

					System.out.println("\nIt's X's turn - please select a number between 1 and 9:");
					System.out.println("\n");
					System.out.println(" "+1+" "+"|"+" "+2+" "+"|"+" "+3+" ");
					System.out.println(" ---------");
					System.out.println(" "+4+" "+"|"+" "+5+" "+"|"+" "+6+" ");
					System.out.println(" ---------");
					System.out.println(" "+7+" "+"|"+" "+8+" "+"|"+" "+9+" ");
					System.out.println("\n");

					next = keyboard.nextInt();
					System.out.println("You choose " + next + ".");
					if (next == 1) {
						a = "X";
					} else if (next == 2) {
						b = "X";
					} else if (next == 3) {
						c = "X";
					} else if (next == 4) {
						d = "X";
					} else if (next == 5) {
						e = "X";
					} else if (next == 6) {
						f = "X";
					} else if (next == 7) {
						g = "X";
					} else if (next == 8) {
						h = "X";
					} else if (next == 9) {
						i = "X";
					}

					System.out.println("\n");
					System.out.println(" "+a+" "+"|"+" "+b+" "+"|"+" "+c+" ");
					System.out.println(" ---------");
					System.out.println(" "+d+" "+"|"+" "+e+" "+"|"+" "+f+" ");
					System.out.println(" ---------");
					System.out.println(" "+g+" "+"|"+" "+h+" "+"|"+" "+i+" ");
					turn = true;

					if (	(a.equals("X") && a.equals(b) && b.equals(c)) || 
							(a.equals("X") && a.equals(d) && d.equals(g)) || 
							(a.equals("X") && a.equals(e) && e.equals(i)) ||
							(b.equals("X") && b.equals(e) && e.equals(h)) ||
							(c.equals("X") && c.equals(e) && b.equals(g)) ||
							(c.equals("X") && c.equals(f) && f.equals(i)) ||
							(d.equals("X") && d.equals(e) && e.equals(f)) ||
							(g.equals("X") && g.equals(h) && h.equals(i))
					   ) {
						won = true;
					}


				} else {
					System.out.println("\nO goes next - please select a number between 1 and 9:");
					System.out.println("\n");
					System.out.println(" "+1+" "+"|"+" "+2+" "+"|"+" "+3+" ");
					System.out.println(" ---------");
					System.out.println(" "+4+" "+"|"+" "+5+" "+"|"+" "+6+" ");
					System.out.println(" ---------");
					System.out.println(" "+7+" "+"|"+" "+8+" "+"|"+" "+9+" ");
					System.out.println("\n");

					next = keyboard.nextInt();
					System.out.println("You choose " + next + ".");
					if (next == 1) {
						a = "O";
					} else if (next == 2) {
						b = "O";
					} else if (next == 3) {
						c = "O";
					} else if (next == 4) {
						d = "O";
					} else if (next == 5) {
						e = "O";
					} else if (next == 6) {
						f = "O";
					} else if (next == 7) {
						g = "O";
					} else if (next == 8) {
						h = "O";
					} else if (next == 9) {
						i = "O";
					}

					System.out.println("\n");
					System.out.println(" "+a+" "+"|"+" "+b+" "+"|"+" "+c+" ");
					System.out.println(" ---------");
					System.out.println(" "+d+" "+"|"+" "+e+" "+"|"+" "+f+" ");
					System.out.println(" ---------");
					System.out.println(" "+g+" "+"|"+" "+h+" "+"|"+" "+i+" ");
					turn = false;

					if (	(a.equals("O") && a.equals(b) && b.equals(c)) || 
							(a.equals("O") && a.equals(d) && d.equals(g)) || 
							(a.equals("O") && a.equals(e) && e.equals(i)) ||
							(b.equals("O") && b.equals(e) && e.equals(h)) ||
							(c.equals("O") && c.equals(e) && b.equals(g)) ||
							(c.equals("O") && c.equals(f) && f.equals(i)) ||
							(d.equals("O") && d.equals(e) && e.equals(f)) ||
							(g.equals("O") && g.equals(h) && h.equals(i))
					   ) {
						won = true;
					}
				}
			}

			System.out.println("\nThe game is over!");

		} else {
			System.out.println("Not a problem, see you next time!");
		}
	}
}