package service;

import java.util.HashSet;

import model.Ciudades;

public class CiudadesService {
	
	HashSet<Ciudades> ciudad = new HashSet<>();

	
	// COMPROBAR QUE NO HAY DOS CIUDADES IGUALES EN EL MISMO PAÍS ********************************************
	
	public boolean agregarCiudad (Ciudades _ciudad) {
		boolean existe=false;
		for (Ciudades c:ciudad) {
			if (c.getCiudad().equals(_ciudad.getCiudad()) && c.getPais().equals(_ciudad.getPais()) ) {
				existe=true;
				break;
			}
		}
		if (!existe) {
			ciudad.add(_ciudad);
			return true;
		}
		
		return false;		
	}
	
	
	// CIUDAD MÁS POBLADA ********************************************
	
	public Ciudades ciudadMasPoblada () {
		Ciudades ciudadMayor=null;
		Integer poblacion=0;
		for (Ciudades c:ciudad) {
			if (c.getHabitantes()>poblacion) {
				poblacion=c.getHabitantes();
				ciudadMayor=c;
				
			}
		}

		return ciudadMayor;
	}
	
	// ENCONTRAR CIUDADES DEL MISMO PAÍS *************************************
	
	public String mostrarCiudadesPais (String _pais) {
		String ciudadesPais="";
		for (Ciudades c:ciudad) {
			if (c.getPais().equals(_pais)) {
				ciudadesPais=ciudadesPais + c.getCiudad()+"\n";
				
			}
			
		}
	return ciudadesPais;	
	}
	

}
