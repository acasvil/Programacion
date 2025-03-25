package mascotas;

public class Canario extends Aves{
	
	private String color;
	private boolean canta;
	
	public Canario(String nombre, int edad, String estado, String fechaNacimiento, boolean pico, boolean vuela
			, String color, boolean canta) {
		super(nombre, edad, estado, fechaNacimiento, pico, vuela);
		this.color = color;
		this.canta = canta;
	}

	@Override
	public String hablar() {
		return "Kikiriki";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isCanta() {
		return canta;
	}

	public void setCanta(boolean canta) {
		this.canta = canta;
	}

	@Override
	public String muestra() {
		return "Soy un Canario";
	}

	@Override
	public boolean volar() {
		
		if(this.isVuela()) {
			return true;
		}else {
			return false;
		}
		
	}

}
