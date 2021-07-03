package PatternPrograms;

public class pattern7 {
	
		public static void pattern(int r){
		for(int i=0;i<r;i++){
			for(int j=0;j<r;j++){
				if(i==j||i+j==r-1){
				System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
}
		public static void main(String[] args) {
			pattern(5);
		}
}

