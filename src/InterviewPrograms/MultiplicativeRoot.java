package InterviewPrograms;

import java.util.*;

public class MultiplicativeRoot {

	public static void main(String[] args) {
		
		int num=150;
		List<Integer> list=new ArrayList<>();
		if(num<10){
			System.out.println(num+10);
		}
		if(num>=10){
		for(int i=9;i>1;i--){
			while(num%i==0){
				num=num/i;
				list.add(i);
				
			}
		}
		}
          for(int j=list.size()-1;j>=0;j--){
        	System.out.print(list.get(j));
        }
		

	}
}
