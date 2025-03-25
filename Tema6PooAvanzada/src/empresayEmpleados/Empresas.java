package empresayEmpleados;
import java.util.*;

public class Empresas {
	
	private String nombre;
	private String CIF;
	private int telefono;
	private String direccion;
	private ArrayList<Trabajadores> trabajadores = new ArrayList<Trabajadores>();
	
	public Empresas(String nombre, String CIF) {
		
		this.nombre = nombre;
		this.CIF = CIF;
		
	}
	
	public void addEmployees(Empleados m) {
		
		trabajadores.add(m);
		
	}
	
	public void removeEmployees(Empleados m) {
		
		trabajadores.remove(m);
		
	}
	
	public void showAllEmployees() {
		
		Iterator it = trabajadores.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next().toString());
			System.out.println();
		}
		
	}
	
	public void showEmployees() {
		
		for(Trabajadores M: trabajadores) {
			System.out.println("Empleado: " + m.getNombre() + " DNI: " + m.getDNI() + 
					" Sueldo bruto: " + m.getSueldoB() + " Sueldo neto: " + m.getSueldoN());
			System.out.println();
		}
		
	}
	
	public double showAllNetSalary() {
		
		double total = 0;
		
		for(int i = 0 ; i < trabajadores.size(); i++) {
			Empleados m = (Empleados)trabajadores.get(i);
			total += m.getSueldoN();
			System.out.println();
		}
		
		return total;
		
	}
	
	public double showAllGrossSalary() {
		
		double total = 0;
		
		for(int i = 0 ; i < trabajadores.size(); i++) {
			Empleados m = (Empleados)trabajadores.get(i);
			total += m.getSueldoB();
		}
		
		return total;
		
	}
	
}
