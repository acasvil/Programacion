package alumnoEjer8;

public class Alumno extends Exception{
	
	String nombre;
	int edad;
	double nota;
	
	public Alumno(String nombre, int edad, double nota) {
		this.nombre = nombre;
		this.edad = edad;
		this.nota = nota;
	}
	
	
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) throws EdadNoValidaException {
		
		if(edad < 0 ) {
			throw new EdadNoValidaException(edad);
		}else {
			this.edad = edad;
		}
		
	}
	public String getNombre() {
		return nombre;
	}
	
	public double getNota() {
		return nota;
	}

	public void setNota(double nota) throws NotaNoValidaException{
		
		if(nota < 0 || nota > 10) {
			throw new NotaNoValidaException(nota);
		}else {
			this.nota = nota;
		}
		
	}
	
	
	
}
