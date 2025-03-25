package biblio;
import java.time.LocalDate;
import java.util.*;

public abstract class Ejemplar {
	
	String code;
	String title;
	Date arriveDate = new Date();
	
	public Ejemplar(String code, String title, Date arriveDate) {
		super();
		this.code = code;
		this.title = title;
		this.arriveDate = arriveDate;
	}

	@Override
	public String toString() {
		return " [code=" + code + ", title=" + title + ", arriveyear=" + arriveDate + "";
	}

	public String getCode() {
		return code;
	}

	public Date getArriveyear() {
		return arriveDate;
	}

	

}