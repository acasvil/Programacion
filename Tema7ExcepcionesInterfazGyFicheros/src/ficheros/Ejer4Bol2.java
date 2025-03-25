package ficheros;

import java.util.*;
import java.io.*;

public class Ejer4Bol2 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		File fCreate = new File("Ejer4.txt");
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = new FileWriter(fCreate);
		BufferedWriter bw = new BufferedWriter(fw);
		String aux;
		String user;
		int opcion;
		boolean continuar = true;
		boolean continuar1 = true;
		String nombreFichero;
		String Datos;
		boolean minusMayus = false;

		while (continuar) {

			System.out.println("1. Crear Fichero");
			System.out.println("2. Mostrar fichero");
			System.out.println("3. Salir");
			opcion = sc.nextInt();

			switch (opcion) {

			case 1:

				fr = new FileReader(fCreate);
				br = new BufferedReader(fr);

				while (continuar1) {
					System.out.println("Introduzca palabras");
					user = sc.nextLine();

					if (!user.equalsIgnoreCase("fin")) {
						bw.write(user);
						bw.newLine();
					} else {
						continuar1 = false;
					}
				}
				continuar1 = true;
				bw.close();

				break;

			case 2:

				int i;

				while ((i = fr.read()) != -1) {

					try {
						char car = (char) i;
						if (i <= 90 && i >= 65) {
							car = (char) (i + 32);
							System.out.print(car);
							minusMayus = true;
						} else if (i <= 122 && i >= 97) {
							car = (char) (i - 32);
							System.out.print(car);
							minusMayus = false;
						} else {
							System.out.print(car);
						}
					} catch (Throwable e) {

					}

				}

				break;

			case 3:
				continuar = false;
				break;

			}

		}
		sc.close();
		br.close();

	}

}
