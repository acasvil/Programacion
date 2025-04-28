package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Modelo;
import vista.Vista;
import vista.Vista2;

public class Controlador {
	
	private Modelo modelo;
	private Vista2 ventana;
	
	public Controlador(Modelo modelo, Vista2 ventana) {
		
		modelo = this.modelo;
		ventana = this.ventana;
		
	}
	
	public String register() {
		
		ventana.getBtnAniadir().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String nombre = ventana.getTextFieldNombre().getText();
				boolean hamburguesa = ventana.getChckbxHamburguesa().isSelected();
				boolean patatas = ventana.getChckbxPatatas().isSelected();
				boolean cocaCola = ventana.getChckbxcocaCola().isSelected();
				boolean helado = ventana.getChckbxHelado().isSelected();
				
				if(hamburguesa)
				
				
			}
		});
		
	}
	
}
