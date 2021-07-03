package InterviewPrograms;

public class LinearSearch {

	public static void SearchNum(int num){
		int[] arr={8,4,6,2,5,9,3};
		int flag=0;
		for(int i=0;i<arr.length;i++){
			if(num==arr[i]){
				System.out.println(num+ " found at index "+i);
				flag++;
				break;
			}
		}
		if(flag==0){
			System.out.println("number not found");
		}
	}
	public static void main(String[] args) {
		SearchNum(9);
	}
}
