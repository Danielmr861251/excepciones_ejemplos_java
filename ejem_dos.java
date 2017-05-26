package excepciones_15ejer_java;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ejem_dos {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a,b;
			double res;
		try{
			System.out.println("ingrese numero entero");
			a = sc.nextInt();
			System.out.println("ingrese un segundo numero entero");
			b = sc.nextInt();
			res = a/b;
			System.out.println("el resultado de la divisionn es: "+res);
		}catch(InputMismatchException no_num){
			System.out.println("se introdujo un valor que no es numerico");
		}
		catch(ArithmeticException div_cero){//captura el error de division
			System.out.println("division por cero.");
		}


		}
		}
