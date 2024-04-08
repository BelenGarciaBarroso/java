package principal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class GuardarCursosFichero {

	public static void main(String[] args) {
		String ruta="dias.txt";
		String [] cursos= {
				"Java básico",
				"Python para principaiantes",
				"Java EE en Web",
				"JavaScript en Front",
				"POO con Java",
				"Python y Django",
				"Desarrollo Web con ASP.NET	",
				"Aplicaciones Web con Python"
		}; 
		
		Scanner sc=new Scanner(System.in);	
		System.out.println("Introduce palabra:"); 
		String palabra=sc.nextLine();
		buscarPalabra (cursos, palabra)
		
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
		
			//Solicitamos por teclado la introducción de un
			//nombre y guardaremos en un fichero todos los
			//cursos que contengan ese nombre
		
		
		static String [] buscarPalabra (String[] _cursos, String palabra) {
			String [] conPalabra;
			int contador=0;
			for (String c:_cursos) {
				if (c.contains(palabra)) {
					conPalabra[contador]=c;
				}
			}
		return conPalabra;
		}
		

	}

}
 