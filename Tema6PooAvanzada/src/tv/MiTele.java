package tv;

public class MiTele implements Televisor{
	
	private int numCanales = 20;
	private int canalActual = 0;
	boolean encendida = false;
	
	
	@Override
	public void encender() {
		encendida = true;
		
	}

	@Override
	public void apagar() {
		encendida = false;
		
	}

	@Override
	public void cambiarCanal() {
		canalActual++;
		
	}

}
