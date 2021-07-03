package InterviewPrograms;

public class ReverseNumber {
	public static void main(String[] args) {
		int num=3223;
		int temp=num;
		int rev=0;
		int rem=0;
		while(num!=0){
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse of Number is "+rev);

		if(rev==temp){
			System.out.println(temp+" is a palindrome number");
		}
		else{
			System.out.println(temp+" is not palindrome");
		}
	}	
}
