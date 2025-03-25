package ownComparator;

public class Main {

	public static void main(String[] args) {
		
		Alumno [] alums= new Alumno [5];
		
		Alumno2 a1 = new Alumno2("Garnacho", 19);
		Alumno2 a2 = new Alumno2("Belen", 30);
		Alumno2 a3 = new Alumno2("David", 21);
		Alumno2 a4 = new Alumno2("Jesus", 17);
		Alumno2 a5 = new Alumno2("Gabriel", 19);
		
		alums[0] = a1;
		alums[1] = a2;
		alums[2] = a3;
		alums[3] = a4;
		alums[4] = a5;
		
		Vehiculo [] vehis = new Vehiculo[5];
		
		Vehiculo2 v1 = new Vehiculo2(2839.43, "AAA 1234");
		Vehiculo2 v2 = new Vehiculo2(2503.23, "BBB 1234");
		Vehiculo2 v3 = new Vehiculo2(1663.23, "CCC 1234");
		Vehiculo2 v4 = new Vehiculo2(1948.01, "DDD 1234");
		Vehiculo2 v5 = new Vehiculo2(2839.43, "EEE 1234");
		
		vehis[0] = v1;
		vehis[1] = v2;
		vehis[2] = v3;
		vehis[3] = v4;
		vehis[4] = v5;
		
		
		System.out.println("----------------------- PARTE DE ALUMNOS ---------------------");
		
		System.out.println();
		
		System.out.println("----------------------- TO STRING ---------------------");
		
		
		for(Alumno a: alums) {
			System.out.println(a);
		}
		
		System.out.println("----------------------- ¿A1 EDAD IGUAL QUE A5 EDAD? ---------------------");
		
		System.out.println(a1.esigual(a5));
		
		System.out.println("----------------------- ¿A1 EDAD ES MAYOR QUE A3 EDAD? ---------------------");
		
		System.out.println(a1.esMayor(a3));
		
		System.out.println("----------------------- ¿A3 EDAD ES MENOR QUE A2 EDAD? ---------------------");
		
		System.out.println(a3.esMenor(a2));
		System.out.println();
		
		System.out.println("----------------------- PARTE DE VEHICULOS ---------------------");
		
		System.out.println();
		
		System.out.println("----------------------- TO STRING ---------------------");
		
		for(Vehiculo v: vehis) {
			System.out.println(v);
		}
		
		System.out.println("----------------------- ¿V1 PESO ES IGUAL QUE V5 PESO? ---------------------");
		
		System.out.println(v1.esigual(v5));
		
		System.out.println("----------------------- ¿V1 PESO ES MAYOR QUE A3 PESO? ---------------------");
		
		System.out.println(v1.esMayor(v3));
		
		System.out.println("----------------------- ¿V3 PESO ES MENOR QUE V2 PESO? ---------------------");
		
		System.out.println(v3.esMenor(v2));
		
		
	}

}
