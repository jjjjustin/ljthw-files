import java.util.ArrayList;

public class GenericsVsCasts {

	@SuppressWarnings("unchecked")
	public static void main( String[] args ) {
		ArrayList objarr = new ArrayList();

		objarr.add("one");
		objarr.add("two");
		objarr.add(5);
		objarr.add(16.5);

		Object aa = objarr.get(0);
		Object bb = objarr.get(1);
		Object cc = objarr.get(2);
		Object dd = objarr.get(3);

		// String qq = objarr.get(0);
		// String rr = objarr.get(1);

		String ss = (String)objarr.get(0);
		String tt = (String)objarr.get(1);
		int uu = (int)objarr.get(2);
		double vv = (double)objarr.get(3);

		System.out.println(aa + " " + bb + " " + cc + " " + dd + " " + " " + ss + " " + tt + " " + uu + " " + vv);

		System.out.println(objarr);

		// ---------------------------------------
		ArrayList<String> strarr = new ArrayList<>();
		strarr.add("one");
		strarr.add("two");

		String s = strarr.get(0);
		String t = strarr.get(1);

		System.out.println(strarr);

		Object a = strarr.get(0); // this also works, because Strings are Objects
		Object b = strarr.get(1);

		// ---------------------------------------
		Integer i = Integer.valueOf(123);
		objarr.add(i);

		System.out.println(objarr); // ["one", "two", 123] !!!

		// String uu = (String)objarr.get(2); // runtime ClassCastException

		// strarr.add(i); // won't compile
	}
}
