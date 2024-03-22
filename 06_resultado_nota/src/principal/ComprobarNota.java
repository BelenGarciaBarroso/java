package principal;

public class ComprobarNota {

	public static void main(String[] args) {
		int nota=9;
		//a partir de la nota se indicará si es:
		//suspenso (1-4)
		//aprobado (5-6)
		//notable (7-8)
		//sobresaliente (9-10)
		switch (nota) {
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("Suspenso");
				break;
			case 5:
			case 6:
				System.out.println("Aprobado");
				break;
			case 7:
			case 8:
				System.out.println("Notable");
				break;
			case 9:
			case 10:
				System.out.println("Sobresaliente");
				break;
				
		
		}
		switch (nota) {
		case 1,2,3,4:
			System.out.println("Suspenso");
			break;
		case 5,6:
			System.out.println("Aprobado");
			break;
		case 7,8:
			System.out.println("Notable");
			break;
		case 9,10:
			System.out.println("Sobresaliente");
			break;
		}
		// Desde java 14
		String resultado;
		resultado=switch(nota) {
		case 1,2,3,4-> "Suspenso";
		case 5,6 -> "Aprobado";
		case 7,8 -> "Notable";
		case 9,10 -> "Sobresaliente";
		default-> "Nota no válida";
		};
		System.out.println(resultado);

	}

}
