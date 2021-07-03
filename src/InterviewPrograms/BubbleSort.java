package InterviewPrograms;


public class BubbleSort {
	public static void main(String[] args) {
		int[] arr={5,9,2,3,7,6,15,10,12};

		int temp;
		for(int i=0;i<arr.length-1;i++){

			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j+1]<arr[j]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int k:arr){
			System.out.print(k+" ");
		}
	}
}
