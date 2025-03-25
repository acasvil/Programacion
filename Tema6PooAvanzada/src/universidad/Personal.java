package universidad;

public class Personal extends Empleado {

	Seccion seccion;
	
	public Personal(String nombre, String apellidos, String estadocivil, int id, String añoincorp, String numdesp, Seccion seccion) {
		super(nombre, apellidos, estadocivil, id, añoincorp, numdesp);
		this.seccion = seccion;
	}

	public Seccion getSeccion() {
		return seccion;
	}

	public void setSeccion(Seccion seccion) {
		this.seccion = seccion;
	}
	
	@Override
	public String toString() {
		return "Personal de limpieza " + super.toString() + ", seccion= " + seccion  +"]";
	}
	
}
