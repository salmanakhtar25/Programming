package StringPrograms;

public class CaseChangeAlphabets {
	
	public static void main(String[] args) {
		String str="ABCDabcd";
		
		
		String ans="";
		for(int i=0;i<str.length();i++){
			int ascii = str.charAt(i);
			if(ascii>=65 && ascii<=90){     //ascii value range for capital letters
				ans+=Character.toLowerCase(str.charAt(i));
			}
			else{
				ans+=Character.toUpperCase(str.charAt(i));
			}
		}
		System.out.println(ans);
	}

}
