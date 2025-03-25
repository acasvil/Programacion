package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejer2Bol1 {

	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println("Introduce la ruta relativa del nombre de la carpeta o fichero a buscar");
		Scanner sc = new Scanner(System.in);
		String ruta = sc.nextLine();
		
		File f = new File (ruta);
		
		muestraInfoRuta(f);
		
	}
	
	public static void muestraInfoRuta(File f) throws FileNotFoundException {
		
		if(f.isFile()) {
			
			System.out.println("A " + f.getName());
			
		}else if(f.isDirectory()) {
			String [] sub = f.list();
		
			for(String p: sub) {
		
				System.out.println("* " + p);
			}
			
		}else {
			throw new FileNotFoundException();
		}
		
		
		
	}
	
}
