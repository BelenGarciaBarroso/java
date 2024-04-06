package principal;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ContarNumeros {
	
	public static void main(String[] args) {
		// Realizar un programa que genere 100 números aleatorios entre 1 y 20 y los guarde
		//en un array. Después, el programa solicita al usuario la introducción de un número
		//entre 1 y 20. A continuación el programa nos mostrará los siguientes datos:
		//-Número de veces que el número solicitado aparece en el array
		//-Total de números que hay en el array (sin contar duplicados) que sean más pequeños que el número solicitado
		
		
		final int tamano=100;
		final int rnd=20;
		ArrayList<Integer> aleatorios = cargarArray(tamano,rnd);
		Scanner sc=new Scanner(System.in);
		System.out.println("Introducetu un número: ");
		Integer numero=Integer.parseInt(sc.nextLine());
		System.out.println("El número " + numero + " aparece "+ repetido(numero, aleatorios) + " veces.");
		//System.out.println(contarMenores(5, aleatorios, rnd));
		contarMenores(numero, aleatorios, rnd);
	}
		
	// CARGAR LISTA **************************************************************************
	
	static ArrayList<Integer> cargarArray (int _tamano, int _rnd) {
			ArrayList<Integer> aleatorios = new ArrayList <>();
			for (int i=0;i<_tamano;i++) {
				//aleatorios.add(Integer.valueOf(i));
				aleatorios.add(new Random().nextInt(_rnd)+1); // Introduzco los aleatorios en el array
															//Los aleatorios se generan entre 1 y 20
				
			}
			System.out.println(aleatorios);
			return aleatorios;
		}

	
	//CONTAR REPETIDOS DEL NUMERO INTRODUCIDO ***********************************************
	
	static int repetido (int _numero, ArrayList<Integer> _aleatorios) {
		int contador=0;
		for (Integer n:_aleatorios) {
			if (n.intValue()==_numero) {
				contador++;
			};
		}
		return contador;
	}
	
	//CONTAR NÚMEROS MENOS QUE NUMERO INTRODUCIDO SIN DUPLICADOS *************************
	
	static int contarMenores (int _numero, ArrayList<Integer> _aleatorios, int _rnd) {
		int contador = 0;
		Integer[] sumaMenores= new Integer [_numero-1]; //Creo un array con el tamaño del número elegido menos 1
		for (Integer n:_aleatorios) { 
			if (n.intValue()<_numero) {
				sumaMenores[n-1]=1;	
			}
		}
		for (Integer s:sumaMenores) { // sumo los valores del array que cuenta los duplicados
			if (s != null) {
			   contador=contador + s.intValue();
			}
		}
		System.out.println("Hay " + contador +" números menores de " + _numero);
		return contador;
	}
	
	
	
		
		
				
	

}
