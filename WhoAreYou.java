import java.util.Scanner;

public class WhoAreYou {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        String name, a;

        System.out.println("What's your name? ");
        name = keyboard.next();
        printName(name);
    }

    public static void printName(String a) {
        System.out.println("It's nice to meet you, " + a + ".");
    }
}
