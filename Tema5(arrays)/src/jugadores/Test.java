package jugadores;

import java.util.*;

public class Test {

	public static void main(String[] args) {

		HashSet<Jugadores> plantilla = new HashSet();

		Jugadores Cristiano = new Jugadores("Cristiano", 40, "Al Nassr");
		Jugadores Vinicius = new Jugadores("Vinicius JR", 23, "Real Madrid");
		Jugadores Mbappe = new Jugadores("Mbappe Lotin", 26, "Real Madrid");
		Jugadores Messi = new Jugadores("Lionel Messi", 38, "Inter Miami");
		Jugadores Salah = new Jugadores("Mohammed Salah", 32, "Liverpool");

		plantilla.add(Cristiano);
		plantilla.add(Vinicius);
		plantilla.add(Mbappe);
		plantilla.add(Messi);

		for (Jugadores i : plantilla) {
			System.out.println(i);
		}

		System.out.println();

		HashSet<Jugadores> plantilla2 = new HashSet();
		plantilla2.add(Vinicius);
		plantilla2.add(Salah);

		for (Jugadores i : plantilla2) {
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println("¿Plantilla 1 tiene a Salah? : " + plantilla.contains(Salah));
		System.out.println();
		System.out.println("¿Plantilla 1 tiene todo lo que tiene plantilla 2?: " +  plantilla.containsAll(plantilla2));
		System.out.println();
		plantilla.addAll(plantilla2);

		for (Jugadores i : plantilla) {
			System.out.println(i);
		}

		System.out.println();
		System.out.println("¿Plantilla 1 tiene todo lo que tiene plantilla 2?: " + plantilla.containsAll(plantilla2));

		plantilla2.clear();

		for (Jugadores i : plantilla2) {
			System.out.println(i);
		}

		System.out.println();

		for (Jugadores i : plantilla) {
			System.out.println(i);
		}

	}

}
