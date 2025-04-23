package controlador;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import modelo.Contacto;
import modelo.Modelo;

public class Controlador {
	
	public Modelo agenda;
	
	public Controlador(Modelo agenda) {
		this.agenda=agenda;
	}
	
	public void eliminarContacto(int numero) {
		
		for(Contacto c: agenda.getContactos()) {
			
			if(c.getNumero() == numero) {
				agenda.borrarContacto(c);
				break;
			}
			
		}
	}
	
	public void editarContacto(String nombre, String apellidos, int numero) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		Contacto cNew = new Contacto (nombre, apellidos, numero);
		
		for(Contacto c: agenda.getContactos()) {
			
			if(c.getNumero() == numero) {
				agenda.editarContacto(c, cNew);
				break;
			}	
		}	
	}
	
	public ArrayList<Contacto> mostrarContacos(){
		
		return agenda.getContactos()	;
		
	}
	
	public void aniadirContacto (String nombre, String apellidos, int numero) {
		
		Contacto c = new Contacto (nombre, apellidos, numero);
		agenda.agregarContacto(c);

	}
	
	public void guardarCambios() throws FileNotFoundException, IOException {
		agenda.guardar();
	}
	
}
