package biblio;

import java.util.Date;

public class Libros extends Ejemplar implements Prestable{

	boolean rent;
	
	public Libros(String code, String title, Date arriveDate, boolean rent) {
		super(code, title, arriveDate);
		this.rent = rent;
	}

	@Override
	public String toString() {
		return "Libro " + super.toString() + ", rent=" + rent + "]";
	}

	
	public void prestar() {
		rent = true;
		
	}

	
	public void devolver() {
		rent = false;
	} 

	public boolean GetRent() {
		return rent;
	}
	
	
	
}
