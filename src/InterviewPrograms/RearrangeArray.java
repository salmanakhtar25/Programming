package InterviewPrograms;

public class RearrangeArray {

	static void rearrange(int[] arr){
		int i=-1,temp=0,n=arr.length;

		for(int j=0;j<n;j++){//moving neg element to left side.
			if(arr[j]<0){
				i++;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		for(int ele:arr){
			System.out.print(ele+" ");
		}
		System.out.println();
		int pos=i+1,neg=0;
		while(pos<n && neg<pos && arr[neg]<0){//arranging pos & neg element at alternate position.
			temp=arr[neg];
			arr[neg]=arr[pos];
			arr[pos]=temp;
			pos++;
			neg+=2;
		}
		for(int ele:arr){
			System.out.print(ele+" ");
		}
	}
	public static void main(String[] args) {
		int[] arr={1,-1,3,4,5,-6,8,-5,-4};
		rearrange(arr);
	}

}
