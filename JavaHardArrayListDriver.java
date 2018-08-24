public class JavaHardArrayListDriver {
	public static void main(String[] args) {
		JavaHardArrayList<String> hats = new JavaHardArrayList<>();

		hats.add("fez");
		hats.add("bowler");
		hats.add("beanie");
		hats.add("western");
		hats.add("fedora");

		System.out.println( hats );

		String jumble = "";
		for ( int i=0; i<hats.size(); i++ ) {
			jumble += hats.get(i);
		}
		System.out.println("All together now: " + jumble);

		JavaHardArrayList<Integer> bins = new JavaHardArrayList<>();

		bins.add(Integer.valueOf(1));
		bins.add(Integer.valueOf(3));
		bins.add(Integer.valueOf(3));
		bins.add(Integer.valueOf(1));

		bins.add(2, 2);
		bins.add(4);
		bins.add(6);
		bins.add(4);
		bins.add(8, 1);

		System.out.println( bins );

		int total = 0;
		for ( int i=0; i<bins.size(); i++ ) {
			total += bins.get(i);
		}
		System.out.println("The total is " + total);

		JavaHardArrayList<Character> letters = new JavaHardArrayList<>();
		letters.add('z'); // auto-boxes char

		JavaHardArrayList<Double> weights = new JavaHardArrayList<>();
		weights.add(0.14); // auto-boxes double

		JavaHardArrayList<Boolean> dealt = new JavaHardArrayList<>();
		while ( dealt.size() < 52 )
			dealt.add(false); // auto-boxes boolean
	}
}
