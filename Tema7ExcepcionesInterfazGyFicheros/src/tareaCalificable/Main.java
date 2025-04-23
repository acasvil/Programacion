package tareaCalificable;

import java.util.*;
import java.io.*;

public class Main {

//	Crea y sube a esta tarea una clase java SE17 para probar los métodos de File, al menos los siguientes:
//		1- Debes crear y comprobar si existen los ficheros y directorios. Si no existen, debes crearlos.
//		2 - Debes renombrar directorios y ficheros que estén en alguna ruta que no sea el directorio raíz. 
//    	Es decir, la ruta debe contener al menos dos carpetas anidadas.
//		3 - Debes mover ficheros de un directorio a otro. Si el directorio destino no existe, debes crearlo.
//		4 - Debes borrar ficheros y directorios en el orden adecuado. 
//	   ¿Qué problemas pueden surgir al borrar un directorio que contiene otros ficheros dentro?
//  	¿Y si tiene otros directorios dentro pero sin ficheros? Prueba y refleja estos casos.
//		5 - Realiza un código ordenado con métodos para cada operación que se quiera realizar 
//  	e incluye comentarios explicando lo que se pretende hacer.
//		6 - Tendrás que explicar en clase el código creado, todo lo que hace y hacer demostración. Para ello dispondrás de 5 minutos.

	public static void crearComprobar(File f) throws IOException {

		Scanner sc = new Scanner(System.in);
		String opcion;
		File ruta = new File(f.getParent());
		
		if (f.exists()) { // Se comprueba si el directorio ya existe
			System.out.println("El directorio ya existe");
		} else {
			
			if(!ruta.exists()) {
				ruta.mkdirs();  // Si la ruta no existe la creo
			}
			
			System.out.println("Elige lo que quieres crear ¿Fichero o directorio?");
			opcion = sc.next();
			if (opcion.equalsIgnoreCase("Directorio")) { // Si devuelve directorio se crea toda la ruta
				if (f.mkdirs()) {
					System.out.println("Se ha creado el directorio correctamente");
				} else {
					System.out.println("No se ha creado el directorio correctamente");
				}
			} else if (opcion.equalsIgnoreCase("Fichero")) { // Si devuelve Fichero se crea el fichero
				if (f.createNewFile()) {
					System.out.println("Se ha creado el fichero correctamente");
				} else {
					System.out.println("No se ha creado el fichero correctamente");
				}
			}
		}

	}

	public static void renombrar(File f, String nomNuevo) throws IOException {

		if (f.exists()) { // Se comprueba si existe
			File f1 = new File(f.getParent(), nomNuevo);
			if (f.renameTo(f1)) { // Se cambia el nombre, si sale bien devuelve true sino false
				System.out.println("El cambio de nombre se ha realizado correctamente");
			} else {
				System.out.println("El cambio de nombre no se ha completado");
			}
		} else { // Da fallo si el archivo al cual cambiarle el nombre no existe
			System.out.println("No se puede cambiar el nombre de un archivo que no existe");
		}

	}

	public static void move(File origen, File destino) {

		if (origen.exists()) {

			if (!destino.exists()) { // Compruebo si el destino existe, sino lo creo
				destino.mkdirs();
			}

			File f1 = new File(destino.getPath(), origen.getName());
			if (origen.renameTo(f1)) { // Compruebo si el rename ha funcionado
				System.out.println("Se ha hecho el cambio de ruta correctamente");
			} else {
				System.out.println("No se ha podido hacer el cambio de ruta");
			}

		} else {
			System.out.println("No puedes mover un archivo que no existe");
		}

	}

	public static void borrarBasico(File origen) {

		if (origen.exists()) {  // Compruebo que existe el origen

			if (!origen.delete()) {  // Si el delete de origen no funciona y existe significa que es una carpeta

				String[] contenido = origen.list();  // Se lista el contenido de la carpeta para ir borrando uno a uno

				for (int i = 0; i < contenido.length; i++) {

					File f = new File(origen.getPath(), contenido[i]);

					if (f.isFile()) { 
						f.delete();  // Si es un archivo lo puede borrar directamente
					} else if (f.isDirectory()) {
						borrarBasico(f);  // Si es una carpeta se llama a este mismo método para que borre todo lo que tenga dentro
					}

				}

				origen.delete();  // Para que borre la carpeta por la cual estaba pasando
			}

		}else {
			System.out.println("No se puede borrar si no existe");
		}

	}

	public static void main(String[] args) throws IOException {
		
		 // Compruebo todos los metodos
		
		File f = new File("prueba\\hola");
		File destino = new File("prueba\\prueba1\\prueba2");
		File borrar = new File("prueba");

//		crearComprobar(f);
//		renombrar(f, "prueba2");				// Ejecutarlos todos a la vez puede parecer que los metodos no hacen 
//		move(f, destino);					// lo que deberian pero si funcionan
//		borrarBasico(borrar);

	}

}
