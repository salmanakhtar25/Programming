package StringPrograms;

public class UserNameFromEmail {
   public static void main(String[] args) {
	String str="salman.Akhtar@gmail.com";
	
	String firstname=str.substring(0,str.indexOf("."));
	
	String sirname = str.substring(str.indexOf(".")+1, str.indexOf("@"));
	
	String strfinal = firstname+" "+sirname;
	
	System.out.println(strfinal);
}

}
