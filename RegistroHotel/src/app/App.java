package app;

import java.util.concurrent.CancellationException;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

public class App {
	
	public static void main(String[] args) {
		
		Vista vista = new Vista();;
		Modelo modelo = new Modelo();
		Controlador controlador = new Controlador(modelo, vista);
		vista.setVisible(true);
		
	}
	
}
 