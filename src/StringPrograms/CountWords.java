package StringPrograms;
import java.util.HashMap;
import java.util.Map;

public class CountWords {

	public static void main(String[] args) {

		String str="I am learning learning java java programming";

		String[] arr = str.split(" ");

		Map<String,Integer> map=new HashMap<String,Integer>();
		int count=1;

		for(int i=0;i<arr.length;i++){
			if(!map.containsKey(arr[i])){
				map.put(arr[i], count);
			}

			else{
				map.put(arr[i], map.get(arr[i])+1);
			}
		}

		for(String s:map.keySet()){
			System.out.println("The count of word :"+s+"="+map.get(s));
		}

	}

}
