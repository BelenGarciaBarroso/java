package principal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class GuardarCursosFichero {

	public static void main(String[] args) {
		
		//Solicitamos por teclado la introducción de un
		//nombre y guardaremos en un fichero todos los
		//cursos que contengan ese nombre
		
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
		buscarGuardarPalabra(cursos,palabra);
	}
	
	
	// 
	static void buscarGuardarPalabra (String[] _cursos, String palabra) {
		String ruta="dias.txt";
		try (FileOutputStream fos=new FileOutputStream(ruta, true);
				PrintStream out=new PrintStream(fos);) {
			for (String c:_cursos) {
				if (c.contains(palabra)) {
					out.println(c);
				}
			}
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
			
		}
		
	}


 