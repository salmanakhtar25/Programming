package StringPrograms;

public class ReverseEachWord {

	public static void main(String[] args) {

		String str="How are you";

		String[] arr = str.split(" ");

		String result="";

		for(String word:arr){
			String reverseword="";

			for(int i=word.length()-1;i>=0;i--){
				reverseword+=word.charAt(i);
			}
			result+=reverseword+" ";
		}

		System.out.println(result);
	}
}
