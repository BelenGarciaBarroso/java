package principal;

import java.util.Random;

public class Dados {

	public static void main(String[] args) {
		// Simular el lanzamiento de un dado
		/*int dado= (int)(Math.random()*6+1);
		System.out.println(dado);*/
		// Lanzar el dado 10.000 veces y mostrar el % de que ha aparecido cada número.
		//int dado= (int)(Math.random()*6+1);
		int [] contador= new int [6];
		double porcentaje=0;
		final int LANZAMIENTO=10000;
		var rnd=new Random();
		for (int i=1;i<=LANZAMIENTO;i++) {
			//int dado= (int)(Math.random()*6+1);
			int dado=rnd.nextInt(6)+1;
			contador [dado-1]+=1;				
			}
		for (int i=1;i<=contador.length;i++){
			porcentaje=(contador[i-1]*100)/LANZAMIENTO;
			System.out.println("El porcentaje de "+i+" es: "+porcentaje+" %");
		}
	}

}
