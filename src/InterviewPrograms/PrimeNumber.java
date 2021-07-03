package InterviewPrograms;

public class PrimeNumber {

	public static boolean isPrime(int num){
		if(num<2){
			return false;	
		}

		for(int i=2;i<num;i++){
			if(num%i==0){
				return false;
			}
		}
		return true;

	}
	public static void getPrimeNumbers(int num){
		for(int i=2;i<num;i++){
			if(isPrime(i)){
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) {

		System.out.println(isPrime(97));
		getPrimeNumbers(10);
	}
}
