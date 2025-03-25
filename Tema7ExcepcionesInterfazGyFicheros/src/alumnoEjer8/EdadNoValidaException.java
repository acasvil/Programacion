package alumnoEjer8;

public class EdadNoValidaException extends Exception{
	
	int edad;

	public EdadNoValidaException(int edad) {
		super("La edad: "+ edad + " no es valida");
	}
	
	

}
