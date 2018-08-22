import java.io.FileInputStream;
import java.net.URL;
import java.io.InputStream;

public class IBeforeEDriver {
	public static void main( String[] args ) throws Exception {
		String url = "http://www.gutenberg.org/cache/epub/57726/pg57726.txt";
		InputStream file = new URL(url).openStream();
		IBeforeEChecker check = new IBeforeEChecker( file );
		System.out.println( check.getWordCount() + " ie/ei words found.");
		System.out.print( "\t" + check.getMatches() + " match the rule. ");
		System.out.print( check.getExceptions() + " do not...");
		System.out.print(100.0*check.getMatches()/check.getWordCount() + "%");
		System.out.print( check.getWordList() );
	}
}

