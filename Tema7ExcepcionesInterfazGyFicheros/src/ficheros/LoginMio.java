package ficheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LoginMio {

public static void main(String[] args) throws IOException {
		
		File f1 = new File ("Keep.txt");
		FileWriter fw = new FileWriter (f1);
		Scanner sc = new Scanner (System.in);
		boolean continuar = true;
		int opcion;
		String nombre;
		String pass;
		
		
		while(continuar) {
			
			System.out.println("1. Registrarse");
			System.out.println("2. Logearse");
			System.out.println("3. Usuarios Registrados");
			System.out.println("4. Salir");
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1:
				
				System.out.println("Introduce tu nombre de usuario");
				
				nombre = sc.next();
				
				System.out.println("Introduce tu contraseña");
				
				sc
				
				break;
			
			case 2:
				
				break;
			
			case 3:
				
				break;
				
			case 4:

				break;
				
			}
			
		}
		
		
		
		System.out.println("Por favor ");
		
		fw.write("patata");
		fw.close();
	}

}
