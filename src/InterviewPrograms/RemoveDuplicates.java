package InterviewPrograms;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args){

		int[] arr={6,5,4,3,2,1,9,8,7,6,5};

		int[] temp=new int[arr.length];

		Arrays.sort(arr);
		int j=0;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]!=arr[i+1]){
				temp[j]=arr[i];
				j++;
			}
			temp[j]=arr[arr.length-1];
		}

		for(int value:temp){
			System.out.print(value+" ");
		}

		Set<Integer> set=new HashSet<Integer>();
		System.out.println();
		for(int i=0;i<arr.length;i++){
			set.add(arr[i]);
		}
		Iterator<Integer> itr=set.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
	}
}
