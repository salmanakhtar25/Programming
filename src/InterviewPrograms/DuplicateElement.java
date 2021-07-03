package InterviewPrograms;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {

	public static void duplicate(){
		int arr[]={1,2,3,4,5,6,3,8};
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					System.out.println("duplicate element is "+arr[i]);
				}
			}
		}
	}
	public static void main(String[] args) {
		duplicate();
		int arr[]={1,2,3,4,5,6,3,8};
		Set<Integer> set=new HashSet<Integer>();
		for(int num:arr){
			if(set.add(num)==false){
				System.out.println("duplicate element is "+num);
			}
		}
	}
}
