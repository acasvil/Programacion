package ficheros;
import java.io.File;
import java.util.*;

public class Ejer4Bol1 {
	
	public static void main(String[] args) {
		
		boolean continuar = true;
		String archivo;
		String cambio;
		String [] lista;
		String aux = "";
		
		while(continuar) {
			
			Scanner sc =new Scanner(System.in);
			System.out.println("¿Cual es el archivo al que le deseas cambiar el nombre?");
			archivo = sc.next();
			File f1 = new File(archivo);
			if(f1.exists()) {
				System.out.println("Introduzca el nuevo nombre para su archivo");
				cambio = sc.next();
				File f2 = new File(cambio);
				if(f1.renameTo(f2)) {
					System.out.println("Cambio hecho correctamente");
				}else {
					System.out.println("Error inesperado en el cambio de nombre");
				}
			}else {
				System.out.println("El archivo especificado no existe");
			}
			
			System.out.println("¿Cual es la carpeta donde se encuentran los archivos a los que les quieres quitar"
					+ " la extension?");
			archivo = sc.next();
			File f3 = new File(archivo);
			
			if(f3.exists() && f3.isDirectory()) {
				
				lista = f3.list();
				
				for(String p: lista) {
					File f4 = new File(f3.getPath(), p);
					if(f4.isFile()) {
						StringTokenizer st = new StringTokenizer(p, ".");
						if (st.hasMoreTokens()) {
							aux = st.nextToken();
						}
						// String aux = p.substring(0, p.lastIndexOf("."));
						// File f5 = new File(f3.getPath(), aux);
						File f5 = new File(f3.getPath(), aux);
						f4.renameTo(f5);
					}
					
					
				}
				
			}
			
		}
		
	}
	
}
