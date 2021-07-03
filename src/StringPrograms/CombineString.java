package StringPrograms;

public class CombineString {
	public static void main(String[] args) {
		String s1="salman";
		String s2="sho";

		int longer;

		if(s1.length()>s2.length()){
			longer=s1.length();
		}
		else{
			longer=s2.length();
		}
		String combined="";

		for(int i=0;i<longer;i++){
			if(i<s1.length()){
				combined+=s1.charAt(i);
			}
			if(i<s2.length()){
				combined+=s2.charAt(i);
			}
			
		}
		System.out.println(combined);
	}

}
