package principal;

public class ComprobarDireccionesCompleto {

	public static void main(String[] args) {
		String emails="aaa@gamil.com, bbb@yahoo.org,ccc@hotmail.com,fff@gmail.com,ggg@feo.net,blngb@hotmail.com";
		// Mostrar cuántas direcciones de cada dominio hay
		String [] correos=emails.split("[ ,-]");
		//Obtengo los dominios
		String [] doms=dominios(correos);
		// Recorro los dominio y con cada uno llamo al segundo método
		// para saber el número de veces que ese dominio aparece
		// en el array de correos.
		for (String d:doms) {
			System.out.println("Apariciones del dominio "+d+":"+contarDominio(d,correos));
		
		}

	}
	// Recibe array con direcciones y devuelve array de dominios
	static String[] dominios (String[] dirs) {
		StringBuilder cadenaDominios= new StringBuilder("");
		for (String dir:dirs) {
			// Obtenemos dominio de la direccion que estamos recorriendo
			String dominio=dir.substring(dir.indexOf(".")+1,dir.length());
			if (cadenaDominios.indexOf(dominio)==-1) {
				// Añadimos el dominio a la cadena de dominios
				//cadenaDominios=cadenaDominios+dominio+",";
				cadenaDominios.append(dominio);
				cadenaDominios.append(",");
			}
				
		}
		//Eliminamos la última coma que se añade
		//cadenaDominios=cadenaDominios.substring(0,cadenaDominios.length()-1);
		cadenaDominios.delete(cadenaDominios.length()-1,cademaDominios.length());
		//Transformamos StringBuilder en String para poder llamar a split
		return cadenaDominios.toString().split(",");
		}
		
	
	// Cuenta las veces que un dominio aparece en el array de direcciones
	static int contarDominio(String dominio, String [] dirs) {
		int contador=0;
		for (String dir:dirs) {
			if (dir.endsWith(dominio)) {
				contador++;
			}
		}
		return contador;
	}
}
