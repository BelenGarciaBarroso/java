package principal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PruebaEscrituraAppend {

	public static void main(String[] args) throws IOException {
		// Escribre 3/4 datos en un fichero
		//String ruta="c:\\Users\\manana\\Desktop\\BELEN - MAÑA NAS\\dias.txt";
		String ruta="dias.txt";
		/*FileOutputStream fos=null;
		PrintStream out=null;
		
		try {
			fos=new FileOutputStream(ruta, true);
			out=new PrintStream(fos);
			out.println("lunes");
			out.println("martes");
			out.println("miercoles");
			out.println("jueves");
			System.out.println("Información añadia al fichero");
			
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
			
		}
		catch (FileSystemNotFoundException ex) {
			ex.printStackTrace();
		}
		
		finally {
			fos.close();
			out.close();
		}*/
		
		// con try con recuersos
		try (FileOutputStream fos=new FileOutputStream(ruta, true);
				PrintStream out=new PrintStream(fos);) {
			out.println("lunes");
			out.println("martes");
			out.println("miercoles");
			out.println("jueves");
			System.out.println("Información añadia al fichero");
			
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
		
		

	}

}
