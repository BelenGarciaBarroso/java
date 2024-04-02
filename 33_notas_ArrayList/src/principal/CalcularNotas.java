package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class CalcularNotas {

	public static void main(String[] args) {
		/*Realizar un programa para solicitar al usuario las notas de un grupo de alumnos.
		Al iniciarse el programa, se le pide al usuario que introduzca una nota y esta se
		guardará. Después, se le pregunta si quiere introducir una nueva nota, si dice que si,
		se le pide otra nota, así sucesivamente hata que diga que no.
		Cuando se hayan guardado todas las notas, el programa mostrará los siguientes datos:
		- Nota media
		- Aprobados
		- Nota más alta*/
		ArrayList<Integer> notas= new ArrayList<>();
		notas = pedirNotas();
		System.out.println("La nota media es "+notaMedia(notas));	
		System.out.println("El número de aprobados es "+numAprobados(notas));
		System.out.println("La nota más alta es "+notaMayor(notas));
	}	
		
	
	static ArrayList<Integer> pedirNotas() {
		String respuesta;
		ArrayList<Integer> notas= new ArrayList<>();
		do {
			Scanner sc=new Scanner(System.in);
			System.out.println("Introduce nota: ");
			notas.add(Integer.parseInt(sc.nextLine()));
			System.out.println("¿Quieres continuar? ");
			respuesta=sc.nextLine();
				
		}while (respuesta.equalsIgnoreCase("si"));
			
		return notas;
	}
	
	
	static Integer notaMedia (ArrayList <Integer> notas) {
		Integer sumaNotas=0;
		Integer media=0;
		ArrayList<Integer> nota= new ArrayList<>();
		for (Integer n:notas) {
		/*for (int i=0;i<notas.size();i++) {
			sumaNotas+=(notas.get(i));
		}*/
			sumaNotas+=n;
		}
		media=sumaNotas/(notas.size());
		
		return media;
	}
	
	
	static Integer numAprobados (ArrayList <Integer> notas) {
		Integer aprobados= 0;
		for (int n:notas) {
			if (n>=5) {
				aprobados++;
			}
		}
		
		return aprobados;		
	}
	
	
	static Integer notaMayor (ArrayList <Integer> notas) {
		int mayor = notas.get(0);
		for (int n:notas) {
			if (n>mayor) {
				mayor=n;
			}
		}
		
		return mayor;
	}

}
