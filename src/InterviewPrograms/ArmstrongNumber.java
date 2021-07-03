package InterviewPrograms;

public class ArmstrongNumber {

	public static boolean isArmstrong(int number){

		String Number=Integer.toString(number);
		int count=Number.length();

		int num=number;
		int rem;
		int arm=0;

		while(num!=0){
			int mul=1;
			rem=num%10;
			for(int i=0;i<count;i++){
				mul*=rem;
			}
			arm+=mul;
			num/=10;
		}

		if(arm==number){
			return true;
		}
		else{
			return false;
		}
	}

	public static void printArmstrong(){
		for(int i=10;i<1000;i++){
			if(isArmstrong(i)){
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {

		System.out.println(isArmstrong(1634));
		printArmstrong();
	}
}