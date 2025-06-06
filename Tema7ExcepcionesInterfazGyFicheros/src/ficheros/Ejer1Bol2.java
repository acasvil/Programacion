package ficheros;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.*;

public class Ejer1Bol2 {

	public static void mostrarByCharSinEspacios(FileReader f) throws IOException {

		int i;
		while ((i = f.read()) != -1) {
			char car = (char) i;
			if (i == 32) {
			} else {
				System.out.print(car);
			}
			f.close();
		}

	}

	public static void mostrarByChar(FileReader f) throws IOException {

		int i;
		while ((i = f.read()) != -1) {
			char car = (char) i;
			System.out.print(car);
		}
		f.close();

	}

	public static void mostrarByChar(FileReader f, int largo) throws IOException {

		char[] t = new char[largo];
		int i;
		while ((i = f.read(t)) != -1) {
			if (i == 32) {
			} else {
				System.out.print(t);
			}
		}
		f.close();
	}

	public static void mostrarByBuffer(File f) throws IOException {
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String txt = br.readLine();
		while (txt != null) {
			System.out.println(txt);
			txt = br.readLine();

		}

	}

	public static ArrayList<String> mostrarByRet(File f) throws IOException {
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String txt;
		ArrayList<String> lineas = new ArrayList<String>();
		
			while ((txt = br.readLine()) != null) {
				lineas.add(txt);
			}

		return lineas;

	}

	public static void main(String[] args) throws IOException {

		File f1 = new File("TextExample.txt");
		FileReader fr1 = new FileReader(f1);
		// BufferedReader r1 = new BufferedReader(fr1);

		mostrarByCharSinEspacios(fr1);
		// mostrarByBuffer(r1);

//		String txt = r1.readLine() ;
//		int i;
//		
//		char [] t = new char [3];
//		
//		while((i = fr1.read(t)) != -1) {
//			
//			System.out.println(t);
//		}	
//		
//		while(txt != null) {
//			System.out.println(txt);
//			txt = r1.readLine();
//			
//		}

	}

}
