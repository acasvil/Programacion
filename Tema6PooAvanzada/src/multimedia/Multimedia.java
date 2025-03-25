package multimedia;

import java.util.Objects;

public class Multimedia {
	
	String titulo;
	String autor;
	String formato;
	String duracion;
	
	
	public Multimedia(String titulo, String autor, String formato, String duracion){
		
		this.titulo = titulo;
		this.autor = autor;
		this.formato = formato;
		this.duracion = duracion;
		
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getFormato() {
		return formato;
	}


	public void setFormato(String formato) {
		this.formato = formato;
	}


	public String getDuracion() {
		return duracion;
	}


	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}


	@Override
	public String toString() {
		return "Multimedia Titulo: " + titulo + ", Autor: " + autor + ", Formato: " + formato + ", Duracion: " + duracion + "\n";
	}


	@Override
	public int hashCode() {
		return Objects.hash(autor, titulo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Multimedia other = (Multimedia) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(titulo, other.titulo);
	}
	
	
	
}
