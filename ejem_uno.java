package excepciones_15ejer_java;
import java.util.*;
public class ejem_uno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		try{
		System.out.println("introduzca su numero entero favorito");
		num = sc.nextInt();
		System.out.println("su numero favorito entero es: "+num);
		}catch(InputMismatchException no_num){
			System.out.println("introdujo un valor no numerico o no entero.... ");
		}finally{
			System.out.println("programa finalizado... gracias");
		}
	}

}
