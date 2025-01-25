package cartas;

import java.util.*;

public class Carta implements Comparable {

	private static String[] n = { "as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey" };
	private static String[] p = { "bastos", "copas", "espadas", "oros" };

	private String numero;
	private String palo;
	private Integer eqnum;

	public Carta() {
		this.eqnum = (int) (Math.random() * 10);
		this.numero = n[eqnum];
		this.palo = p[(int) (Math.random() * 4)];
	}

	public String getNumero() {
		return numero;
	}

	public int getEqnum() {
		return eqnum;
	}

	public void setEqnum(int eqnum) {
		this.eqnum = eqnum;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public void setnull() {

		setPalo(null);
		setNumero(null);

	}

	@Override
	public String toString() {
		return "Carta: " + numero + " de " + palo + "\n";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;

		if (!this.numero.equals(other.getNumero()) || !this.palo.equals(other.getPalo())) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public int compareTo(Object o) {
		Carta c = (Carta) o;

		if (palo.equals(c.getPalo())) {
			return numero.compareTo(c.getNumero());
		} else {
			return palo.compareTo(c.getPalo());
		}

	}

}