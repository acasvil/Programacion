package universidad;

public class Test {

	public static void main(String[] args) {
		
		Universidad oxford = new Universidad();
		Estudiante a1 = new Estudiante("Adriano", "Casado", "Casado", 3, 5);
		
		oxford.addPerson(a1);
		oxford.consultar();
		oxford.changeGrade(3, 4);
		oxford.consultar();
	}

}
