package modelo;
import java.util.*;
import java.io.*;

public class Modelo {
	
	ArrayList<Contacto> agenda;
	File f ;
	
	public Modelo() throws IOException {
		agenda = new ArrayList<Contacto>();
		f = new File("bd");
	}
	
	public void agregarContacto(Contacto c) {
		agenda.add(c);
		
	}
	
	public ArrayList<Contacto> getContactos(){
		return agenda;
	}
	
	public void borrarContacto(Contacto c) {
		agenda.remove(c);
		
	}
	
	public void editarContacto(Contacto cOld, Contacto cNew) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		agenda.remove(cOld);
		agenda.add(cNew);
		
	}
	
	public void guardar() throws FileNotFoundException, IOException {
		
		f.delete();
		f.createNewFile();
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f))){
			
			for(Contacto c : agenda) {
				
				oos.writeObject(c);
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
