package mascotas;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		
		
		Perro p1 = new Perro("p1", 1, "p1", "p1", "p1", false);
		Perro p2 = new Perro("p2", 2, "p2", "p2", "p2", true);
		Gato g1 = new Gato("g1", 3, "g1", "g1", "g1", false);
		Gato g2 = new Gato("g2", 4, "g2", "g2", "g2", true);
		Loro l1 = new Loro("l1", 5, "l1", "l1", true, false, "l1", false);
		Loro l2 = new Loro("l2", 6, "l2", "l2", true, true, "c2", true);
		Canario c1 = new Canario( "c1", 7, "c1", "c1", true, false, "c1", false);
		Canario c2 = new Canario( "c2", 8, "c2", "c2", true, false, "c2", true);
		
		boolean active = true;
		int opcion = 0;
		System.out.println("Bienvenido al inventario de Pet&Co");
		
		while(active) {
			
			
			System.out.println();
			System.out.println("1. Añadir animal");
			System.out.println("2. Eliminar animal");
			System.out.println("3. Buscar animal");
			System.out.println("4. Mostrar nombres animales");
			System.out.println("5. Mostrar todos los animales");
			System.out.println("6. Vaciar inventario");
			System.out.println("7. Salir");
			
			Scanner entrada = new Scanner(System.in);
			opcion = entrada.nextInt();
			
			switch(opcion) {
			case 1: 
				System.out.println("¿Que tipo de animal deseas añadir?");
				String typeAnimal = entrada.next();
				switch(typeAnimal) {
				case "Perro":
					Inventario.addAnimal(p1);
					break;
				case "Gato":
					Inventario.addAnimal(g1);
					break;
				case "Loro":
					Inventario.addAnimal(l1);
					break;
				case "Canario":
					Inventario.addAnimal(c1);
					break;
				default:
					System.out.println("Ese animal no está disponible");
					break;
				}
				
				break;
			case 2: 
				
				System.out.println("¿Cual es el nombre del animal que deseas borrar?");
				String removeName = entrada.next();
				Inventario.removeAnimal(removeName);
				break;
				
			case 3: 
				
				System.out.println("¿Que animal deseas buscar?");
				String searchedAnimal = entrada.next();
				Inventario.searchAnimal(searchedAnimal);
				
				break;
			case 4: 
				
				Inventario.showAnimals();
				
				break;
			case 5: 
				
				Inventario.showAll();
				
				break;
			case 6: 
				
				Inventario.removeAllAnimals();
				
				break;
			case 7: 
				System.out.println("Saliendo...");
				active=false;
				break;
				
			default:
			}
			
		}

	}

}
