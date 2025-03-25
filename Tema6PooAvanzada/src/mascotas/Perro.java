package mascotas;

public class Perro extends Mascotas {

	private String raza;
	private boolean pulgas;
	
	public Perro(String nombre, int edad, String estado, String fechaNacimiento, String raza, boolean pulgas) {
		super(nombre, edad, estado, fechaNacimiento);
		this.raza = raza;
		this.pulgas = pulgas;
	}
	
	@Override
	public String hablar() {
		return "Woof";
	}
	
	@Override
	public String muestra() {
		return "Soy un perro";
	}

}
