package app;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

public class App {

	public static void main(String[] args) {
		
		try {
            Modelo modelo = new Modelo();        
            Controlador controlador = new Controlador(modelo);
            Vista ventana = new Vista(controlador);  
            ventana.setVisible(true);                 
        } catch (Exception e) {
            e.printStackTrace();
        }
	
		
	}
}
