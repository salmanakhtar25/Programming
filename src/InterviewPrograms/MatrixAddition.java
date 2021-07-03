package InterviewPrograms;

public class MatrixAddition {

	public static void main(String[] args) {

		int m1[][]={{2,1,7},
				    {9,4,8},
				    {1,2,3}};

		int m2[][]={{8,7,2},
				    {6,5,1},
				    {9,2,1}};

		int r[][]=new int[3][3];
		int sum=0;

		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				sum+=m1[i][j]+m2[i][j];
				r[i][j]=sum;
				sum=0;
			}
		}

		for(int i[]:r){
			for(int j:i){
				System.out.print(j+"  ");	
			}
			System.out.println();
		}
	}
}
