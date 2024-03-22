package principal;

public class EjemploArrays {

	public static void main(String[] args) {
		int []notas= {5,8,3,1,9};
		// Hacer un programa que sume un punto a cada alumuno
		// y luego se muestren todas las notas
		for (int i=0;i<notas.length;i++) {
			notas[i]++;
			//System.out.println(notas[i]);
		}
		for (int nota:notas) {
			System.out.println(nota);
		}
		
	}

}
