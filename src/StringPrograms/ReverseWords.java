package StringPrograms;

public class ReverseWords {

	public static void main(String[] args) {

		String str="We are learning java";

		String[] arr = str.split(" ");
		String reverse="";
		for(int i=arr.length-1;i>=0;i--){

			reverse+=(arr[i]+" ");
		}
		String finalstring = reverse.trim();
		System.out.print(finalstring);
	}
}
