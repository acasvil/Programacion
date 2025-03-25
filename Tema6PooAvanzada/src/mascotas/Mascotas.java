package mascotas;

public abstract class Mascotas{
	
	private String nombre;
	private int edad;
	private String estado;
	private String fechaNacimiento;
	
	public Mascotas(String nombre, int edad, String estado, String fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.estado = estado;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public abstract String hablar();
	
	public void cumpleaños() {
		edad++;
		
		System.out.println(this.nombre + " ha cumplido años, ahora tiene "+ edad);
	}
	
	public boolean muerto(boolean muerto) {
		
		return muerto;
		
	}
	
	public abstract String muestra();
	
	
	
	
	
}
