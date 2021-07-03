package InterviewPrograms;

public class SumOfDigits {

	public static int sumOfDigits(int num){
		int sum=0;
		int rem;
		while(num!=0){
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		if(sum<10){
			return sum;	
		}
		else{
			return sumOfDigits(sum);
		}			
	}
	public static void main(String[] args) {
		System.out.println(sumOfDigits(789));
	}
}
