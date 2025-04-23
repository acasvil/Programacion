package ficheros;
import java.util.*;

import randomizer.Generador;

import java.io.*;
import java.nio.file.spi.FileSystemProvider;

public class Ejer1Bol3 {
	
	public static void leer (File f) throws IOException, ClassNotFoundException, FileNotFoundException {
		
		Persona persona;
		FileInputStream f1 = new FileInputStream(f);
		ObjectInputStream datos = new ObjectInputStream(f1);
		
		try {
			while(true) {
				persona = (Persona) datos.readObject();
				System.out.println(persona);
			}
		}catch(EOFException e) {
			
		}
		datos.close();
	}
	
	public static void escribir(File f) throws FileNotFoundException, IOException {
		
		Persona persona;
		FileOutputStream fo = new FileOutputStream(f);
		ObjectOutputStream datos = new ObjectOutputStream(fo);
		
		String dnis[] = {Generador.dniGenerator(),Generador.dniGenerator(),Generador.dniGenerator(),
				Generador.dniGenerator(),Generador.dniGenerator(),Generador.dniGenerator(),Generador.dniGenerator()};
		
		String nombres[] = {Generador.getRandomName(),Generador.getRandomName(),Generador.getRandomName()
				,Generador.getRandomName(),Generador.getRandomName(),Generador.getRandomName(),Generador.getRandomName()} ;
		
		int edades[] = {Generador.getRandomNumber(10, 70), Generador.getRandomNumber(10, 70), Generador.getRandomNumber(10, 70),
				Generador.getRandomNumber(10, 70), Generador.getRandomNumber(10, 70), Generador.getRandomNumber(10, 70),
				Generador.getRandomNumber(10, 70)};
		
		for (int i = 0; i< nombres.length ; i++) {
			persona = new Persona(dnis[i], nombres[i], edades[i]);
			datos.writeObject(persona);
			
		}
		
		datos.close();
		
	}
	
	public static void escribir1x1(File f, Persona p) throws FileNotFoundException, IOException {
		
		FileOutputStream fo = null;
		ObjectOutputStream datos = null;
		
		
		
		if(!f.exists()) {
			fo = new FileOutputStream(f);
			datos = new ObjectOutputStream(fo);
		}else{
			fo = new FileOutputStream(f,true);
			datos = new MiObjectOutputStream(fo);
		}
		if (p instanceof Empleado) {
			Empleado e =(Empleado) p;
			datos.writeObject(e);
		}else {
			datos.writeObject(p);
		}
		
		
		datos.close();
		
		
	}

	public static void main(String[] args)  {
		
		File f = new File("ficheroObjeto.dat");
		Persona p1 = new Persona(Generador.dniGenerator(),Generador.getRandomName(),Generador.getRandomNumber(10, 70));
		Persona p2 = new Persona(Generador.dniGenerator(),Generador.getRandomName(),Generador.getRandomNumber(10, 70));
		Persona p3 = new Persona(Generador.dniGenerator(),Generador.getRandomName(),Generador.getRandomNumber(10, 70));

		try {
//		escribir1x1(f, p1);
//		escribir1x1(f, p2);
//		escribir1x1(f, p3);
		escribir1x1(f, p1);
		escribir1x1(f, p2);
		escribir1x1(f, p3);
		leer(f);
		}catch(ClassNotFoundException ee1) {
			ee1.printStackTrace();
		}catch(FileNotFoundException ee2) {
			ee2.printStackTrace();
		}catch(IOException eee) {
			eee.printStackTrace();
		}
	}

}
