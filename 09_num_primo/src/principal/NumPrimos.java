package principal;

public class NumPrimos {

	public static void main(String[] args) {
		int num=17;
		boolean primo=true;
		// Indicar si el número es primo o no.
		for (int i=2;i<num;i++) {
			if (num%i==0) {
				primo=false;				
			}
		}
		System.out.println("El número "+num+ " es primo? "+primo);
	}

}
