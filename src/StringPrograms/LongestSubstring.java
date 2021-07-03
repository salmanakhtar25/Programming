package StringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstring {
	public static void main(String[] args) {
		String s="salmanakhtarkhan";
		String LongestSubstr="";
		int lenoflongestsubstr=0;

		Map<Character,Integer> map=new LinkedHashMap<>();

		char[] arr=s.toCharArray();

		for(int i=0;i<arr.length;i++){
			char ch=arr[i]; 
			if(!map.containsKey(ch)){
				map.put(ch,i);
			}
			else{
				i=map.get(ch);
				map.clear();
			}
			if(map.size()>lenoflongestsubstr){
				lenoflongestsubstr=map.size();
				LongestSubstr=map.keySet().toString();
			}
		}
		System.out.println(lenoflongestsubstr);
		System.out.println(LongestSubstr);
	}

}
