package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Modelo;
import modelo.Reserva;
import vista.Vista;

public class Controlador implements ActionListener{
	
	private Vista vistaHotel;
	private Modelo ModeloHotel;

	public Controlador(Modelo modelo, Vista vista) {
		
		this.ModeloHotel = modelo;
		this.vistaHotel = vista;
		iniciar();
		
	}

	public void iniciar() {
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == vistaHotel.getBtnHacerReserva()) {
			
			try{
				
				Reserva r = new Reserva (vistaHotel.getTextFieldNombre().getText(),Integer.parseInt(vistaHotel.getTextFieldNumero().getText()),
						vistaHotel.getTextFieldApellidos().getText() , vistaHotel.getComboBox().getSelectedIndex(), 
						vistaHotel.getChckbxTodoIncluido().isSelected());
				
				
			}catch(NumberFormatException nfe) {
				
				vistaHotel.
				
			}
			
		}
		
	}
	
	
}
