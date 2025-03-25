package ownComparator;

public class Alumno2 extends Alumno implements Comparar{

	public Alumno2(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean esMenor(Object objeto) {
		
		if(objeto instanceof Alumno) {
			
			Alumno a = (Alumno) objeto;
			if(a.getEdad() > this.getEdad()) {
				return true;
			}else {
				return false;
			}
			
		}
		
		return false;
	}

	@Override
	public boolean esMayor(Object objeto)  {
		
		if(objeto instanceof Alumno) {
			
			Alumno a = (Alumno) objeto;
			if(a.getEdad() < this.getEdad()) {
				return true;
			}else {
				return false;
			}
			
		}
		
		return false;
	}

	@Override
	public boolean esigual(Object objeto) {
		
		if(objeto instanceof Alumno) {
			
			Alumno a = (Alumno) objeto;
			if(a.getEdad() == this.getEdad()) {
				return true;
			}else {
				return false;
			}
			
		}
		
		return false;
	}
}
