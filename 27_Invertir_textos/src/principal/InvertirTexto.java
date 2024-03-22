package principal;

import java.util.Scanner;

public class InvertirTexto {

	public static void main(String[] args) {
		// Solicitar la introducción de un texto
		// y mostralo invertido
		String frase;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce una frase:");
		frase=sc.nextLine();
		System.out.println(invertir(frase));
		
		

	}
	
	static String invertir(String cad) {
		StringBuilder reves= new StringBuilder ();
		// Recorremos la cadena desde el último hasta el primero
		//cogemos el último carácter y lo añadimos a un StringBuilder
		for (int i=cad.length()-1;i>=0;i--) {
			reves.append(cad.charAt(i));
		}
	return reves.toString();
	}

}
