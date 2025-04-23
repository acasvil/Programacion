package ficheros;
import java.util.*;
import java.io.*;

public class Configuracion implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4894254791865077044L;
	HashMap<String,String> mapa = new HashMap<String,String>();
	
	public Configuracion() {
	}

	public HashMap<String, String> getMapa() {
		return mapa;
	}

	public void setMapa(HashMap<String, String> mapa) {
		this.mapa = mapa;
	}
	
	public void fillMap(File fileTxt) throws IOException {
		
		ArrayList<String> fileTxtInfo = new ArrayList<String>();
		String [] fileTxtLine;
		fileTxtInfo = Ejer1Bol2.mostrarByRet(fileTxt);
		
		for(String txt: fileTxtInfo) {
			
			fileTxtLine = txt.split("=");
			
			this.mapa.put(fileTxtLine[0], fileTxtLine[1]);
			
		}
		
	}
	
	public void fillBinFile(File fileBin) throws IOException {
		
		FileOutputStream fo = null;
		ObjectOutputStream obo = null;
		
		if(!fileBin.exists()) {
			
			fo = new FileOutputStream(fileBin);
			obo = new ObjectOutputStream(fo);
					
		}else {
			
			fo = new FileOutputStream(fileBin);
			obo = new MiObjectOutputStream(fo);
			
		}
		
		for(int i = 0; i < this.mapa.size(); i++) {
			
			obo.writeObject(this);
			
		}
		
	}
	
	
}
