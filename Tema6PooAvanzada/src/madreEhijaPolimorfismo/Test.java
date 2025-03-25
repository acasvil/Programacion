package madreEhijaPolimorfismo;

public class Test {

	public static void main(String[] args) {
		
		Madre madre = new Madre();
		Hija1 h1 = new Hija1();
		Hija2 h2  = new Hija2();
		
		Madre madre2 = new Madre();
		
		madre2 = madre;
		madre.llamame();
		madre2.llamame();

		System.out.println();
		
		madre2 = h1;
		h1.llamame();
		madre2.llamame();
		
		System.out.println();
		
		madre2 = h2;
		h2.llamame();
		madre2.llamame();
	}

}
