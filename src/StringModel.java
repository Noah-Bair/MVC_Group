public class StringModel {
	String string_combined;
	String string_reverse;
	StringBuilder input1 = new StringBuilder();

	public void StringCombine(String firstString, String secondString) {
		string_combined = firstString + " " + secondString;
	}

	public String getString() {
		return string_combined;
	}

	public void reverseString(String rString) {
		input1.append(rString);
		input1 = input1.reverse();
		string_reverse = input1.toString();
		input1.delete(0, input1.length());
	}

	public String reverse() {
		return string_reverse;
	}
	
	public String palindrome(String pString) {
		int len = pString.length();
		for (int i = 0; i < len; i++) {
			if (pString.charAt(i) != pString.charAt(len-i-1)) return "Not a palindrome!";
		}
		return "Palindrome!";
	}
}