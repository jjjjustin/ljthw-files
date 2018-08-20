import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class CaesarCipher {
    /**
     * Returns the character shifted by the given number of letters
    */
    public static char shiftLetter(char c, int n) {
    	int u = c;

    	if (!Character.isLetter(c))
    		return c;

    	u = u + n;
    	if ( Character.isUpperCase(c) && u > 'Z' || 
    		 Character.isLowerCase(c) && u > 'z') {
    		u -= 26;
    	}
    	if ( Character.isUpperCase(c) && u < 'A' || 
    		 Character.isLowerCase(c) && u < 'a') {
    		u += 26;
    	}

    	return (char)u;
    }

    public static void main(String[]args) throws Exception {
    	Scanner keyboard = new Scanner(System.in);
    	String plaintext, cipher = ""; 
    	String saveFileName, newFileName;
    	int shift;


    	System.out.println("Welcome to the Caesar Cipher. Please enter the name of the file you'd like to use: ");
    	saveFileName = keyboard.next();

    	File f = new File(saveFileName);
    	if (f.exists() && f.length() > 0) {
    		Scanner input = new Scanner(f);
    			plaintext = input.nextLine();
    		input.close();
    		System.out.println("The input text reads: " + plaintext);

    	}
    	else {
    		System.out.println("This file does not exist, or is empty");
    		System.out.print("Please enter text to translate here instead: ");
    		plaintext = keyboard.nextLine();
    	}

    	System.out.print("Shift (0-26): ");
    	shift = keyboard.nextInt();

    	for (int i=0; i<plaintext.length(); i++) {
    		cipher += shiftLetter(plaintext.charAt(i), shift);
    	}
    	System.out.println(cipher);

        System.out.println("We'll save this to a new file.");
        System.out.println("Please enter the filename here: ");
        newFileName = keyboard.next();

    	PrintWriter out = new PrintWriter(newFileName); 
    		out.println(cipher); 
    	out.close();

    }
}
