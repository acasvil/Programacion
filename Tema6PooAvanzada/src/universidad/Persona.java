package universidad;

public class Persona {
	
	protected String nombre;
	protected String apellidos;
	protected String estadocivil;
	protected int id;
	
	public Persona(String nombre, String apellidos, String estadocivil, int id){
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.estadocivil = estadocivil;
		this.id = id;
		
	}

	public String getEstadocivil() {
		return estadocivil;
	}

	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}

	@Override
	public String toString() {
		return " nombre=" + nombre + ", apellidos=" + apellidos + ", estadocivil=" + estadocivil + ", id=" + id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
}
