package ficheros;
import java.util.*;
import java.io.*;

public class Ejer5Bol2 {
	
	private static void aniadirTexto(File f, ArrayList<String> lineas) throws IOException {
		
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		for (String txt : lineas) {
			bw.write(txt);
		}

		bw.close();		
	}
	
	public static boolean mergeFiles(File f1, File f2) throws IOException {

		String newName;
		FileReader fr1 = new FileReader(f1);
		BufferedReader bf1 = new BufferedReader(fr1);
		FileReader fr2 = new FileReader(f2);
		BufferedReader bf2 = new BufferedReader(fr2);
		ArrayList<String> lineas = new ArrayList<String>();

		if (f1.exists() && f2.exists()) {

			newName = f1.getName() + "_" + f2.getName();
			File f = new File(newName);
			if (f.exists()) {
				f.delete();
			}
			File.createTempFile(newName, newName);
			lineas = Ejer1Bol2.mostrarByRet(bf1, bf2);
			aniadirTexto(f, lineas);

			

			return true;
		}

		return false;

	}

	

	public static void main(String[] args) throws IOException {

		File f1 = new File("A");
		File f2 = new File("B");

		mergeFiles(f1, f2);

	}

}
