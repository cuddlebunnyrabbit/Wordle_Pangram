import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("NoTwoVowels.txt"));
		ArrayList<String> words = new ArrayList<String>();
		
		while (sc.hasNext()){ //excludes words with repeat letters in our test
				words.add(sc.next());
			
		}
		sc.close();
		System.out.println("terminated load");

		Pangram pangram = new Pangram(words);
		
		pangram.findNextWord(0, 0);
	}
	
	

}
