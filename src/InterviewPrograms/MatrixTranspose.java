package InterviewPrograms;

public class MatrixTranspose {

	public static void main(String[] args) {

		int m[][]={{1,2,3},
				{4,5,6},
				{7,8,9}};

		int t[][]=new int[3][3];

		for(int i=0;i<m.length;i++){

			for(int j=0;j<m.length;j++){
				t[i][j]=m[j][i];
			}
		}
		for(int k[]:t){
			for(int l:k){
				System.out.print(l+" ");
			}
			System.out.println();
		}
	}
}
