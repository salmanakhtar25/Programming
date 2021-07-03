package InterviewPrograms;

public class CommonElement {

	public static void  commonelement(){

		int a[]={43,56,78,95,54};
		int b[]={44,57,79,95,55};

		for(int i=0;i<a.length;i++){

			for(int j=0;j<b.length;j++){

				if(a[i]==b[j]){

					System.out.println("common element between two array is "+a[i]);
				}
			}
		}
	}
	public static void main(String[] args) {
		commonelement();
	}
}
