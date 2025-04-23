package tema2_1;

import java.nio.file.FileSystemNotFoundException;
import java.util.ArrayList;
import java.io.*;


public class Tema2_1 {

	public static void main(String[] args) throws IOException {
		
//		double pi;
//		
//		pi=3.314159;
//		
//		System.out.printf("%8.2f",pi);
//		
//		System.out.println("");
//
//		System.out.print("Lorem ipsum dolor sit amen\n" + "consectetur adipiscing\n");
//				
//		System.out.printf("%17.12s","Hola como estás?\n");
//		
//		int per;
//		per=12342123;
//		
//		System.out.printf("%10.1s",per);
		
		try {
			FileReader fr = new FileReader("f");
			char c = 0;
			while((c =(char) fr.read()) != -1) {
				System.out.println(c);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
