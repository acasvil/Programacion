package jugadores;
import java.util.*;

public class Jugadores {
	
	//Atributos
	
	String nombre;
	int edad;
	String equipo;
	
	Jugadores(String nombre, int edad, String equipo){
		
		this.nombre = nombre;
		this.edad = edad;
		this.equipo = equipo;
		
	}

	public String toString() {
		return "Jugador: " + nombre + "\t edad: " + edad + "\t equipo: " + equipo;
	}
	
	
	
}
