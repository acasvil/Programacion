package temperatura;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		double tempSeek;
		boolean flag = false;
		int opcion;
		Scanner entrada = new Scanner(System.in);
		ArrayList<Double> temp = new ArrayList();

		while (!flag) {

			System.out.println("1. Añadir temperatura");
			System.out.println("2. Mostrar temperatura media");
			System.out.println("3. Mostrar temperaturas extremas");
			System.out.println("4. Mostrar la lista de temperaturas");
			System.out.println("5. Busca la temperatura y muestra su posición");
			System.out.println("6. Borrar la temperatura");
			System.out.println("7. Salir");

			opcion = entrada.nextInt();

			switch (opcion) {

			case 1:
				Temperatura.addtemp(temp);
				break;

			case 2:
				
				System.out.print("La temperatura media es de: " + Temperatura.avgtemp(temp));
				System.out.println();
				break;
				

			case 3:

				System.out.println("Las temperatuas maximas son de: " + Temperatura.MaxMintemp(temp)[0]+ "Cº" + 
						"\n Las temperaturas minimas son de: " + Temperatura.MaxMintemp(temp)[1] + "Cº");
				break;

			case 4:
				
				Temperatura.listTemp(temp);
				break;

			case 5:
				
				System.out.println("¿Qué temperatura deseas buscar?");
				tempSeek= entrada.nextDouble();
				if(Temperatura.searchTemp(temp, tempSeek) == -1) {
					System.out.println("No se ha encontrado la temperatura");
				}else{
					System.out.println("La temperatura que buscas está en la posición" + Temperatura.searchTemp(temp, tempSeek));
				};
				
				
				break;

			case 6:
				
				System.out.println("¿Qué temperatura deseas borrar?");
				tempSeek= entrada.nextDouble();
				if(Temperatura.deleteTemp(temp, tempSeek) == false) {
					System.out.println("No se ha encontrado la temperatura que buscas");
				}else {
					System.out.println("Se ha borrado la temperatura correctamente");
				}
				break;

			case 7:
				flag = true;
				System.out.println("Adios!");
				break;

			}

		}

	}

}
