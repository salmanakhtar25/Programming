package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class MaxOccuringChar {
	public static void main(String[] args) {
		String str="Beginning";

		char[] arr = str.toCharArray();

		Map<Character,Integer> map=new HashMap<Character,Integer>();

		int maxcount=0;
		char maxOccChar=' ';
		for(int i=0;i<arr.length;i++){
			if(!map.containsKey(arr[i])){
				map.put(arr[i], 1);
			}
			else {
				map.put(arr[i], map.get(arr[i])+1);
			}


			for(char key:map.keySet()){
				if(map.get(key)>maxcount){
					maxcount=map.get(key);
					maxOccChar=key;
				}
			}
		}
		System.out.println("max repeating char is "+maxOccChar+" and is repeated "+maxcount+" times");
	}
}