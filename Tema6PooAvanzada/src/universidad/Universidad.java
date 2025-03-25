package universidad;

import java.util.ArrayList;

public class Universidad {
	
	Persona [] matriculados = new Persona [8];
	int position = 0;
	
	  public void addPerson(Persona p) {
		matriculados[position] = p;
		position++;
	}
	  
	  public void changeGrade(int id, int grade) {
		  
		  for(int i = 0; i < matriculados.length ; i++) {
			  
			  if(matriculados[i] != null && matriculados[i].getId() == id) {
				  
					Estudiante e =  (Estudiante) matriculados[i];
					e.setCurso(grade);
			  }
			  
		  }
		  
	  }
	  
	  public void consultar() {
		  
		  for(int i = 0;  i < matriculados.length; i++ ) {
			  
			  if(matriculados[i] != null ) {
			  System.out.println(matriculados[i]);;
			  }
		  }

		  
	  }

}
