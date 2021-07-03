package StringPrograms;

import java.util.*;

public class Panagramstring {
	public static boolean isPanagram(String str){
		List<Character> list=new ArrayList<>();
		for(char i='a';i<='z';i++){
			list.add(i);
		}   

		String str1 = str.toLowerCase();

		char[] chars = str1.toCharArray();
		Set<Character> set=new TreeSet<>();

		for(char char1:chars){
			set.add(char1);

		}
		if(set.containsAll(list)){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String[] args) {
		String s="The Quick Brown Fox Jumps Over a lazy dog";
		System.out.println(isPanagram(s));

	}
}