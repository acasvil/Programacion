package com.example.rest_factura.configurator;

public class Pelicula {
	
	private int id_pelicula;
	private int anio;
	private String nombre;
	private String autor;
	
	public int getId_pelicula() {
		return id_pelicula;
	}
	public void setId_pelicula(int id_pelicula) {
		this.id_pelicula = id_pelicula;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Pelicula() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pelicula(int id_pelicula, int anio, String nombre, String autor) {
		super();
		this.id_pelicula = id_pelicula;
		this.anio = anio;
		this.nombre = nombre;
		this.autor = autor;
	}
	
	
	
}
