package ficheros;
import java.io.File;
import java.util.*;

public class Prueba {

	public static void main(String[] args) {
		
		System.out.println("Ficheros en el directorio actual: ");
		File f =  new File("..");
		
		String []patata = f.list(); 
		
		System.out.println( "ruta: " +  f.getAbsolutePath());
		
		for(String p : patata) {
			System.out.println(p);
		}
		
	}

}
