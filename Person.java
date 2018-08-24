public class Person {
	private String name, favoriteFood;
	private int age;

	public Person( String name, int age, String favoriteFood ) {
		this.name = name;
		this.age = age;
		this.favoriteFood = favoriteFood;
	}

	public String toString() {
		return name + " is " + age + " years old and likes " + favoriteFood + ".";
	}
}