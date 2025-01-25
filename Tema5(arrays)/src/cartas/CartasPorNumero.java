package cartas;
import java.util.Comparator;

public class CartasPorNumero implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
	 
	 Carta c1=(Carta)o1;
	 Carta c2=(Carta)o2;
	 
	 Integer numeroCompare = c1.getEqnum().compareTo(c2.getEqnum());
	 
	 int paloCompare = c1.getPalo().compareTo(c2.getPalo());
	 
	 return (paloCompare == 0) ? numeroCompare : paloCompare;
	 }
}
