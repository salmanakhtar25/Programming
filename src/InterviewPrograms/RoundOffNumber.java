package InterviewPrograms;

public class RoundOffNumber {
	public static int Roundff(int num){
		while(num%5!=0){
			num++;
		}
		return num;
	}
    public static void main(String[] args) {
		System.out.println(Roundff(8));
	}
}
