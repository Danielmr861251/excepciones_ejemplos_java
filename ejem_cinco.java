package excepciones_15ejer_java;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ejem_cinco {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]array= new int[10];
		
		try{
			for(int i =0; i<array.length;i++){
				System.out.println("ingrese el valor a asignar al arreglo ("+(i+1)+"):");
				array[i] = sc.nextInt();
				
				}
			System.out.println("usted introdujo los siguientes valores: ");
			System.out.println(Arrays.toString(array));
		}catch(InputMismatchException no_num){
			System.out.println("ha introducido un valor no numerico... sin valores");
			
		}finally{
			System.out.println("programa finalizado.... gracias");
		}

	}
}
