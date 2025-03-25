package multimedia;

public class Pelicula extends Multimedia {

	String ActorPrin;
	String ActrizPrin;
	
	
	public Pelicula(String titulo, String autor, String formato, String duracion, String ActorPrin) {
		super(titulo, autor, formato, duracion);
		this.ActorPrin = ActorPrin;
		
	}
	
	public Pelicula(String titulo, String autor, String formato, String duracion, String ActorPrin, String ActrizPrin) {
		super(titulo, autor, formato, duracion);
		this.ActorPrin = ActorPrin;
		this.ActrizPrin = ActrizPrin;
		
	}
	
	
	
	public String getActorPrin() {
		return ActorPrin;
	}

	public void setActorPrin(String actorPrin) {
		ActorPrin = actorPrin;
	}

	public String getActrizPrin() {
		return ActrizPrin;
	}

	public void setActrizPrin(String actrizPrin) {
		ActrizPrin = actrizPrin;
	}

	@Override
	public String toString() {
		
		return "Pelicula Titulo: " + titulo + ", Autor: " + autor + ", Formato: " + formato + ", Duracion: " + duracion
				+ ", Actor Principal" + ActorPrin + ", Actriz Principal: " + ActrizPrin + "\n";
	}
	
	
	
	

}
