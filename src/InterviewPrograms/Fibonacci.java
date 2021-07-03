package InterviewPrograms;

public class Fibonacci {

	public static void Fibonacii(int count) {
		int a=0;
		int b=1;
		int sum;
		for(int i=1;i<=count;i++){
			sum=a+b;
			System.out.print(a+" ");
			a=b;
			b=sum;
		}
	}

	public static void main(String[] args) {
		Fibonacii(10);
	}
}
