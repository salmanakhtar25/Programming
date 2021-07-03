package InterviewPrograms;

public class PerfectSquare {

	public static boolean  isPerfectSquare(int num){
		for(int i=1;i<=num/2;i++){
			if(i*i==num){
				return true;
			}
		}
		return false;
	}

	public static void getPerfectSquare(int num){
		for(int i=1;i<num;i++){
			if(isPerfectSquare(i)){
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(isPerfectSquare(144));
		getPerfectSquare(144);
	}
}
