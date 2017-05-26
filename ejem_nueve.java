package excepciones_15ejer_java;
import java.util.Scanner;
public class ejem_nueve {
		public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[]array= new int[10];
		
		try{
			for(int i =-3; i<array.length;i++){
				System.out.println("ingrese el valor a asignar al arreglo ("+(i+1)+"):");
				array[i] = sc.nextInt();
				}
			}
				catch(ArrayIndexOutOfBoundsException error_array){
					System.out.println("error de indice en un array");
				}
		finally{
			System.out.println("programa finalizado.... gracias");
		}

		}
	}

