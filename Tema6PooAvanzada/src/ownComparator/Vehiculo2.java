package ownComparator;

public class Vehiculo2 extends Vehiculo implements Comparar{

	public Vehiculo2(double peso, String matricula) {
		super(peso, matricula);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean esMenor(Object objeto)  {
		
		if(objeto instanceof Vehiculo) {
			
			Vehiculo a = (Vehiculo) objeto;
			if(a.getPeso() > this.getPeso()) {
				return true;
			}else {
				return false;
			}
			
		}
		
		return false;
	}

	@Override
	public boolean esMayor(Object objeto) {
		
		if(objeto instanceof Vehiculo) {
			
			Vehiculo a = (Vehiculo) objeto;
			if(a.getPeso() < this.getPeso()) {
				return true;
			}else {
				return false;
			}
			
		}
		
		return false;
	}

	@Override
	public boolean esigual(Object objeto) {
		
		if(objeto instanceof Vehiculo) {
			
			Vehiculo a = (Vehiculo) objeto;
			if(a.getPeso() == this.getPeso()) {
				return true;
			}else {
				return false;
			}
			
		}
		
		return false;
	}

}
