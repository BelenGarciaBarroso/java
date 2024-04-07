package view;

import java.util.HashSet;
import java.util.Scanner;

import model.Ciudades;

import service.CiudadesService;

public class CiudadesMenu {
	static CiudadesService service=new CiudadesService();
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int opcion;
		do {
			//presentar menu
			//leer opción y comprobar opcion elegida
			presentarMenu();
			opcion=sc.nextInt();
			switch(opcion) {
				case 1:
					agregarCiudad();
					break;
				case 2:
					mostrarCiudasMasPoblada();
					break;
				case 3:
					ciudadesEnPais();
					break;
				case 4:
					System.out.println("Adios!");
					break;
				default:
					System.out.println("Opción no válida!");
			}
		}while(opcion!=4);
	}
	
	// MENÚ ********************************************************
	
	static void presentarMenu() {
		System.out.println("""
				1.- Agregar Ciudad
				2.- Ciudad más poblada
				3.- Ciudades en país
				4.- Salir
				
				""");
	}
	
	// AGREGAR CIUDADES SI NO EXISTEN EN EL PAÍS ***********************************
	
	static void agregarCiudad () {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Ciudad:");
		String ciudad=sc.nextLine();
		System.out.println("Habitantes:");
		int habitantes=Integer.parseInt(sc.nextLine());
		System.out.println("País:");
		String pais=sc.nextLine();	
		Ciudades c=new Ciudades(ciudad, habitantes, pais);
		
		if (service.agregarCiudad(c)) {
			System.out.println("Añadido");
		}else {
			System.out.println("Ciudad y país existente, no se ha añadido");
		}
	}
	
	// MOSTRAS CIUDAD MÁS POBLADA ***********************************
	
	static void mostrarCiudasMasPoblada() {
		Ciudades _ciudadMayor=service.ciudadMasPoblada();
		System.out.println("La ciudad con mayor población es:"+_ciudadMayor.getCiudad()+" con "+_ciudadMayor.getHabitantes());
	}
	
	// MOSTRAR LAS CIUDADES QUE HAY DENTRO DE UN PAIS ****************
	
	static void ciudadesEnPais() {
		Scanner sc=new Scanner(System.in);	
		System.out.println("País:");
		String pais=sc.nextLine();
		String resultado=service.mostrarCiudadesPais(pais);
		if (resultado.equals("")) {
			System.out.println("El país introducido no existe");
		}else {
			System.out.println("Las Ciudades que pertenecen al pais "+pais+ " son:");
			System.out.println(resultado);
		}
		
	}
}
