package InterviewPrograms;

public class MissingNumber {

	public static void missingnum() {
		int arr[]={1,2,3,4,5,6,7,9};

		int expected_sum=((arr.length+1)*(arr.length+2))/2;
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		System.out.println("missing number is "+(expected_sum-sum));
	}
	public static void main(String[] args) {
		missingnum();
	}
}

