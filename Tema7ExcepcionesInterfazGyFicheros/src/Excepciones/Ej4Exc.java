package Excepciones;

public class Ej4Exc {
	
	public static String Ejer6(int num) {
		try {
			if(num % 2 == 0) {
				throw new Exception("Lanzando excepcion");
			}
			return "coliflor";
		}catch(Exception ex) {
			return "patata";
		} finally {
			System.out.println("Ejeccucion del finally");
		}
	}

	public static void main(String[] args) {
		
		System.out.println(Ejer6(1));
			

	}

}
