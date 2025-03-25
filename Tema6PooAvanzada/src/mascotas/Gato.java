package mascotas;

public class Gato extends Mascotas {
	
	private String color;
	private boolean peloLargo;
	
	public Gato(String nombre, int edad, String estado, String fechaNacimiento, String color, boolean peloLargo) {
		super(nombre, edad, estado, fechaNacimiento);
		this.color = color;
		this.peloLargo = peloLargo;
	}
	
	@Override
	public String hablar() {
		return "Miau";
	}
	
	
	@Override
	public String muestra() {
		return "Soy un Gato ";
	}

	
}
