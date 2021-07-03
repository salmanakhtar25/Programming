package StringPrograms;
import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {

	public static void main(String[] args) {

		String str="Beginning";

		char[] arr = str.toCharArray();

		Map<Character,Integer> map=new HashMap<Character,Integer>();

		int count=1;

		for(int i=0;i<arr.length;i++){
			if(!map.containsKey(arr[i])){
				map.put(arr[i], count);
			}
			else{
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		for(char c:map.keySet()){
			if(map.get(c)>1){
				System.out.println(c+":"+map.get(c));	
			}
		}
	}
}
