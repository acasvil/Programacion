package ficheros;
import java.io.*;
import java.util.*;

public class Ejer2Bol2 {
		
	public static void main(String[] args) throws IOException {
		
		File f1 = new File ("Keep.txt");
		FileWriter fw = new FileWriter (f1);
		BufferedWriter bw = new BufferedWriter(fw);
		
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		
		boolean continuar = true;
		Scanner sc = new Scanner (System.in);
		String user;
		
		while(continuar) {
		System.out.println("Introduzca un usuario");
		user = sc.nextLine();
		
		if(!user.equalsIgnoreCase("fin")) {
			bw.write(user);
			bw.newLine();
		}else {
			continuar = false;
		}		
		
		}
		bw.close();
		Ejer1Bol2.mostrarByBuffer(br);
		System.out.println("Saliendo...");
		
	}
}
