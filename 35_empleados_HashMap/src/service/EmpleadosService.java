package service;

import java.util.Collection;
import java.util.HashMap;

public class EmpleadosService {
	/*Realizar un programa para la gestión de empleados de una empresa. Un empleado se caracteriza por un nombre, y tiene asociado un código de empleado.
	al iniciar el programa, aparecerá el siguiente menú:
	1.- Nuevo empleado
	2.- Buscar empleado
	3.- Eliminar empleado
	4.- Mostrar nombres de todos los empleados
	5.- Salir
	
	1: Se pide el nómbre y código del empleado. Si no existe empleado con ese código, se guarda, pero si el código ya existe, no se guarda y se muestra advertencia al usuario
	2: Se pide el código del empleado y se muestra su nombre
	3: Se pìde el código del empleado y se borra, indicando un mensaje que diga el nombre del empleado que se ha borrado
	4.- Muestra nombres de todos los empleados */
	
	HashMap <Integer,String> empleados = new HashMap <Integer,String>();
	
	//*************************************************************************
	public boolean agregarEmpleado (int codigo, String nombre) {
		boolean existe=true;
		if (!empleados.containsKey(codigo)) {
			empleados.put(codigo,nombre);
			existe=false;
		}
		return existe;		
	}
	
	//*************************************************************************
	public String bucarEmpleado (int codigo) {
		return empleados.get(codigo); // devuelve nombre si existe, sino devuelve null
	}
	
	//*************************************************************************
	public String eliminarEmpleado (int codigo) {
		return empleados.remove(codigo);  //devuelve nombre si existe, sino devuelve null
	}
	
	//*************************************************************************
	public String [] listadoEmpleados () {
		Collection<String> todos=empleados.values();
		return todos.toArray(new String[0]);	
	}
	
}
