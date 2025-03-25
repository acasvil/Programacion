package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Ejer3Bol1 {

public static void main(String[] args)throws FileNotFoundException {
		
	boolean continuar = true;
	
	while(continuar) {
		
		System.out.println("Introduce la ruta relativa del nombre de la carpeta o fichero a buscar");
		Scanner sc = new Scanner(System.in);
		String ruta = sc.nextLine();
		File f = new File (ruta);
		if(f.exists()) {
		muestraInfoRuta(f, true);
		}else {
			break;
		}
	}
	}
	
	public static void muestraInfoRuta(File f, boolean info) throws FileNotFoundException {
		
		String [] files = f.list();
		Arrays.sort(files);
		boolean completado = false;
		
		if(f.exists()) {
		
		for(int i = 0; files.length > i; i++) {
			File f2 = new File (f.getPath(), files[i]);
			
			if(f2.isDirectory() && completado == false) {
				System.out.println("* " + f2.getName());
				if(info) {
					System.out.println("Tamaño en bytes " + f2.length() + " Fecha de ultima modificacion " + f2.lastModified());	
				}
			}
			
			if(f2.isFile() && completado == true) {
				System.out.println("A " + f2.getName());
				if(info) {
					System.out.println("Tamaño en bytes " + f2.length() + " Fecha de ultima modificacion " + f2.lastModified());	
				}
			}
			
			if(i == (files.length -1) && completado == false) {
				i = 0;
				completado = true;
			}
		}
		} else {
			throw new FileNotFoundException();
		}

		
		
	}
	
}