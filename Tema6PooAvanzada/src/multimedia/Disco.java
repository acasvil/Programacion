package multimedia;

public class Disco extends Multimedia {

	String genero;
	
	public Disco(String titulo, String autor, String formato, String duracion, String genero) {
		super(titulo, autor, formato, duracion);
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	

	
	
}
