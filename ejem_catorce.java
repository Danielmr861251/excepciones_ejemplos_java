package excepciones_15ejer_java;
import java.util.*;
public class ejem_catorce {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		try{System.out.println("introduzca el numero 1");
		num = sc.nextInt();
		if(num==1){
			System.out.println("correcto");
		 }
		}catch(InputMismatchException no){
			System.out.println("no introdujo lo que se pidio :'(");
		}finally{
			System.out.println("programa finalizado.... gracias");
		}
	}

}
