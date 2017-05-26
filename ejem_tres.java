package excepciones_15ejer_java;
import java.util.*;
public class ejem_tres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int edad;
		try{
		System.out.println("introduzca su edad");
		edad = sc.nextInt();
		System.out.println("su edad es: "+edad);
		}catch(InputMismatchException no_num){
			System.out.println("no introdujo un valor correcto");
			
		}finally{
			System.out.println("programa finalizado.... gracias");
		}
	}

}
