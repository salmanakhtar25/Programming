package StringPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CountEachCharacter {
     public static void main(String[] args) {
		String s="salmanhaider";
		char[] alphabets = s.toCharArray();
		Map<Character,Integer> map=new HashMap<>();
		
		char[] arr={'a','e','i','o','u'};
		
		List<Character> lst=new ArrayList<>();
		for(int i=0;i<arr.length;i++){
			lst.add(arr[i]);
		}
		for(int i=0;i<alphabets.length;i++){
			if(!map.containsKey(alphabets[i]) && lst.contains(alphabets[i])){
				map.put(alphabets[i], 1);
			}
			else{
				if(lst.contains(alphabets[i])){
				map.put(alphabets[i], map.get(alphabets[i])+1);
				}
				}
		}
		
		Set<Character> keys=map.keySet();
		
		for(char key:keys){
			System.out.println(key+":"+map.get(key));
		}
		
		
	}
}

