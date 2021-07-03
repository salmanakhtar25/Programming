package StringPrograms;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadTextFile {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("C:/Users/salmank/Desktop/readme.txt");
		BufferedReader br=new BufferedReader(new InputStreamReader(fis));
		
		int linescount=0,wordscount=0,charscount=0;
		
		while(br.read()!=-1){
			String line = br.readLine();
			linescount++;
			String[] words = line.split(" ");
			wordscount+=words.length;
			for(String word:words){
				charscount+=word.length();
			}
		}
		
		System.out.print(linescount+" "+wordscount+" "+charscount);
	}

}
