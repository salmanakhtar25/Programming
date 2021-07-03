package InterviewPrograms;

public class FibonacciUsingRecursion {
	static int a=0,b=1,c;
	public static void main(String[] args) {
		System.out.print(a+" "+b);
		fibonacci(10);
	}

	public static void fibonacci(int i){
		if(i>=1){
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			fibonacci(i-1);
		}
	}
}
