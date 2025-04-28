package modelo;

public class Reserva {
	
	private String nombre;
	private int numero;
	private String apellidos;
	private int habitacion;
	private boolean todoIncluido;
	
	public Reserva(String nombre, int numero, String apellidos, int habitacion, boolean todoIncluido) {
		this.nombre = nombre;
		this.numero = numero;
		this.apellidos = apellidos;
		this.habitacion = habitacion;
		this.todoIncluido = todoIncluido;
	}
	
	public Reserva(String nombre, int numero, int habitacion, boolean todoIncluido) {
		this.nombre = nombre;
		this.numero = numero;
		this.habitacion = habitacion;
		this.todoIncluido = todoIncluido;
	}
	
	
	
}
