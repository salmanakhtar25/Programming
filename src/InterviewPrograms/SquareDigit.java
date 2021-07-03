package InterviewPrograms;

public class SquareDigit {

	public static int squareDigits(int n){
		String s = Integer.toString(n);
		String revs = "";

		for(int i=0;i<s.length();i++){
			char digit = s.charAt(i);
			String digits = Character.toString(digit);
			int intdigit = Integer.parseInt(digits);
			int square = intdigit*intdigit;
			revs+=Integer.toString(square);

		}
		int squaredNumber = Integer.parseInt(revs);
		return squaredNumber;

	}
	public static void main(String[] args) {
		System.out.println(squareDigits(9119));
	}
}
