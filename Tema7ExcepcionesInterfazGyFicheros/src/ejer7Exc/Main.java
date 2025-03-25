package ejer7Exc;

public class Main {

	public static void main(String[] args) throws Ejer7Exc {

		
		try {
			throw new Ejer7Exc("Patata");
		}catch(Ejer7Exc e) {
			System.out.println(e);
		}
		
		

	}

}
