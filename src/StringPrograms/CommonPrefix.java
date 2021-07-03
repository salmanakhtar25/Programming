package StringPrograms;

public class CommonPrefix {
	public static String commonprefix(String[] arr){
		
	String shorteststr=arr[0];
	
	for(String str:arr){
		if(str.length()<shorteststr.length()){
			shorteststr=str;
		}
	}
	String common="";
	for(int i=0;i<shorteststr.length();i++){
		String first=arr[0];
		for(int j=1;j<arr.length;j++){
			String second=arr[j];
			if(first.charAt(i)!=second.charAt(i)){
				return common;
			}
		}
		common+=first.charAt(i);
	}
	return common;
	}
	public static void main(String[] args) {
		String[] arr={"geeks","geekforgeeks","geezer","geek"};
		System.out.println(commonprefix(arr));
	}
	
}