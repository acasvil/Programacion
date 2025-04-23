package Excepciones;
import java.util.*;


public class ejer3 {
	
	public static void  fill (double [] a) {
		
		double caracol;
		int position;
		double divisor;
		
		for(int i = 0 ; i < a.length ; i++) {
			
			try {
				
				Scanner entrada = new Scanner(System.in);
				System.out.println("Que posicion del array deseas rellenar");
				position = entrada.nextInt();
				if (position > a.length) {
					throw new ArrayIndexOutOfBoundsException("Numero fuera de rango del array");
				}
				System.out.println("Introduce un dividendo");
				caracol = entrada.nextDouble();
				System.out.println("Introduce un divisor:");
				divisor = entrada.nextDouble();
				
				if (divisor == 0) {
					throw new ArithmeticException("No dividas entre 0!");
				}
				
				a[i] = caracol / divisor;
			}	
			catch(InputMismatchException nm) {
				System.out.println("Solo se deben introducir numeros!!!");
			}

		}
		
	}
	
	public static void show (double [] a) {
		
		for(double p : a) {
			System.out.println(p);
		}
		
	}
	
	public static void main(String[] args) {
		
		double [] prueba = new double [5];
		String patata;
		Scanner sc = new Scanner(System.in);
		
		try {
			fill(prueba);
			System.out.println("hola");
		}catch(ArrayIndexOutOfBoundsException ar) {
			System.out.println(ar);
		}catch(ArithmeticException a) {
			System.out.println(a);
		}
		
		for(int i = 0; i < 10 ; i++) {
			
			System.out.println("Introduce datos");
			patata = sc.next();
			
			
		}
		
		show(prueba);
		
	}
}
