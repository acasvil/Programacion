package ficheros;
import java.util.*;
import java.io.File;

public class Ejer5Bol1 {

	public static void main(String[] args) {
		
		File f1 = new File("Documentos", "MisCosas");
		File f2 = new File("Documentos", "Alfabeto");
		String letra ="";
		
		if(!f1.exists()) {
			f1.mkdir();
		}
		
		if(!f2.exists()) {
			f2.mkdir();
		}
		
		System.out.println("AQUI");
		Scanner sc = new Scanner(System.in);
		String MisCosas = sc.next();
			
		File f3 = new File(f1.getPath(), "Fotografias");
		File f4 = new File((MisCosas), "Fotografias");
		f3.renameTo(f4);
		
		f3.mkdir();
		File f5 = new File(f1.getPath(), "Libros");
		File f6 = new File((MisCosas), "Libros");
		f5.renameTo(f6);
		f5.mkdir();
		
		
		System.out.println("AQUI");
		String Alfabeto = sc.next();
		
		for(int i = 65; i < 90 ; i++) {
			char car = (char) i ;
			letra = Character.toString(car);
			File f7 = new File(Alfabeto, letra);
			f7.mkdir();
			System.out.println(letra);
			
			
		}
		
	}
	
}
