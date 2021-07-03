package InterviewPrograms;

public class BinarySearch {

	public static void SearchNum(int num){
		int[] arr={1,2,3,4,5,6,7,8,9,10};// Array should be sorted
		int li=0;
		int hi=arr.length-1;
		int mi=(li+hi)/2;
		int flag=0;
		while(li<=hi){
			if(arr[mi]==num){
				System.out.println("Element found at "+mi+"th index position");
				flag++;
				break;
			}
			else if(arr[mi]<num){
				li=mi+1;
			}
			else{
				hi=mi-1;
			}
			mi=(li+hi)/2;
		}
		if(flag==0){
			System.out.println("Element not found");
		}
	}
	public static void main(String[] args) {
		SearchNum(8);
	}
}
