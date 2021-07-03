package StringPrograms;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordsinList {
	public static void main(String[] args) {
		
	
	String[] arr={"abc","bcd","cde"};
	List<String> lst=new ArrayList<>();

	for(String words:arr){
		String reverse="";
		for(int i=words.length()-1;i>=0;i--){
			char chars = words.charAt(i);
			reverse+=chars;
		}
		lst.add(reverse);
	}
	System.out.println(lst);
}
}