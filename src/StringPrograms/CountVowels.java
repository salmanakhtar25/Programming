package StringPrograms;
public class CountVowels {

	public static void main(String[] args) {
		String s="ShoEb";
		String s1 = s.toLowerCase();
		char vowels[]={'a','e','i','o','u'};


		int count=0;
		for(int i=0;i<s1.length();i++){
			for(int j=0;j<vowels.length;j++){
				if(s1.charAt(i)==vowels[j]){
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}

}
