package lab2;

/**
 * A class that provides several methods to manipulate strings.
 * @author srollins
 *
 */
public class StringManipulations {

	/**
	 * Returns a count of the number of times the character
	 * c appears in the String original.
	 * 
	 * Example: "hello there", 'e' -> 3
	 * Example: "hello there", 'z' -> 0
	 * 
	 * @param original
	 * @param c
	 * @return
	 */
	public int countChars(String original, char c) {
		//TODO: Replace with your code.
		return -1;
	}
	
	/**
	 * Returns the reverse of the String original.
	 * 
	 * Example: "hello" -> "olleh"
	 * Example: "The cat ran." -> ".nar tac ehT"
	 * 
	 * For full credit, you may *not* use arrays or StringBuffer.
	 * You may use only the String methods length() and charAt(i).
	 * 
	 * @param original
	 * @return
	 */
	public String reverse(String original) {
		//TODO: Replace with your code.
		return null;
	}
		
	/**
	 * Returns the length of the longest word in a given sentence.
	 * 
	 * Example: "I love CS" returns 4 (length of 'love')
	 * Example: "Hi, there!" returns 6 (length of 'there!')
	 * 
	 * Any whitespace character (spaces, tabs, etc) separates words.
	 * For full credit, solution may *only* use the following methods:
	 * String .length()
	 * String .charAt(index)
	 * Character.isWhitespace(character)
	 * 
	 * @param original
	 * @return
	 */
	public int longestWord(String original) {
		//TODO: Replace with your code.
		return -1;
	}
	
	/**
	 * Shifts the original String by amount characters to the left.
	 * 
	 * Example: "I love CS", 2 -> "love CSI "
	 * Example: "Winter is coming!", 9 -> " coming!Winter is"
	 *   
	 * Returns null if amount is greater than the length of the original.  
	 * 
	 * @param original
	 * @param amount
	 * @return
	 */
	public String shiftLeft(String original, int amount) {
		//TODO: Replace with your code.
		return null;
	}
	
	/**
	 * Returns a string such that the ith word of the new string
	 * is the first character of the ith word in the string original
	 * repeated the for each character in the ith word of the original.
	 * Assume that any whitespace separates words.
	 *
	 * Examples: 
	 *   - input: "I love CS"
	 *   - output: "I llll CC"
	 *   
	 *   - input: "Stop\twhat's that sound?"
	 *   - ouput: "SSSS	wwwwww tttt ssssss"
	 *   
	 * Hints: 
	 *   - The character '\0' is the null character.
	 * 
	 * @param original
	 * @return
	 */
	public String repeater(String original) {
		//TODO: Replace with your code.
		return null;
	}
	
	/**
	 * Returns a new String that contains the characters of the original 
	 * string but without duplicates.
	 * 
	 * Example: "abc" -> "abc"
	 * Example: "abcb" -> "abc"
	 * Example: "Winter is coming!" ->  "Winter scomg!"
	 * 
	 * For full credit, youmay only use the String methods
	 * length() and charAt(i).
	 * 
	 * You may not use arrays or any other libraries.
	 * 
	 * @param original
	 * @return
	 */
	public String removeDuplicates(String original) {
		//TODO: Replace with your code.
		return null;
	}	
}
