package ejer11HashMap;
import java.util.*;

public class Ejer11HashMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> colores = new HashMap<Integer, String>();
		
		colores.put(1,"Red");
		colores.put(1,"Green");
		colores.put(2,"Black");
		colores.put(3,"White");
		colores.put(4,"Blue");
		
		Iterator<Integer> it = colores.keySet().iterator();
		
		while(it.hasNext()) {
			int key = it.next();
			System.out.println("Clave: " + key + " Valor: " + colores.get(key));
		}
	}

}
