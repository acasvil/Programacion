package universidad;

public class Profesor extends Empleado {

	Departamento departamento;
	
	public Profesor(String nombre, String apellidos, String estadocivil, int id, String añoincorp, String numdesp, Departamento departamento) {
		super(nombre, apellidos, estadocivil, id, añoincorp, numdesp);
		this.departamento = departamento;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}	
	
	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", apellidos=" + apellidos + ", estadocivil=" + estadocivil + ", id=" + id
				+ ", año de incorporacion= " + añoincorp + ", numero de despacho= " + numdesp + "]";
	}

}
