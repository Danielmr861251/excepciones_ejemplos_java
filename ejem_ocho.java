package excepciones_15ejer_java;
import java.util.*;
public class ejem_ocho {

	public static void main(String[] args) {
		int[]array=new int[20];
		try{
			array[0]=21;
			array[-3]=24;
			array[1]=22;
		}
		
		catch(ArrayIndexOutOfBoundsException excepcion){
			System.out.println("Error de índice en un array");
	}finally{
		System.out.println("programa finalizado.... gracias");
	}
	}
}

