package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejer3Bol2 {

	public static void main(String[] args) throws IOException {
		
		
		Scanner sc = new Scanner (System.in);
		FileReader fr = null;
		BufferedReader br = null;
		
		int opcion;
		boolean continuar = true;
		String nombreFichero;
		String Datos;
		
		while(continuar) {
			
			System.out.println("1. Crear Fichero");
			System.out.println("2. Mostrar fichero");
			System.out.println("3. Salir");
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1:
				
				System.out.println("Introduce el nombre del archivo que deseas crear");
				nombreFichero = sc.next();
				File fCreate = new File(nombreFichero);
				if(fCreate.exists()) {
					System.out.println("Ese Fichero ya existe");
				}else {
					FileWriter fw = new FileWriter (fCreate);
					BufferedWriter bw = new BufferedWriter(fw);
					fCreate.createTempFile(nombreFichero, ".txt");
					System.out.println("Debes introducir tus datos en el archivo");
					System.out.println("Introduzca su nombre");
					Datos = sc.next();
					bw.write(Datos);
					bw.newLine();
					System.out.println("Apellidos");
					Datos = sc.next();
					bw.write(Datos);
					bw.newLine();
					System.out.println("Ciudad de nacimiento");
					Datos = sc.next();
					bw.write(Datos);
					bw.newLine();
					fr = new FileReader(fCreate);
					br = new BufferedReader(fr);
					bw.close();
				}
				
				break;
			
			case 2:
				
				Ejer1Bol2.mostrarByBuffer(br);
				
				break;
			
			case 3:
				continuar = false;
				break;
				
			case 4:

				break;
				
			}
			
		}

	}

}
