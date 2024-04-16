package service;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import model.Empleados;

import utilidades.Util;

public class EmpleadosService {
	/*Realizar un programa para la gestión de empleados de una empresa. 
	Un empleado se caracteriza por un nombre,un email, edad y tiene asociado un código de empleado.
	al iniciar el programa, aparecerá el siguiente menú:
	1.- Nuevo empleado
	2.- Buscar empleado
	3.- Eliminar empleado
	4.- Mostrar datos de todos los empleados
	5.- Salir
	
	1: Se pide el nómbre, email, edad y código del empleado. Si no existe empleado con ese código, se guarda, pero si el código ya existe, no se guarda y se muestra advertencia al usuario
	2: Se pide el código del empleado y se muestran sus datos
	3: Se pìde el código del empleado y se borra, indicando un mensaje que diga el nombre del empleado que se ha borrado
	4.- Muestra datos de todos los empleados  */
	
	String fichero="empleados.csv";
	Empleados p=new Empleados();	
	HashMap <Integer,Empleados> empleados = new HashMap <>();

	
	//*************************************************************************
	public boolean agregarEmpleado (Empleados empleado) {
		boolean existe=false;
		try (FileReader fr=new FileReader(fichero);
				BufferedReader bf=new BufferedReader(fr);){
			String linea;
			while ((linea=bf.readLine())!=null) { 
				p=Util.convertirCadenaAEmpleados(linea);
				
				if (empleado.getCodigo()==p.getCodigo()) {
					//out.println(Util.convertirEmpleadosACadena(empleado));
						existe=true;
				}

			}	
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		if (existe) {
			return existe;
		}
		try (FileOutputStream fos=new FileOutputStream(fichero, true);
				PrintStream out=new PrintStream(fos);){
			out.println(Util.convertirEmpleadosACadena(empleado));
			
		}	

		catch(IOException ex) {
			ex.printStackTrace();
		}
		return existe;	
	}
	//*************************************************************************
	public Empleados bucarEmpleado (int codigo) {	
		try (FileReader fr=new FileReader(fichero);
				BufferedReader bf=new BufferedReader(fr);){
			String linea;
			while (((linea=bf.readLine())!=null)&&(codigo!=p.getCodigo())){ 
				p=Util.convertirCadenaAEmpleados(linea);
				if (codigo==p.getCodigo()) {
					break;
				}else {
					System.out.println("El empleado no existe");
				}
			}
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		return p;
	}
	
	//*************************************************************************
	public void eliminarEmpleado (int codigo) {
		boolean cont=true;
		ArrayList <Empleados> listafinal= new ArrayList<>();
		try (FileReader fr=new FileReader(fichero);
				BufferedReader bf=new BufferedReader(fr);){
			String linea;
			
			while ((linea=bf.readLine())!=null){ 
				p=Util.convertirCadenaAEmpleados(linea);
				
				if (codigo!=p.getCodigo()) {
					listafinal.add(p);
				}else {
					System.out.println("Empleado eliminado");
					cont=false;
				}
				
			}
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		
		try (PrintStream out=new PrintStream(fichero)){	
			if (!cont) {
				for (Empleados e:listafinal) {
					out.println(Util.convertirEmpleadosACadena(e));
				}
			}else {
				System.out.println("El empleado no existe");
			}
		}

		catch(IOException ext) {
			ext.printStackTrace();
		}
	
	}

	
	public Empleados [] mostrarEmpleados () {
		HashSet <Empleados> listado=new HashSet<>();
		String linea;
		try (FileReader fr=new FileReader(fichero);
				BufferedReader bf=new BufferedReader(fr);){
			while ((linea=bf.readLine())!=null){ 
			p=Util.convertirCadenaAEmpleados(linea);
			listado.add(p);
			}
		}
		catch(IOException ext) {
			ext.printStackTrace();
		}
		return listado.toArray(new Empleados[0]);
		
	}
}
			
			
			
			
			
			
			
			
			
			
			
			
			