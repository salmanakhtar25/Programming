package InterviewPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PairSum {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,9,7,8,8,13,14,15};

		int sum=16;
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<arr.length;i++){
			list.add(arr[i]);
		}
		
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++){
			if(list.contains(sum-arr[i]) && arr[i]<=sum/2){
				map.put(arr[i],sum-arr[i]);
			}
		}
		Set<Integer> keys = map.keySet();
		for(int key:keys){
			System.out.println(key+","+map.get(key));
		}

	}

}
