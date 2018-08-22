public class Fish {
	private String name;
	private int id;
	private static int count = 0;

	public Fish( String name ) {
		this.name = name;
		count++;
		id = count;
	}

	public String toString() {
		return name + ", fish #" + id + " of " + count;
	}

	public static int numCreated() {
		return count;
	}
}
