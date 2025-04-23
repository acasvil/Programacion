package randomizer;
import java.util.*;
import java.lang.Math;


public abstract class Generador {
	
	private static ArrayList<String> nombres = new ArrayList<String>();
	
	static {
		nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("María");
        nombres.add("Javier");
        nombres.add("Sofía");
        nombres.add("Pedro");
        nombres.add("Elena");
        nombres.add("Raúl");
        nombres.add("Lucía");
        nombres.add("Diego");
        nombres.add("Patricia");
        nombres.add("Fernando");
        nombres.add("Isabel");
        nombres.add("Hugo");
        nombres.add("Camila");
        nombres.add("Andrés");
        nombres.add("Valeria");
        nombres.add("Daniel");
        nombres.add("Gabriela");
	}
	
	public static String getRandomName() {
		
		String RandomName = nombres.get((int) (Math.random()*20));
		
		return RandomName;
	}
	
	public static int getRandomNumber(int min, int max) {
	    return (int) (Math.random() * (max - min + 1)) + min;
	}
	
	public static double getRandomDouble(int min, int max) {
		
		return (double) (Math.random() * (max - min + 1)) + min;
	}
	
	public static String dniGenerator() {
		
		String dni = "5";
		int cuerpo;
		int nletra;
		char letra;
		
		cuerpo = getRandomNumber(0000000, 9999999);
		// 65- 90
		nletra = getRandomNumber(65,90);
		letra = (char) nletra;
		
		dni = dni + cuerpo + letra;
		
		return dni;
	}
	

}
