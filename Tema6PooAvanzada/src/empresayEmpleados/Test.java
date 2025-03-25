package empresayEmpleados;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int opcion = -1;
		Empleados m1 = new Empleados("Carlo", "52034923F", 2500);
		Empleados m2 = new Empleados("Vinisiu", "50964893N", 1400);
		Empleados m3 = new Empleados("Rodrygo", "51005761X", 500);
		Empleados m4 = new Empleados("Lara", "50938894L", 1600);

		Empresas e1 = new Empresas("Apple", "52123412D");

		while (opcion != 0) {

			System.out.println("1. Añadir empleados");
			System.out.println("2. Eliminar empleados");
			System.out.println("3. Mostrar todo de los empleados");
			System.out.println("4. Mostrar sueldos de los empleados");
			System.out.println("5. Mostrar el gasto de la empresa en salarios brutos");
			System.out.println("6. Mostrar el gasto de la empresa en salarios netos");
			System.out.println("7. Mostrar sueldo neto del empresario 1");
			System.out.println("8. Salir");
			
			opcion = entrada.nextInt();
			
			switch (opcion) {
			case 1:
				e1.addEmployees(m1);
				e1.addEmployees(m2);
				e1.addEmployees(m3);
				e1.addEmployees(m4);
				break;
			case 2:
				e1.removeEmployees(m2);
				e1.removeEmployees(m4);
				break;
			case 3:
				e1.showAllEmployees();
				break;
			case 4:
				e1.showEmployees();
				break;
			case 5:
				System.out.println(e1.showAllGrossSalary());
				break;
			case 6:
				System.out.println(e1.showAllNetSalary());
				break;
			case 7:
				System.out.println(m1.getSueldoN());
				break;
			case 8:
				System.out.println("Saliendo...");
				opcion = 0;
				break;

			}

		}

	}

}
