package StringPrograms;

public class AddNumbersInString {
	public static void main(String[] args) {
		String s="123$@456abcd12";
		String str = s.replaceAll("[^0-9]+", "+");
		String[] nums = str.split("\\+");
		int sum=0;
		for(int i=0;i<nums.length;i++){
			int num = Integer.parseInt(nums[i]);
			sum+=num;
		}
		
		System.out.println(str+"="+sum);
	}

}
