package PatternPrograms;

public class Pattern2 {
public static void pattern(int r){	
	for (int a = 1; a<=r; a++) {
		for(int b=1;b<=a;b++){
			System.out.print("*");
		}
		System.out.println();
		
	}
	
	for(int c=1;c<=r;c++){
		for(int d=r-1;d>=c;d--){
			System.out.print("*");
		}
		System.out.println();
	}

}
public static void main(String[] args) {
	pattern(5);
}
}
