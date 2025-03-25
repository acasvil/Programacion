package empresayEmpleados;

public class Empleados extends Trabajadores{
	
	private double sueldoB;
	private int edad;
	private int telefono;
	private String direccion;
	
	public Empleados(String nombre, String DNI, int sueldoB) {
		super(nombre, DNI);
		this.sueldoB = sueldoB;

	}

	public double getSueldoB() {
		return sueldoB;
	}

	public void setSueldoB(double sueldoB) {
		this.sueldoB = sueldoB;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getSueldoN() {
		
		double sueldoN;
		
		if((sueldoB*12) < 12000) {
			sueldoN=(sueldoB*0.80);
		}else if((sueldoB*12) < 25000) {
			sueldoN=(sueldoB*0.70);
		}else {
			sueldoN=(sueldoB*0.60);
		}
		
		return sueldoN;
		
		
	}
	
	@Override
	public String toString() {
		return "Empleados [nombre=" + super.getNombre() + ", DNI=" + super.getDNI() + ", sueldoB=" + sueldoB + ", edad=" + edad
				+ ", telefono=" + telefono + ", direccion=" + direccion + "]";
	}
	
	
	
	
	
	
}
