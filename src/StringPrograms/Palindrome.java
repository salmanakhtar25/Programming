package StringPrograms;

public class Palindrome {

	public static void isPalindrome(String s){
		String rev="";
		for(int i=s.length()-1;i>=0;i--){
			rev+=s.charAt(i);
		}
		System.out.println(rev);
		if(s.equals(rev)){
			System.out.println("string is palindrome");
		}
		else{
			System.out.println("string is not palindrome");
		}
	}

	public static void main(String[] args) {
		isPalindrome("malayalam");
	}
}
