package excepciones_15ejer_java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejem_cuatro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int edad;
		try{
		System.out.println("introduzca su edad");
		edad = sc.nextInt();
		if(edad>=18){
		System.out.println("usted es mayor de edad por tener: "+edad);
		}else{
		System.out.println("usted es menor de edad por tener: "+edad);

		}
		}catch(InputMismatchException no_num){
			System.out.println("no introdujo un valor correcto");
			
		}finally{
			System.out.println("programa finalizado.... gracias");
		}
	}
}
