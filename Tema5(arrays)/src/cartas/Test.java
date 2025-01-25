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
		.put("as", 11);
		baraja.put("tres", 10);
		baraja.put("sota", 2);
		baraja.put("caballo", 3);
		baraja.put("rey", 4);
		
		ArrayList<Carta> baraja = new ArrayList<Carta>;
		
		for (int i = 0; i < barajasize; i++) {
			
			do {
				c1 = new Carta();
			}while(baraja.containsValue(c1.getNumero()));

			if(c1.getNumero().equalsIgnoreCase("as")) {
				puntuacion = 11;
			}else if(c1.getNumero().equalsIgnoreCase("tres")) {
				puntuacion = 10;
			}else if(c1.getNumero().equalsIgnoreCase("sota")) {
				puntuacion = 2;
			}else if(c1.getNumero().equalsIgnoreCase("caballo")) {
				puntuacion = 3;
			}else if(c1.getNumero().equalsIgnoreCase("rey")) {
				puntuacion = 4;
			}else puntuacion = 0;
			
			baraja.put(c1.getPalo(), puntuacion);
		}	
		
		System.out.println(baraja.keySet());
		
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
