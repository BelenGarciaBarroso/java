package principal;

public class contarVocales {

	public static void main(String[] args) {
		String cad="Esto es un texto nuevo";
		cad=cad.toLowerCase();// convertimos el texto en minúsculas para que cuenta la primera letra que es mayúsculas
		int cont_vocales=0;
		// ¿cuántas vocales tiene ese texto?
		for (int i=0;i<cad.length ();i++) {
			/*if (cad.charAt (i)=='a'||cad.charAt (i)=='e'||cad.charAt (i)=='i'||cad.charAt (i)=='o'||cad.charAt (i)=='u') {
				cont_vocales++;
			}*/
			switch (cad.charAt(i)) {
			case 'a','e','i','o','u':
				cont_vocales++;
			}
		}
		System.out.println(cont_vocales);

	}

}
