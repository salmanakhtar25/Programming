package InterviewPrograms;

public class MatrixMultiplication {

	public static void main(String[] args) {

		int m1[][]={{2,1},
				{9,4}};

		int m2[][]={{8,7},
				{6,5}};

		int r[][]=new int[2][2];
		int sum=0;

		for(int i=0;i<2;i++){         
			for(int j=0;j<2;j++){
				for(int k=0;k<2;k++){
					sum+=m1[i][k]*m2[k][j];
				}
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
