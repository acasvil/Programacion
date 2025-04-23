package ficheros;
import java.io.*;
import java.util.*;

public class Ejer8Bol4 {

	public static void main(String[] args) {		
		
		File fileTxt = new File("config.txt");
		File fileBin = new File("config.bat");

		
		if(!fileBin.exists()) {
			try {
				fileBin.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		Configuracion c1 = new Configuracion();
		
		try {
			c1.fillMap(fileTxt);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
