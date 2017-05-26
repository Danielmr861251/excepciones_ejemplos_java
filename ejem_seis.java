package excepciones_15ejer_java;
import java.util.*;
public class ejem_seis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2,suma;
		String error = "sin valor";
		try{
			System.out.println("ingrese un numero entero");
			num1 = sc.nextInt();
			System.out.println("ingrese otro numero entero");
			num2 = sc.nextInt();
			suma=num1+num2;
			System.out.println("la suma de los numeros es: "+suma);
			
		}catch(InputMismatchException no_num){
			System.out.println("usted introdujo un valor no entero");
			System.out.println("la suma es: "+error);
		}
	}

}
