package excepciones_15ejer_java;
import java.util.*;
public class ejem_diez {
		public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int suma=0;
		int[] datos = new int[10];
		try{
		for(int i =0; i<datos.length;i++){
			System.out.println("ingrese el valor a asignar al arreglo ("+(i+1)+"):");
			datos[i] = sc.nextInt();
			suma+=datos[i];	
			}System.out.println("la suma de los numeros es: "+suma);
		}catch(InputMismatchException no_num){
		System.out.println("introdujo un valor no numerico");

		}
		
		
 }
}

