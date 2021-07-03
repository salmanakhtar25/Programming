package InterviewPrograms;

public class MergeArrays {
	
public static void mergearrays(int[] a,int[] b){
		
		
		int[] arr=new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++){
			arr[i]=a[i];
		}
		
		for(int i=0;i<b.length;i++){
			arr[a.length+i]=b[i];
		}
		
		for(int values:arr){
			System.out.print(values+" ");
		}
}
		public static void main(String[] args){
			int[] arr1={10,20,30};
			int[] arr2={40,50,60,70,80};
			mergearrays(arr1,arr2);
		}
	}


