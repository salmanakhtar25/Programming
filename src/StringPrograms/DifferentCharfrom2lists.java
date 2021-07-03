package StringPrograms;

import java.util.*;

public class DifferentCharfrom2lists {
	public static void main(String[] args) {
		String s1="hello";
		String s2="fellow";

		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();

		List<Character> list1=new ArrayList<>();
		for(char chars1:arr1){
			list1.add(chars1);
		}
		List<Character> list2=new ArrayList<>();
		for(char char2:arr2){
			list2.add(char2);
		}	

		Set<Character> set=new LinkedHashSet<>();			

		for(char char1:list1){
			if(!list2.contains(char1)){
				set.add(char1);
			}
		}
		for(char char2:list2){
			if(!list1.contains(char2)){
				set.add(char2);
			}
		}
		System.out.println(set);
	}


}


