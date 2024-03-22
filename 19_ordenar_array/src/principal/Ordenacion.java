package principal;

import java.util.Arrays;

public class Ordenacion {

	public static void main(String[] args) {
		int []edades= {19,26,14,55,38,27,30};
		/*for (int i=0;i<edades.length;i++) {
			for (int j=i+1;j<edades.length;j++) {
				if (edades[j]<edades[i]) {
					int cambio=edades[j];
					edades[j]=edades[i];
					edades[i]=cambio;
				}
			}
		
		}*/
		Arrays.sort(edades);
		for (int edad:edades) {
			System.out.print(edad+" , ");
		}

	}

}
