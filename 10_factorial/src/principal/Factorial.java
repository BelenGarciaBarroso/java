package principal;

public class Factorial {

	public static void main(String[] args) {
		int num=3;
		int factorial=1;
		// este programa calcula y muestra el factorial 
		// de un número
		for (int i=num;i>=1;i--) {
			factorial=factorial*i;
		}
		System.out.println(factorial);
	}

}
