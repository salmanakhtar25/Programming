package StringPrograms;

public class FirstWordCapital {
	public static void main(String[] args) {
		String s="welcome to india";
		String str = " "+s;
		String modified="";
		
		for(int i=0;i<str.length();i++){
			char chr = str.charAt(i);
			if(chr==' '){
				modified+=chr;
				i++;
				char char0 = str.charAt(i);
				modified+=Character.toUpperCase(char0);
			}
			else{
				modified+=chr;
			}
		}
		String finalstring = modified.trim();
		System.out.println(finalstring);
	}

}
