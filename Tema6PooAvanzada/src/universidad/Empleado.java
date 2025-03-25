package universidad;

public class Empleado extends Persona{
	
	String añoincorp;
	String numdesp;
	
	public Empleado(String nombre, String apellidos, String estadocivil, int id, String añoincorp, String numdesp) {
		super(nombre, apellidos, estadocivil, id);
		this.añoincorp = añoincorp;
		this.numdesp = numdesp;
	}

	public String getNumdesp() {
		return numdesp;
	}

	public void setNumdesp(String numdesp) {
		this.numdesp = numdesp;
	}
	
	@Override
	public String toString() {
		return "Empleado " + super.toString() + ", año de incorporacion= " + añoincorp + ", numero de despacho= " + numdesp;
	}
	
}
