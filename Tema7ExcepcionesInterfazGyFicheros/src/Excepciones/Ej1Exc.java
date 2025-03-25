package Excepciones;
import java.util.*;


public class Ej1Exc {
	public static void main(String[] args) {
		
		int [] aaa = new int [9];
		
		try {
			
			aaa[10] = 3;
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Error Out of bounds");
			
		}
		
		
		
	}
}
