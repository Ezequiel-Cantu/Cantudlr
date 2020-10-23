package Tarea_3;
import java.util.Scanner;

public class SerieFibonacci {

	public static void main(String arg[]) {
	
		int intAnte = 0, intSigu = 1, intSuma = 0, i = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el numero de elementos para la serie");
		int intElements = entrada.nextInt();
		
		do {
			System.out.println(intAnte + ", ");
			intSuma = intAnte + intSigu;
			intAnte = intSigu;
			intSigu = intSuma;
			i++;
		}while(i <= intElements);
		
	}
		
}
