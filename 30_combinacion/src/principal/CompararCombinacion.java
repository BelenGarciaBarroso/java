package principal;

import java.util.Scanner;

public class CompararCombinacion {

	public static void main(String[] args) {
		String combinacion;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introducetu combinación: ");
		combinacion=sc.nextLine();
		String [] micombinacion= combinacion.split(",");
		int [] combifinal = convertirCombinacion (micombinacion); 
		
				
		
		int [] generados = new int [6];
		int numero, totales =0;
		//Hay que generar un número aleatorio entre 1 y 49
		// hasta conseguir 6 diferentes
		do {
			// genera un número y si está repedito, lo guardamos
			numero = (int)(Math.random ()*49+1);
			if (!repetido(generados,numero,totales)) {
				generados [totales]=numero;
				totales++;
			}
		}while(totales<6);
		
		int aciertosTotales = aciertos(generados,combifinal);
		
		System.out.println("La combinación ganadora es: ");
		for (int h=0;h<generados.length;h++) {
			System.out.print(generados[h]+", ");
			
		}
		System.out.println();
		System.out.println("Ha tenido "+aciertosTotales+ " aciertos");

	}
	// Comprobar que los números no sean iguales
	static boolean repetido( int[]numeros, int num, int totales) {
		boolean resultado=false;
		for (int i=0;i<totales;i++) {
			if (numeros[i]==num) {
				resultado = true;
				break;
			}
		}
	return resultado;
	}
	
	// convierto el array string de los números introducidos en int para poder comparar
	// con el array de los números generados aleatoriamente
	static int [] convertirCombinacion (String []micombinacion) {
		int []combifinal = new int [micombinacion.length];
		for (int i=0;i<micombinacion.length;i++) {
			combifinal[i]=Integer.parseInt(micombinacion[i]);
		}

		return combifinal;
	}
	
	// comparamos los dos arrays para ver si hay números iguales en los dos
	static int aciertos (int [] generados,int [] combifinal) {
		int aciertos=0;
		for (int i=0;i<generados.length;i++) {
			for (int j=0+i;j<combifinal.length;j++) {
				if (generados[i]==combifinal[j]) {
					aciertos++;
				}
			}
		}
		return aciertos;
	}


}
