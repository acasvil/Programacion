package ifsemanal;
import java.util.Scanner;

public class Ifsemanal {

	public static void main(String[] args) {
		
		System.out.println("Bienvenido, este programa te dirá que asignatura toca a primera en el día de la semana que introduzcas");
		
		System.out.println("Introduce un día de la semana");
		
		Scanner dia = new Scanner(System.in);
		
		int diasem = dia.nextInt();
		
		if (diasem == 1) 
			System.out.println("Toca Fol"); 
		else if (diasem == 2)
			System.out.println("Toca sistemas");
		else if (diasem == 3)
			System.out.println("Toca Computación");
		else if (diasem == 4)
			System.out.println("Toca sistemas");
		else if (diasem == 5)
			System.out.println("Toca Programación");
		else if (diasem == 6)
			System.out.println("Es fin de semana");
		else if (diasem == 7)
			System.out.println("Es fin de semana");

	}

}
