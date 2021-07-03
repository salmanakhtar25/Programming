package PatternPrograms;

public class Pattern1 {

   public static void pattern(int row){
	   for(int i=1;i<=row;i++){
		   for (int j = 1; j<=i; j++) {
			   System.out.print("*");
			   }
		   System.out.println();
	   }
	   
	   
   }
   public static void main(String[] args) {
	pattern(6);
}
}
