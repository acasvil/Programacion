package universidad;
import java.util.*;

public class Estudiante extends Persona {
	
	int curso;
	
	public Estudiante(String nombre, String apellidos, String estadocivil, int id, int curso) {
		super(nombre, apellidos, estadocivil, id);
		this.curso = curso;
	}
	
	
	@Override
	public String toString() {
		return "Estudiante " + super.toString() + "curso=" + curso + "]";
				 
	}


	public int getCurso() {
		return curso;
	}


	public void setCurso(int curso) {
		this.curso = curso;
	}



}
