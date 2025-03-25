package biblio;

import java.util.Date;

public class Revista extends Ejemplar{

	private int number;
	
	public Revista(String code, String title, Date arriveDate, int number) {
		super(code, title, arriveDate);
		this.number = number;
		
	}

	@Override
	public String toString() {
		return "Revista" +  super.toString() +  ", number=" + number + "]";
	}

	
	
	

}
