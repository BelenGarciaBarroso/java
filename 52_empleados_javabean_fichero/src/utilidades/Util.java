package utilidades;

import java.time.LocalDate;

import model.Empleados;

public class Util {
	public static Empleados convertirCadenaAEmpleados(String linea) {
		String [] datos=linea.split(",");
		return new Empleados(Integer.parseInt(datos[0]),
				(datos[1]),
				(datos[2]),
				Integer.parseInt(datos [3])
				);
	}
	public static String convertirEmpleadosACadena(Empleados empleado) {
		return empleado.getCodigo()+","+empleado.getNombre()+","+empleado.getEmail()+","+empleado.getEdad();
	}
}
