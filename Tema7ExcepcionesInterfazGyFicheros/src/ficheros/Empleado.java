package ficheros;

public class Empleado extends Persona{
	
	double sueldo;

	public Empleado(String dni, String nombreCompleto, int edad, double sueldo) {
		super(dni, nombreCompleto, edad);
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return super.toString() + "Empleado [sueldo=" + sueldo + "]";
	}
	
	
}
