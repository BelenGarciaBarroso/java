package principal;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PruebaEscritura {

	public static void main(String[] args) {
		// Escribre 3/4 datos en un fichero
		//String ruta="c:\\Users\\manana\\Desktop\\BELEN - MAÑA NAS\\dias.txt";
		String ruta="dias.txt";
		try {
			PrintStream out=new PrintStream(ruta);
			out.print("lunes");
			out.print("martes");
			out.print("miercoles");
			out.print("jueves");
			System.out.println("Información añadia al fichero");
			out.close();
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
			
		}
		
		

	}

}
