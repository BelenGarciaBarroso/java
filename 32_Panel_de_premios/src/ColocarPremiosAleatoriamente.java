
public class ColocarPremiosAleatoriamente {

	public static void main(String[] args) {
		// Crear un panel de premios 10x10 que contine 5 premios
		// en posiciones diferentes
		
		int [][]panelPremios= new int [10][10];
		panelPremios=asignarPremio(); // Paso los datos del array calculado en el método al array declarado aquí.
		for (int i=0;i<panelPremios.length;i++) {
			for(int j=0;j<panelPremios.length;j++) {
				if (panelPremios[i][j]!=0) {
					System.out.println("Hay premio en la posicion "+i+" "+j);
				}
				
			}
		}
	}
	
	
	static int [][] asignarPremio () {
		int [][]panelPremios= new int [10][10];
		int cont=0;
		do {
			int fila = (int)(Math.random ()*panelPremios.length);
			int colum = (int)(Math.random ()*panelPremios.length);
				if (panelPremios[fila][colum]!= 1) { //Si está vacía (0)
					panelPremios[fila][colum]= 1; // la ocupamos con un 1
					cont++;
				}
		}while (cont<5);
		return panelPremios;
	
	}
}
