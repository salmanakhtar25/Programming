package StringPrograms;

public class CountCharacterOccurence {

	public static void main(String[] args) {

		String str="Java is object oriented language";

		int result=str.length()-str.replace("a", "").length();
		System.out.println("occurence of a is "+result+" times");

	}

}
