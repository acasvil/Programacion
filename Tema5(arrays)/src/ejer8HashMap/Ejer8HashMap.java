package ejer8HashMap;

import java.util.*;

public class Ejer8HashMap {

	public static void main(String[] args) {

		String usuario;
		String clave;
		int intentos = 3;
		boolean acierto = false;

		HashMap<String, String> usuarios = new HashMap<String, String>();

		usuarios.put("Adriano", "Patata");
		usuarios.put("David", "Macarrones");
		usuarios.put("Javier", "Pa");
		usuarios.put("Carla", "Pat");
		usuarios.put("Nixon", "Pata");
		usuarios.put("Angel", "Patat");

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce tu nombre de usuario:");
		usuario = entrada.next();
		System.out.println("Introduce tu contraseña");
		clave = entrada.next();

		for (int i = 0; i < intentos && acierto == false ; i++) {

			if (usuarios.get(usuario).equalsIgnoreCase(clave)) {
				System.out.println("Contraseña correcta accediendo al sistemas");
				acierto = true;
			} else if (usuarios.get(usuario) != null && intentos > 0 && acierto == false) {
				System.out.println("Intento fallido");
				intentos--;
				System.out.println("Introduce tu contraseña intentos restantes: " + intentos);
				clave = entrada.next();
			} else if (usuarios.get(usuario) == null) {
				System.out.println("El usuario introducido no existe");
			} else if (intentos == 0) {
				System.out.println("Inicio de sesion fallido");
			}
		}
		
		if (usuarios.get(usuario).equalsIgnoreCase(clave)) {
			System.out.println("Contraseña correcta accediendo al sistemas");
			acierto = true;
		}else if(intentos == 0 && acierto == false) {
			System.out.println("Inicio de Sesion completos fallido");
		}
	}

}
