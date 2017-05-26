package excepciones_15ejer_java;
import java.util.*;
public class ejem_siete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1,num2,multi;
		
		try{
			System.out.println("ingrese un numero");
			num1 = sc.nextInt();
			System.out.println("ingrese otro numero");
			num2 = sc.nextInt();
			multi=num1*num2;
			System.out.println("el producto de los numeros es: "+multi);
			
		}catch(InputMismatchException no_num){
			System.out.println("usted introdujo un valor no numerico");
			System.out.println("la multiplicacion no se a realizado.... ");
		}finally{
			System.out.println("programa finalizado... gracias");
		}
	

	}

}
