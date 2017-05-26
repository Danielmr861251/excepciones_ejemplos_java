package excepciones_15ejer_java;
import java.util.*;
public class ejem_doce {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
		char letra;
		System.out.println("ingrese una letra");
		letra = sc.next().charAt(1);
		System.out.println("introdujo la letra: "+letra);
		}catch(StringIndexOutOfBoundsException no){
			System.out.println("no se escaneo correctamente una cadena");
		}
		
	}
}
