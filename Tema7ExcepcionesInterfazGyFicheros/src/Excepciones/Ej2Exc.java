package Excepciones;
import java.util.*;

public class Ej2Exc {

	public static void main(String[] args) {
		
		final int NUM = 5;
		int[] enteros = new int[NUM];
		int posicion = 0;
		Scanner teclado = new Scanner(System.in);
		int cont = 0;
		int divisor = 0;
		while (cont < NUM) {
		
		try {
			
			System.out.println("Introduce una posición del array:");
			posicion = Integer.parseInt(teclado.nextLine());
			System.out.println("Introduce un divisor:");
			divisor = Integer.parseInt(teclado.nextLine());
			enteros[posicion] = 100 / divisor;
			cont++;
		
		}catch (ArrayIndexOutOfBoundsException array) {
			
			System.out.println("Has introducido un valor fuera del array");
			
		}
			
		catch (ArithmeticException arit) {
			
			System.out.println("No puedes dividir entre 0");
			
		}catch(NumberFormatException num) {
			
			System.out.println("Tienes que escribir un numero");
			
		}
		
		System.out.println("El contenido del array de enteros es:");
		for (int valor : enteros) {
		System.out.println(valor);
		}

		}

	}
	
}
