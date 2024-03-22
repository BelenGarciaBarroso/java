package principal;

public class SumarHastaMil {

	public static void main(String[] args) {
		// ¿Hasta qué número tengo que sumar, empezando por 1
		// para llega hasta mil?
		int num=0;
		int suma=0;
		do {
			num++;
			suma+=num;
		}while (suma<=1000);
		System.out.println(num);

	}

}
