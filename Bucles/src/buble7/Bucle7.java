package buble7;
import java.util.Scanner;
public class Bucle7 {

	public static void main(String[] args) {
		
		
		int altura;
		
		String simbolo;
		System.out.println("Introduce la altura de la piramide");
		Scanner entrada1 = new Scanner(System.in);
		altura = entrada1.nextInt();
		System.out.println("Introduce un caracter");
		Scanner entrada2 = new Scanner(System.in);
		simbolo = entrada2.next();
		
		while (simbolo.length()!=1) {
			System.out.println("solo debes introducir un caracter");
		System.out.println("Introduce un caracter");
		entrada2 = new Scanner(System.in);
		simbolo = entrada2.next();
	}
		
		int contador = 0;
		int contadorfila = 1;
		int contadorespacio = (altura-1);
		int altura2 = 0;
		
		
		while (altura > contador) 
		{
			int i = 0;
			int e = 0;
			
			while (i < contadorespacio) 
			{
				System.out.print(" ");
				i++;
			}
			
			while (e < contadorfila) 
			{
				System.out.print(simbolo);
				e++;
			}
			
			System.out.println();
			contador++;
			contadorespacio--;
			contadorfila+=2;
			
		}
		
		
	}

	}
	
