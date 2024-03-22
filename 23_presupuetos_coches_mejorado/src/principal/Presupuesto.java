package principal;

import java.util.Scanner;

public class Presupuesto {

	public static void main(String[] args) {
		// Dado los datos de coches (medidos en un array), se pide al cliente
		// cual es su presupuesto y el programa indicará a los coches a los que puede optar.
		Scanner sc=new Scanner(System.in);
		var coches= new String [] {"Volvo-21_000","Seat-17_320","Toyota-30_175","Renauld-16500","Mercedes-51625","Kia-19700"};
		int presupuesto_cliente;
		System.out.println("¿De qué presupuesto dispone?");
		presupuesto_cliente=sc.nextInt ();
		
		for (var precio:coches) { 
			precio=precio.replace ("_","");//Eliminamos el _ del precio
			int guion=precio.indexOf("-"); // Averiguamos la posición del -
			String marca_coche=precio.substring(0,guion);//Sacamos la marca del coche
			double importe = Double.parseDouble(precio.substring(guion+1,precio.length()));
			// Asignamos un string a un double, hay que convertir el string en dobule
			if (presupuesto_cliente>=importe) {
				System.out.println("Puedes comprar un "+ marca_coche);
			}else {
				System.out.println("Eres pobre");
			}
		}
	}

}
