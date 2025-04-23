package ficheros;
import java.util.*;
import java.io.*;

public class Persona implements Serializable{
	
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombreCompleto=" + nombreCompleto + ", edad=" + edad + "]";
	}

	private String dni;
	private String nombreCompleto;
	private int edad;
	
	public Persona(String dni, String nombreCompleto, int edad) {
		this.dni = dni;
		this.nombreCompleto = nombreCompleto;
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}
