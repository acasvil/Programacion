package cartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.*;

public class Test {

	public static void main(String[] args) {

		int barajasize = 5;
		Carta c1 = new Carta();
		int puntuacion = 0;
		
		HashMap<String, Integer> plantilla = new HashMap<String, Integer>();
		ArrayList<Carta> baraja = new ArrayList<Carta>();
		
		plantilla.put("as", 11);
		plantilla.put("tres", 10);
		plantilla.put("sota", 2);
		plantilla.put("caballo", 3);
		plantilla.put("rey", 4);
		
		
		
		for (int i = 0; i < barajasize; i++) {
			
			do {
				c1 = new Carta();
			}while(baraja.contains(c1));

			if(plantilla.containsKey(c1.getNumero())) {
				
				puntuacion+=plantilla.get(c1.getNumero());
			}
			
			baraja.add(c1);
		}	
		
		System.out.println(baraja);
		System.out.println("puntuacion: " + puntuacion);
		
//		System.out.println(baraja.toString());
//		
//		Collections.sort(baraja);
//		System.out.println(baraja.toString());
//		
//		Collections.sort(baraja, new CartasPorNumero());
//		
//		System.out.println(baraja.toString());
//		System.out.println("Puntuación total: " + puntuacion);
		
	}

}
