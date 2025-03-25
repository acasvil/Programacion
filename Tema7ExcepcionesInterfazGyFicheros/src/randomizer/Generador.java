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
		
		int RandomNumber = ((int) (Math.random()*max) + min);
		
		return RandomNumber;
	}
	
	public static double getRandomDouble(int min, int max, int decimales) {
		
		double RandomNumber = ((Math.random()*max) + min);
		Math.round((RandomNumber * 100d) / 100d);
		
		return RandomNumber;
	}
	
	

}
