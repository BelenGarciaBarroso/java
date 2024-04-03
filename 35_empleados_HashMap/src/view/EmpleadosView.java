package view;

import java.util.Arrays;
import java.util.Scanner;

import service.EmpleadosService;

public class EmpleadosView {
	
	static EmpleadosService service=new EmpleadosService();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int opcion;
		do {
			presentarMenu();
			opcion=sc.nextInt();
			switch (opcion) {
				case 1:
					agregarEmpleado();
					break;
				case 2:
					buscarEmpleado();
					break;
				case 3:
					eliminarEmpleado();
					break;
				case 4:
					mostrarEmpleados();
					break;
				case 5:
					System.out.println("Adios");
					break;
				default:
					System.out.println("Opción no válida");
			}

		}while (opcion!=5);
	}
	
	//*********************************************************************
	static void presentarMenu() {
		String textoMenu =""" 
					
					
			Elige una opción:
					
				1.- Nuevo empleado
				2.- Buscar empleado
				3.- Eliminar empleado
				4.- Ver todos los empleados
				5.- Salir """;
		System.out.println(textoMenu);
			
	}
	
	//AGREGAR EMPLEADO*************************************************
		
	static void agregarEmpleado () {
		Scanner sc=new Scanner (System.in);
		System.out.println("Código empleado:");
		int codigo=Integer.parseInt(sc.nextLine());
		System.out.println("Nombre empleado:");
		String nombre=sc.nextLine();
		if (!service.agregarEmpleado(codigo, nombre)) {
			System.out.println("Añadido");
		}else {
			System.out.println("Código ya existente, no se ha añaido");
		}
	}
	
	
	//BUSCAR EMPLEADO***********************************************
	static void buscarEmpleado () {
		Scanner sc=new Scanner (System.in);
		System.out.println("Código empleado:");
		int codigo=Integer.parseInt(sc.nextLine());
		String nombre=service.bucarEmpleado(codigo);
		if (nombre==null) {
			System.out.println("No existe empleado con ese código");
		}else {
			System.out.println("El nombre del empleado es: "+nombre);
		}
	}
	
	//ELIMINAR EMPLEADO***********************************************
	static void eliminarEmpleado() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Código empleado:");
		int codigo=Integer.parseInt(sc.nextLine());
		String nombre=service.eliminarEmpleado(codigo);
		if (nombre==null) {
			System.out.println("No existe empleado con ese código");
		}else {
			System.out.println("El nombre del empleado eliminado es: "+nombre);
		}
	}
	
	//MOSTRAS LISTADO EMPLEADOS****************************************
	static void mostrarEmpleados() {
		String[] empleados=service.listadoEmpleados();
		System.out.println("Empleados: "+Arrays.toString(empleados));
		
	}
}
