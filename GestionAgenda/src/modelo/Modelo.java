package modelo;
import java.util.*;
import java.io.*;

public class Modelo {
	
	ArrayList<Contacto> agenda;
	File f ;
	boolean comprobador;
	
	public Modelo() throws IOException {
		agenda = new ArrayList<Contacto>();
		comprobador = false;
		f = new File("bd");
	}
	
	public void agregarContacto(Contacto c) {
		agenda.add(c);
		if(comprobador == false) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f))) {
	        oos.writeObject(c);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
		}else {
			try (ObjectOutputStream oos = new MiObjectOutputStream(new FileOutputStream(f))) {
		        oos.writeObject(c);
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		}
	}
	
	public ArrayList<Contacto> getContactos(){
		return agenda;
	}
	
	public void borrarContacto(Contacto c) {
		agenda.remove(c);
		
	}
	
	public void editarContacto(Contacto cOld, Contacto cNew) throws FileNotFoundException, IOException {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))){
			ois.
		}
		
		
		agenda.remove(cOld);
		agenda.add(cNew);
		
	}
	
}
