package multimedia;
import java.util.*;

public class ListaMultimedia {
	
	Multimedia[] lista;
	int añadidos = 0;
	
	public ListaMultimedia(int almacenamiento) {
		
		Multimedia[] lista = new Multimedia[almacenamiento];
		this.lista = lista;
	}
	
	public int size() {
		return lista.length;
	}
	
	public boolean add(Multimedia m) {
		
		if(añadidos < lista.length) {
			lista[añadidos] = m;
			añadidos++;
			return true;
		}else {
			return false;
		}
		
	}
	
	public Multimedia get(int position) {
		
		return lista[position];
		
	}

	@Override
	public String toString() {
		return "Tu lista multimeda: " + Arrays.toString(lista);
	}
	
	
	
	
	
}
