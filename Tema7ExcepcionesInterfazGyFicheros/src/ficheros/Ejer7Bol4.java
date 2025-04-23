package ficheros;

import java.io.*;
import java.util.*;

import randomizer.Generador;

public class Ejer7Bol4 {

	public static void writeTxt(File f, Clientes c) throws IOException {

		FileWriter fw = new FileWriter(f, true);
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write(c.toString() + "\n");
		bw.close();

	}

	public static void writeBin(File f, Clientes c) throws ClassNotFoundException, IOException {

		FileOutputStream fo = null;
		ObjectOutputStream datos = null;

		if (!f.exists()) {

			fo = new FileOutputStream(f);
			datos = new ObjectOutputStream(fo);

		} else {

			fo = new FileOutputStream(f, true);
			datos = new MiObjectOutputStream(fo);

		}

		datos.writeObject(c);

		datos.close();

	}

	public static ArrayList<Clientes> readBinret(File f) throws IOException, ClassNotFoundException {

		Clientes c1;
		ArrayList<Clientes> clientesG = new ArrayList<Clientes>();
		FileInputStream f1 = new FileInputStream(f);
		ObjectInputStream datos = new ObjectInputStream(f1);

		try {
			while (true) {
				c1 = (Clientes) datos.readObject();
				clientesG.add(c1);
			}
		} catch (EOFException e) {

		}
		datos.close();

		return clientesG;

	}

	public static void escribir1x1(File f, Clientes p) throws FileNotFoundException, IOException {

		FileOutputStream fo = null;
		ObjectOutputStream datos = null;

		if (!f.exists()) {
			fo = new FileOutputStream(f);
			datos = new ObjectOutputStream(fo);
		} else {
			fo = new FileOutputStream(f, true);
			datos = new MiObjectOutputStream(fo);
		}

		datos.writeObject(p);

		datos.close();

	}

	public static void comparador(File fileTxt, File fileBin) throws ClassNotFoundException, IOException {

		File diferencias = new File("diferencias.txt");
		if (!diferencias.exists()) {
			diferencias.createNewFile();
		}
		FileWriter fw = new FileWriter(diferencias, true);
		BufferedWriter bw = new BufferedWriter(fw);

		ArrayList<Clientes> clientesBinario = readBinret(fileBin);
		ArrayList<Clientes> clientesTxt = readTxtret(fileTxt);
		boolean escribir = true;

		for (int i = 0; i < clientesBinario.size(); i++) {
			escribir = true;
			for (int j = 0; j < clientesTxt.size(); j++) {

				if (clientesBinario.get(i).getId() == clientesTxt.get(j).getId()) {
					escribir = false;
					clientesTxt.remove(j);
					j--;
				}
			}

			if (escribir) {
				bw.write(clientesBinario.get(i).toString());
			}
		}

		for (Clientes c : clientesTxt) {
			bw.write(c.toString());
		}

		bw.close();
	}

	public static ArrayList<Clientes> readTxtret(File f) throws IOException {

		ArrayList<Clientes> cTxt = new ArrayList<Clientes>();
		ArrayList<String> tTxt = Ejer1Bol2.mostrarByRet(f);
		String[] usu;

		for (String aux : tTxt) {
			usu = aux.split(" ");
			cTxt.add(new Clientes(Integer.parseInt(usu[0]), usu[1]));
		}

		return cTxt;

	}

	public static void main(String[] args) {

		File ftxt = new File("Clientes.txt");
		File fbin = new File("Clientes.dat");

		Clientes c1 = new Clientes(1, "Hola");
		Clientes c2 = new Clientes(2, "adios");
		Clientes c3 = new Clientes(3, "Pato");
		Clientes c4 = new Clientes(4, "Piso");
		Clientes c5 = new Clientes(5, "Lara");
		Clientes c6 = new Clientes(6, "Masa");

		if (!ftxt.exists()) {
			try {
				ftxt.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try {
			writeTxt(ftxt, c1);
			writeTxt(ftxt, c2);
			writeTxt(ftxt, c3);
			writeTxt(ftxt, c4);
			writeBin(fbin, c3);
			writeBin(fbin, c4);
			writeBin(fbin, c5);
			writeBin(fbin, c6);
			comparador(ftxt, fbin);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
