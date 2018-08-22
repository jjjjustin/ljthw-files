import java.util.Scanner;

public class StringFunFunctionalShort {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a message: ");
		System.out.println(camelCase(reverse(keyboard.nextLine())));
	}

	public static String reverse( String s ) {
		String rev = "";
		for ( int i=s.length()-1; i>=0; i-- )
			rev += s.substring(i,i+1);

		return rev;
	}

	public static String camelCase( String s ) {
		String[] words = s.toLowerCase().split(" ");
		String result = "";
		for ( String w : words )
			result += w.substring(0,1).toUpperCase() + w.substring(1);

		return result;
	}
}

