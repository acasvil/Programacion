package alumnoEjer8;

public class NotaNoValidaException extends Exception{
	
	double nota;

	public NotaNoValidaException(double nota) {
		super("La nota "+ nota + " no es valida");
	}
	
}
