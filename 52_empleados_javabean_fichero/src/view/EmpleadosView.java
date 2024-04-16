package view;


import java.util.Scanner;

import model.Empleados;
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
		System.out.println("Email:");
		String email=sc.nextLine();
		System.out.println("Edad:");
		int edad=Integer.parseInt(sc.nextLine());
		
		Empleados emp= new Empleados(codigo, nombre, email, edad);
		
		if (!service.agregarEmpleado(emp)) {
			System.out.println("Añadido");
		}else {
			System.out.println("Código ya existente, no se ha añaido");
		}
	}
	
	
	//BUSCAR EMPLEADO***********************************************
	static void buscarEmpleado () {
		Scanner sc=new Scanner(System.in);		
		System.out.println("Código empleado:");
		int codigo=Integer.parseInt(sc.nextLine());	
		Empleados emp= new Empleados();
		Empleados nombre=service.bucarEmpleado(codigo);
		if (nombre==null) {
			System.out.println("No existe empleado con ese código");
		}else {
			System.out.println("El nombre del empleado es: "+nombre.getNombre());
		}
	}
	
	//ELIMINAR EMPLEADO***********************************************
	static void eliminarEmpleado() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Código empleado:");
		int codigo=Integer.parseInt(sc.nextLine());
		service.eliminarEmpleado(codigo);
		
	}
	
	//MOSTRAS LISTADO EMPLEADOS****************************************
	static void mostrarEmpleados() {
		Empleados [] empleados=service.mostrarEmpleados();
		for (Empleados e:empleados) {
			System.out.println("-----------------------------------------");
			System.out.println("Codigo: "+e.getCodigo());
			System.out.println("Nombre: "+e.getNombre());
			System.out.println("Edad: "+e.getEdad());
			System.out.println("Email: "+e.getEmail());		
		}
		System.out.println("-----------------------------------------");
	}
}
