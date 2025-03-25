package alumnoEjer8;
import java.util.*;

import randomizer.Generador;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Alumno [] alumnos = new Alumno [5];
		
		String nombre;
		int edad;
		double nota;
		
		System.out.println(Generador.getRandomName());
		System.out.println(Generador.getRandomName());
		System.out.println(Generador.getRandomName());
		System.out.println(Generador.getRandomNumber(1,20));
		System.out.println(Generador.getRandomNumber(1,20));
		System.out.println(Generador.getRandomNumber(1,20));
		System.out.println(Generador.getRandomDouble(3,50, 3));
		System.out.println(Generador.getRandomDouble(3,50, 3));
		System.out.println(Generador.getRandomDouble(3,50, 3	));
		
		for(int i = 0; i<alumnos.length; i++) {
			
			try {
				
				Alumno a1 = new Alumno(null, 0, 0);
				
				System.out.println("Introduce el nombre del alumno: "+ i);
				nombre = sc.next();
				System.out.println("Introduce la edad del alumno");
				a1.setEdad(sc.nextInt());
				System.out.println("Introduce la nota del alumno");
				a1.setNota(sc.nextDouble());
				alumnos[i] = a1;
				
			}catch(NotaNoValidaException | EdadNoValidaException e) {
				
				System.out.println(e);
				i--;
				
			}
				
		}
		
		
		
	}

}
