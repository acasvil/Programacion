package empresayEmpleados;

public class Trabajadores {
	
	private String nombre;
	private String DNI;
	
	
	public Trabajadores(String nombre,String DNI) {
		
		this.nombre=nombre;
		this.DNI=DNI;

		
	}

	

	public String getNombre() {
		return nombre;
	}

	public String getDNI() {
		return DNI;
	}
	
	
}
