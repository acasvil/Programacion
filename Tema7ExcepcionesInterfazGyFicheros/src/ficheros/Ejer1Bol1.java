package ficheros;
import java.io.File;
import java.util.*;

public class Ejer1Bol1 {

	public static void main(String[] args) {
		
		System.out.println("Introduce la ruta relativa del nombre de la carpeta o fichero a buscar");
		Scanner sc = new Scanner(System.in);
		String ruta = sc.next();
		
		File f = new File (ruta);
		
		System.out.println(f.getPath());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.length());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		
		
	}

}
