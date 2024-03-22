package principal;

import java.util.Scanner;

public class ComprobarPresupuesto {

	public static void main(String[] args) {
		// Dado una serie de precios de coches (medidos en un array), se pide al cliente
		// cual es su presupuesto y el programa indicará a cuántos coches puede optar.
		Scanner sc=new Scanner(System.in);
		double [] precios= {21_000,17_320,30_175,16_500,51_625,19_700};
		double presupuesto_cliente;
		int num_coches=0;
		System.out.println("¿De qué presupuesto dispone?");
		presupuesto_cliente=sc.nextDouble ();
		for (double precio:precios) { //for (int i=0;i<precios.length;i++) {
			if (precio<=presupuesto_cliente) {
				num_coches+=1;
			}
		}
		System.out.println("El número de cohes que puede comprar es: "+ num_coches);

	}

}
