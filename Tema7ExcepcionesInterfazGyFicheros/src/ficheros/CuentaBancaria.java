package ficheros;

import java.io.*;
import java.time.LocalDateTime;

public class CuentaBancaria implements Serializable{
	
	String titular;
	Double saldo;
	File f;
	
	public CuentaBancaria(String titular, Double saldo, File f) {
		super();
		this.titular = titular;
		this.saldo = saldo;
		this.f = f;
	}

	public String getTitular() {
		return titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public File getF() {
		return f;
	}

	public void setF(File f) {
		this.f = f;
	}

	public void retirar(Double retirada) throws IOException {
		
		try(FileWriter fw = new FileWriter(f, true); BufferedWriter bw = new BufferedWriter(fw)){
			this.saldo = saldo - retirada;
			
			bw.write((this.GenLog(f, this) + " - Retirada " + retirada) + "\n");
			bw.close();
		}
		
	}
	
	public void depositar(Double deposito) throws IOException {
		
		try(FileWriter fw = new FileWriter(f, true); BufferedWriter bw = new BufferedWriter(fw)){
			this.saldo = saldo + deposito;
			bw.write((this.GenLog(f, this) + " - Deposito " + deposito) + "\n");
			bw.close();
		}
	}
	
	private String GenLog (File f,CuentaBancaria c) throws IOException {
		
		return LocalDateTime.now() + " - " + c.getTitular() + " - " + c.getSaldo();
		
	}
	
	public static void ShowLog (File f) throws IOException, ClassNotFoundException {
		
		Ejer1Bol2.mostrarByBuffer(f);;
		
	}
	
}
