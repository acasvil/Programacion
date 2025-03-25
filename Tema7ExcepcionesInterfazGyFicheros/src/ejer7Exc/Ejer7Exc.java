package ejer7Exc;

public class Ejer7Exc extends Exception{
	
	String prueba;

	public Ejer7Exc(String prueba) {
		this.prueba = prueba;
	}
	
	public void mostrar() {
		System.out.println(prueba);
	}

	@Override
	public String toString() {
		return "Ejer7Exc [prueba=" + prueba + "]";
	}
	
}
