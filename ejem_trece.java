package excepciones_15ejer_java;
import java.util.*;
public class ejem_trece {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int entero;
		try{
		System.out.println("introduzca un entero");
		entero = sc.nextInt();
		System.out.println("el numero es: "+entero);
		}catch(InputMismatchException no){
		System.out.println("introdujo un numero real no entero, una letra o simbolo");

		}
	}

}
