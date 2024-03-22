package principal;

import java.util.Scanner;

public class NotasArray {

	public static void main(String[] args) {
		// Realizar un programa que solicite una a una la introducción
		// de 6 notas (double-con decimales) que serán guardadas en array.
		// Tras ello el programa mostrará los siguentes datos por pantalla:
		// nota media, nota más alta, aprobados (cada nota)
		Scanner sc=new Scanner(System.in);
		double []notas=new double [6];
		double sumanotas=0;
		double masalta=0;
		double media;
		for (int i=0;i<notas.length;i++) {
			System.out.println("Introduce la nota "+(i+1)+ ": ");
			notas[i]=sc.nextDouble ();
			sumanotas+=notas[i];
			if (notas[i]>masalta) {
				masalta=notas[i];
			}
		}
		sc.close();
		media=sumanotas/notas.length;
		System.out.println("La nota media es: "+media);
		System.out.println("La nota más alta es: "+masalta);
		System.out.println("Las notas aprobadas son: ");
		for (int i=0;i<=5;i++) {
			if (notas[i]>=5) {
				System.out.println(notas[i]);
			}
		}
		
		
		

	}

}
