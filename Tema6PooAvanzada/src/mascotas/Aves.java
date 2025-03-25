package mascotas;

public abstract class Aves extends Mascotas {
	
	private boolean pico;
	private boolean vuela;
	
	public Aves(String nombre, int edad, String estado, String fechaNacimiento, boolean pico, boolean vuela) {
		super(nombre, edad, estado, fechaNacimiento);
		this.pico = pico;
		this.vuela = vuela;
	}

	public boolean isPico() {
		return pico;
	}

	public void setPico(boolean pico) {
		this.pico = pico;
	}

	public boolean isVuela() {
		return vuela;
	}

	public void setVuela(boolean vuela) {
		this.vuela = vuela;
	}

	public abstract boolean volar();

}
