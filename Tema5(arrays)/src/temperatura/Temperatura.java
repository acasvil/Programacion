package temperatura;
import java.util.*;

public class Temperatura {

	private static Scanner entrada = new Scanner(System.in);
	
	public static void addtemp(ArrayList<Double> temp) {
		
		double temperatura;
		System.out.println("¿Que temperatura deseas añadir?");
		temperatura = entrada.nextDouble();
		temp.add(temperatura);
		
	}
	
	public static double avgtemp(ArrayList<Double> temp) {
		
		double total=0;
		
		for(int i = 0; i < temp.size() ; i++) {
			total+=temp.get(i);
		}
		
		total = (total/temp.size());
		
		return total;
	}
	
	public static double [] MaxMintemp (ArrayList<Double> temp) {
		
		double maxTemp = temp.get(0);
		double minTemp = temp.get(0);
		double [] maxMin = new double [2]; 
		
		for(int i = 0; i < temp.size() ; i++) {
			
			if( temp.get(i) > maxTemp) {
				maxTemp = temp.get(i);
			}

			if( temp.get(i) < minTemp) {
				minTemp = temp.get(i);
			}
		}
		
		
		
		maxMin[0]=maxTemp;
		maxMin[1]=minTemp;
		
		return maxMin;
		
	}
	
	public static void listTemp (ArrayList<Double> temp) {
		
		System.out.println("Temperaturas:");
		
		for(int i = 0; i < temp.size() ; i++) {
			
			System.out.println(i+". " + temp.get(i));
			
		}
		
		System.out.println();
	}
	
	public static int searchTemp(ArrayList<Double> temp,double seek) {
		
		boolean flag = false;
		int posicion = -1;
		
		for(int i = 0; i < temp.size() && !flag ; i++ ){
			
			if(temp.get(i) == seek) {
				flag = true;
				posicion = i;
			}
		}
		return posicion;	
	}
	
	public static boolean deleteTemp(ArrayList<Double> temp, double seek) {
		
		if(searchTemp(temp,seek) == -1) {
			return false;
		}else {
			temp.remove(searchTemp(temp,seek));
			return true;
		}
		
		
	}
	

}
