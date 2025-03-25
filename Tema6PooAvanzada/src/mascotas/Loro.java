package mascotas;

public class Loro extends Aves{
	
	private String origen;
	private boolean habla;
	
	public Loro(String nombre, int edad, String estado, String fechaNacimiento, boolean pico, boolean vuela
			,String origen, boolean habla) {
		super(nombre, edad, estado, fechaNacimiento, pico, vuela);
		this.origen = origen;
		this.habla = habla;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public boolean isHabla() {
		return habla;
	}

	public void setHabla(boolean habla) {
		this.habla = habla;
	}

	@Override
	public String hablar() {
		return "Soy un Loro y se hablar";
	}

	@Override
	public String muestra() {
		return "Soy un Loro";
	}

	@Override
	public boolean volar() {
		
		if(this.isVuela()) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public String saluda() {
		return "holaaa";
	}

}
