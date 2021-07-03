package InterviewPrograms;

public class RotateArray {

	public static void Rotate(int[] arr,int rotcount){

		int temp;
		for(int j=0;j<rotcount;j++){
			temp=arr[0];
			for(int i=0;i<arr.length-1;i++){
				arr[i]=arr[i+1];
			}
			arr[arr.length-1]=temp;
		}
		for(int values:arr){
			System.out.print(values+" ");
		}
	}
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6};
		Rotate(arr,2);
	}
}
