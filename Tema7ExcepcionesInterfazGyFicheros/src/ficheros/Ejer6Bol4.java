package ficheros;
import java.util.*;

import randomizer.Generador;

import java.io.*;
import java.time.LocalDateTime;

public class Ejer6Bol4 {
	
	public static void main(String[] args) {
		
		File f = new File ("log.txt");
		
		try {
		
			if(!f.exists()) {
				f.createNewFile();
			}
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			CuentaBancaria c1 = new CuentaBancaria(Generador.getRandomName(), Generador.getRandomDouble(1000, 50000), f);
			CuentaBancaria c2 = new CuentaBancaria(Generador.getRandomName(), Generador.getRandomDouble(1000, 50000), f);
			CuentaBancaria c3 = new CuentaBancaria(Generador.getRandomName(), Generador.getRandomDouble(1000, 50000), f);
			
			c1.depositar(23.03);
			c2.depositar(22433.03);
			c3.depositar(200.3);
			c2.retirar(2400.03);
			CuentaBancaria.ShowLog(f);
		
		} catch(IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException ec){
			ec.printStackTrace();
		}
		
	}
	
}
