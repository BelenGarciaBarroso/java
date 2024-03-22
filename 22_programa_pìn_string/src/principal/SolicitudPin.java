package principal;

import java.util.Scanner;

public class SolicitudPin {

	public static void main(String[] args) {
		// Hacer un programa que solicite la introducción 
		// de un código, si es correcto, muestra un mensaje y
		// el programa finaliza. Si es incorrecto, mensaje de error
		// al usuario y solicita de nuevo el código. Si falla 3 veces,
		// muestra mensaje de error final y el programa termina.
		Scanner sc=new Scanner(System.in);
		final String PIN_VALIDO="1234";
		String pin;
		int i=1;
		while (i<=3) {
			System.out.println("Introduce tu código PIN:");
			pin=sc.nextLine ();
			if (pin.equals (PIN_VALIDO)) {
				System.out.println("Pin correcto :)");
				//i=4;
				break;
			}else {
				if (i==3) {
					System.out.println("Pin no válido.Agostaste las oportunidades");
				}else {
					System.out.println("Pin no válido, intétalo de nuevo");
				}
				i++;
			}
		}
		System.out.println("FIN PROGRAMA");
	}

}
