package principal;

public class Sumador {

	public static void main(String[] args) {
		// Calcular la suma de todos los números comprendidos
		// entre el mayor y el menor, no incluidos los extremos
		int n1=20;
		int n2=11;
		int suma=0;
		if (n1<n2) {
			for (int i=n1+1;i<n2;i++) {
				suma+=i; //suma=suma+i;
			}
		}else {
			for (int i=n2+1;i<n1;i++) {
				suma+=i; //suma=suma+i;
			}
		}
		System.out.println(suma);
	}

}
