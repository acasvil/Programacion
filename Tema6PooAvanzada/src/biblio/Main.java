package biblio;
import java.nio.file.spi.FileSystemProvider;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int dia;
		int mes;
		int año;
		
		
		System.out.println("Escribe la fecha de alquiler de estos Ejemplares");
		System.out.println("Introduce dia:");
		dia = entrada.nextInt();
		System.out.println("Introduce mes");
		mes = entrada.nextInt();
		System.out.println("Introduce año");
		año = entrada.nextInt();
		
		Date d1 = new Date(dia,mes,año);
		
		Libros l1  =  new Libros ("1234ABCD", "Quijote", d1, false);
		Libros l2  =  new Libros ("4321ABCD", "fweqf", d1, false);
		Libros l3  =  new Libros ("4321DCBA", "1", d1, true);
		
		Revista r1 = new Revista ("ASDFGHJK", "REDLOS", d1, 1234);
		Revista r2 = new Revista ("AS234GHJK", "COURTZ", d1, 6124);
		Revista r3 = new Revista ("QWERTYUIO", "DEIV", d1, 421);
		
		ArrayList<Ejemplar> Libreria = new ArrayList<Ejemplar>();
		
		Libreria.add(l1);
		Libreria.add(l2);
		Libreria.add(l3);
		Libreria.add(r1);
		Libreria.add(r2);
		Libreria.add(r3);
		
		
		System.out.println("Libro 3 " + l1.GetRent());
		
		l1.prestar();
		
		System.out.println("Libro 1 " + l1.GetRent());
		
		System.out.println("Libro 3 " + l3.GetRent());
		
		l3.devolver();
		
		System.out.println("Libro 3 " + l3.GetRent());
		
		for(Ejemplar e: Libreria) {
			System.out.println(e);
		}

	}

}
