package modelo;

public class Contacto {
	
	String nombre;
	String apellidos;
	int numero;
	
	public Contacto(String nombre, int numero) {
		
		this.nombre = nombre;
		this.numero = numero;
		
	}
	
	public Contacto(String nombre, String apellidos, int numero) {
		
		this(nombre, numero);
		this.apellidos = apellidos;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;
	    Contacto other = (Contacto) obj;
	    return numero == other.numero;
	}
	
	
}
