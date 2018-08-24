import java.util.ArrayList;
import java.util.Scanner;

public class PersonDriver {
	public static void main( String [] args ) {
		String name, favoriteFood;
		int age;
		Scanner keyboard = new Scanner(System.in);


		System.out.println("Welcome to the Person Builder. Please enter your name.");
		name = keyboard.nextLine();

		System.out.println("Thank you. Please enter your age now.");
		age = Integer.parseInt(keyboard.nextLine());

		System.out.println("Perfect. Now, what is your favorite food?");
		favoriteFood = keyboard.nextLine();

		Person p = new Person(name, age, favoriteFood);
		System.out.println(p);



	}
}