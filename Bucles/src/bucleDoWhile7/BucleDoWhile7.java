package bucleDoWhile7;
import java.util.Scanner;

public class BucleDoWhile7 {

	public static void main(String[] args) {
		
		int contador = 0;
		int numero;
		int positivo = 0;
		int negativo = 0;
		
		System.out.println("Introduce 10 numeros pueden ser negativos o positivos");
		
		do
		{
			Scanner entrada = new Scanner(System.in);
			numero = entrada.nextInt();
			
			if(numero >= 0 )
				positivo++;
			else negativo++;
			
			contador++;
		}while(contador != 10);
		
		System.out.println("Hay " + positivo + " numeros positivos y "+ negativo + " numeros negativos" );
	}

}
