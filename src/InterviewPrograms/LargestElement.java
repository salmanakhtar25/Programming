package InterviewPrograms;

public class LargestElement {

	public static int largestelement(){
		int arr[]={67,89,68,45,99,789,453,654};
		int largest=arr[0];

		for(int i=1;i<arr.length;i++){
			if(arr[i]>largest){
				largest=arr[i];
			}
		}
		return largest;
	}
	public static void main(String[] args) {
		System.out.println(largestelement());
	}
}
