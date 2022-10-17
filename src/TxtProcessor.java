import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TxtProcessor {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		/* This block was used to process text and remove words w rep letters and write it into norep 
		Scanner sc = new Scanner(new File("Text.txt"));
		PrintWriter out = new PrintWriter(new File("NoRep.txt"));
		
		while (sc.hasNext()){ //exdes words with repeat letters in our test
			
			
			String word = sc.next();
	
			boolean suitable = true;
			
			for (int i = 0; i < word.length() - 1; i++){ //i can go from 0, 1, 2, 3 but not 4. checks if there are repeat letters
				for (int j = i + 1; j < word.length(); j ++){ //j can go from i up to 4 
					if (word.charAt(i) == word.charAt(j)) {
						i = 6;
						j = 6; //get out of loop
						suitable = false;
					}
				}
			}
			
			if (suitable){
				out.println(word);
			}
		}
		sc.close();
		out.close();
		System.out.println("terminated");
		*/
		
		/* Used to create no 3 vowels and no 2 vowels in order to make big assumptions that cut down on calculations
		Scanner sc = new Scanner(new File("NoThreeVowels.txt"));
		PrintWriter out = new PrintWriter(new File("NoTwoVowels.txt"));
		
		while (sc.hasNext()){ //exdes words with repeat letters in our test
			
			String word = sc.next();
			int vowelCount = 0;
	
			for (int i = 0; i < word.length(); i ++) {
				if (word.charAt(i) == 'A' || 
					word.charAt(i) == 'E' || 
					word.charAt(i) == 'I' ||
					word.charAt(i) == 'O' ||
					word.charAt(i) == 'U') {
					vowelCount ++;
				}
			}
			
			if (vowelCount <= 1){
				out.println(word);
			}
		}
		sc.close();
		out.close();
		System.out.println("terminated");
		*/
		
		 
	}

}
