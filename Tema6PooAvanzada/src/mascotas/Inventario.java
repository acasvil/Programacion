package mascotas;

import java.util.*;

public class Inventario {

	static Mascotas[] inventario = new Mascotas[8];
	static int added = 0;

	public static void addAnimal(Mascotas m1) {

		for (int i = 0; i < inventario.length; i++) {
			if (inventario[i] != null) {
				inventario[i] = m1;
				i=inventario.length;
			}
		}

	}
	
	public static String searchAnimal(String nombre) {
		
		for (int i = 0; i < inventario.length; i++) {
			if (inventario[i] != null && inventario[i].getNombre() == nombre) {
				return inventario[i].toString();
			}
		}
		return "Animal no encontrado";
	}

	public static void showAll() {
		for (Mascotas i : inventario) {
			System.out.println(i);
		}
	}

	public static void showAnimals() {
		for (Mascotas i : inventario) {
			if (i != null) {
				System.out.println(i.getNombre());
			}
		}
	}

	public static void removeAnimal(String name) {

		for (int i = 0; i < inventario.length ; i++) {
			if (inventario[i] != null && inventario[i].getNombre() == name) {
				inventario[i] = null;
				i=inventario.length;
			}
		}

	}
	
	public static void removeAllAnimals() {
		
		for (int i = 0; i < inventario.length; i++) {
				inventario[i] = null;
		}
		
	}

}
