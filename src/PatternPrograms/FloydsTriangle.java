package PatternPrograms;


public class FloydsTriangle {

	public static void floydsTriangle(int Rows) {
		int c,d,num=1;

		for(c=1;c<=Rows;c++){
			for(d=1;d<=c;d++){
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		floydsTriangle(4);
	}
}
