package principal;

import java.util.Scanner;

public class SumarMultiplos {

	public static void main(String[] args) {
		// Hacer un programa que solicite dos números
		// y nos diga cuántos múltiplos de 5 
		// hay entre ambos números
		// Si alguno de los números es negativo, 
		// se vuelve a solicitar por teclado
		// No se admiten números negativos
		Scanner sc=new Scanner(System.in);
		int num1, num2;
		int suma=0;
		do { 
			System.out.println("Introduce el primer número: ");
			num1=sc.nextInt ();
		}while (num1<0);
		do {
			System.out.println("Introduce el segundo número: ");
			num2=sc.nextInt ();
		}while (num2<0);
		if (num1<num2) {
			for (int i=num1;i<=num2;i++) {
				if (i%5==0) {
					suma+=1;
				}
			}
		}else {
			for (int i=num2;i<=num1;i++) {
				if (i%5==0) {
					suma+=1;
				}				
			}
		}
		System.out.println("Hay "+suma+" múltipos de 5");
	}

}
