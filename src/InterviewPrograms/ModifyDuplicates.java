package InterviewPrograms;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class ModifyDuplicates {

	public static void main(String[] args) {
		String[] arr={"salman","shoeb","saif","salman","shoeb","salman"};

		LinkedHashMap<String,Integer>map=new LinkedHashMap<>();

		Set<String>set=new LinkedHashSet<>();

		for(int i=0;i<arr.length;i++){
			if(!map.containsKey(arr[i])){
				map.put(arr[i], 0);
				set.add(arr[i]);
			}
			else{
				map.put(arr[i], map.get(arr[i])+1);
				set.add(arr[i]+map.get(arr[i]));
			}
		}
		System.out.println(set);
	}


}
