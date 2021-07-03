package InterviewPrograms;

public class MinCurrencyNotes {
  public static void countCurrency(int amount){
	int[]  notes={2000,500,100,50,20,10,5,2,1};
	
	int[] noteCounter=new int[9];
	
	for(int i=0;i<9;i++){
		if(amount>=notes[i]){
			noteCounter[i]=amount/notes[i];
			amount-=notes[i]*noteCounter[i];
		}
	}
	for(int j=0;j<9;j++){
		if(noteCounter[j]!=0){
			System.out.println(notes[j]+":"+noteCounter[j]);
		}
	}
  }
  public static void main(String[] args) {
	countCurrency(2788);
}
}
