package tareaCalificable;
import java.util.*;
import java.io.*;

public class Main {
	
	public static void CrearComprobar(File f){
		
		if(f.exists()) {
			if(f.isDirectory()) {
				System.out.println("El directorio ya existe");
			}
			
			if(f.isFile()) {
				System.out.println("El archivo ya existe");
			}
		}else {
			
			
			
		}
		
	}
	
	public static void main(String[] args) {
		
		
		
	}
	
}
