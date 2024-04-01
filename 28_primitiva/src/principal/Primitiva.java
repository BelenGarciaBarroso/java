package principal;

public class Primitiva {

	public static void main(String[] args) {
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
		/*Arrays.sort(generados);*/
		for (int n:generados) {
			System.out.print(n+ ",");
		}

	}
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
}
