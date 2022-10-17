import java.util.ArrayList;

public class Pangram {
	
	public static final char[] ALPHABET = new char[] {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	private boolean[] UsedLetter = new boolean[26];
	private ArrayList<String> array = new ArrayList<String>();
	private ArrayList<String> combination = new ArrayList<String>(); //records the combo of words
	
	public Pangram(ArrayList<String> a) {
		array = a; //when you modify the array you modify the original list;
	}
	
	private boolean noRepLetter(String word) {
		for (int i = 0; i < word.length(); i ++) { //loop through the word
			int index = indexInAlphabet(word.charAt(i)); //find the place in alphabet for each character of the word 
			if (UsedLetter[index]) { //if the character has already been used return false 
				return false;
			}
		}
		return true; //if no character in this word uses char already used return true 
	}
	
	private int indexInAlphabet(char x) {//basic indexOf() function for ALPHABET
		for (int i = 0; i < ALPHABET.length; i ++) {
			if (ALPHABET[i] == x) {
				return i;
			}
		}
		return -1;
	}

	private void updateUsedLetter(String word) {//removes or adds in a letters from words 
		for (int i = 0; i < word.length(); i ++) {
			int index = indexInAlphabet(word.charAt(i)); //find the place in alphabet for each character of the word 
			if (UsedLetter[index]) {
				UsedLetter[index] = false;
			}
			else {
				UsedLetter[index] = true;
			}
		}
	}
	
	public void findNextWord(int level, int startIndex) { //find the next word compatible
		//level starts from 0 and goes to 4! 
		//start Index is inclusive
		
		//display finding next word!
		/*
		for (int i = 0; i < combination.size(); i ++) {
			System.out.print(combination.get(i) + "   ");
		}
		System.out.println();
		*/
		
		if (level == 4) {
			for (int i = 0; i < combination.size(); i ++) {
				System.out.print(combination.get(i) + "   ");
			}
			System.out.println();
		}
		
		if (level == 5) {
			System.out.println("Combo: ");
			for (int i = 0; i < combination.size(); i ++) {
				System.out.print(combination.get(i) + "   ");
			}
			return;
		}
		
		if (startIndex < array.size()) {
			for (int i = startIndex; i < array.size(); i ++) {
				String word = array.get(i);
				if (noRepLetter(word)) { //if this word indeed qualifies
					combination.add(word);
					updateUsedLetter(word);
					findNextWord(level + 1, i + 1);
					break;
				}
				
				if (i == (array.size() - 1)) { //last value + still didn't find a valid word
					String previousWord = combination.get(combination.size() - 1);
					updateUsedLetter(previousWord);
					int position = array.indexOf(previousWord);
					combination.remove(combination.size() - 1);
					findNextWord(level - 1, position + 1);
				}
			}
		}
		
		else { //if the start Index is wrong then go up another level
			String previousWord = combination.get(combination.size() - 1);
			updateUsedLetter(previousWord);
			int position = array.indexOf(previousWord);
			combination.remove(combination.size() - 1);
			findNextWord(level - 1, position + 1);
		}
		

	}
	
	
	
	
}
