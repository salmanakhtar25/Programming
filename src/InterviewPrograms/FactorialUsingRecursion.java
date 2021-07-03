package InterviewPrograms;

public class FactorialUsingRecursion {
	static int fact=1;
	public static int factorial(int num){
		if(num>1){
			fact=fact*num;
			factorial(num-1);
		}
		return fact;
	}

	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
}
