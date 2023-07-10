package LongestPalindromicSubstring;

public class LongestPalindrome {

	public static String palindrome(String str) {
		 int maxPalinLength =0;
		 String longestPalindrome = null;
		 int length = str.length();
		 
		 //check all possible sub strings
		 for(int i=0; i<length; i++) {
			 for(int j=i+1; j<length; j++) {
				 int len = j-i;
				 String curr = str.substring(i, j+1);
				 if(isPalindrome(curr)) {
					 if(len > maxPalinLength) {
						 longestPalindrome = curr;
						 maxPalinLength = len;
					 }
				 }
			 }
		 }
		 
		 return longestPalindrome;
	}
	
	public static boolean isPalindrome(String str) {
		for(int i=0; i < str.length(); i++) {
			if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(palindrome("abererererercdcasdasdvasasasxdadaasscasdedeba"));
	}

}
