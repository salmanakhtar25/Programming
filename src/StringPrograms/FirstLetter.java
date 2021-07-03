package StringPrograms;

public class FirstLetter {
      public static void main(String[] args) {
		String str="geek     for     geeks";
		String str1=" "+str;
		String str2 = str1.replaceAll("\\s+"," ");
		String modified="";
		for(int i=0;i<str2.length();i++){
			char chr = str2.charAt(i);
			if(chr==' '){
				i++;
				modified+=str2.charAt(i);
			}
		}
		
		System.out.println(modified);
    	  
    	  
	}
}
