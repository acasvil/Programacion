package ppt;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		String optionH;
		String optionR;
		int RandomN;
		int MyNumber;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bienvenido al piedra papel o tijera");
		System.out.println("-----------------------------------------");
		System.out.println("Elige Piedra Papel o Tijera");
		
		// Si el random devuelve 1 es Piedra si es 2 Papel y Tijera
		
		RandomN =(int) ((Math.random())*3+1);
		optionH = input.next();
		
		if(optionH.equals("Piedra")) {
			
		}
		
		
		
		

	}

}
