package cp213;

/**
 * @author Michael Marsillo 169057769
 * @version 2024-09-01
 */
public class Strings {
    // Constants
    public static final String VOWELS = "aeiouAEIOU";

    /**
     * Determines if string is a "palindrome": a word, verse, or sentence (such as
     * "Able was I ere I saw Elba") that reads the same backward or forward. Ignores
     * case, spaces, digits, and punctuation in the string parameter s.
     *
     * @param string a string
     * @return true if string is a palindrome, false otherwise
     */
    public static boolean isPalindrome(final String string) {

	// your code here
	int left = 0;
	int right = string.length() - 1;

	while (left < right) {
	    while (left < right && !Character.isLetter(string.charAt(left))) {
		left++;
	    }

	    while (left < right && !Character.isLetter(string.charAt(right))) {
		right--;
	    }

	    if (Character.toLowerCase(string.charAt(left)) != Character.toLowerCase(string.charAt(right))) {
		return false;
	    }

	    left++;
	    right--;
	}

	return true;
    }

    /**
     * Determines if name is a valid Java variable name. Variables names must start
     * with a letter or an underscore, but cannot be an underscore alone. The rest
     * of the variable name may consist of letters, numbers and underscores.
     *
     * @param name a string to test as a Java variable name
     * @return true if name is a valid Java variable name, false otherwise
     */
    public static boolean isValid(final String name) {

	// your code here
	boolean valid = true;

	if (!Character.isLetter(name.charAt(0)) && name.charAt(0) != '_') {
	    valid = false;
	}

	for (int i = 1; i < name.length(); i++) {
	    char ch = name.charAt(i);
	    if (!Character.isLetterOrDigit(ch) && ch != '_') {
		valid = false;
	    }
	}

	return valid;
    }

    /**
     * Converts a word to Pig Latin. The conversion is:
     * <ul>
     * <li>if a word begins with a vowel, add "way" to the end of the word.</li>
     * <li>if the word begins with consonants, move the leading consonants to the
     * end of the word and add "ay" to the end of that. "y" is treated as a
     * consonant if it is the first character in the word, and as a vowel for
     * anywhere else in the word.</li>
     * </ul>
     * Preserve the case of the word - i.e. if the first character of word is
     * upper-case, then the new first character should also be upper case.
     *
     * @param word The string to convert to Pig Latin
     * @return the Pig Latin version of word
     */
    public static String pigLatin(String word) {

	// your code here
	if (VOWELS.indexOf(word.charAt(0)) != -1) {
	    return word + "way";
	}

	String pigLatinWord = word.substring(1) + word.charAt(0) + "ay";

	if (Character.isUpperCase(word.charAt(0))) {
	    pigLatinWord = pigLatinWord.substring(0, 1).toUpperCase() + pigLatinWord.substring(1).toLowerCase();
	}

	return pigLatinWord;
    }
}