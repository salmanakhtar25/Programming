package InterviewPrograms;

public class OddEvenDifference {
	public static void main(String[] args) {
		int num=4567;
		String strnum = Integer.toString(num);
		int oddsum = 0;
		int evensum=0;
		for(int i=0;i<strnum.length();i++){
			String strdigit = Character.toString(strnum.charAt(i));
			int intdigit=Integer.parseInt(strdigit);
			if((i+1)%2!=0){
				oddsum+=intdigit;
			}
			else{
				evensum+=intdigit;
			}
		}
		int diff = (Math.abs(oddsum-evensum));
		System.out.println(diff);
	}
}