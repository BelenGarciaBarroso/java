
public class ComprobarDepartamentos {

	public static void main(String[] args) {
		String facturacion ="ventas-20800,administracion-17900,informática-35000,RRHH-10350";
		String [] datos=facturacion.split("-");
		ordenarFacturacion(datos);
		//Nombre del departamento que más a facturado
		System.out.println("Departamento con más facturación: "+datos[datos.length-1].split("-")[0]);
		//Nombres de todos los departamentos, ordenados de menos a más facturación
		for(String n:datos) {
			System.out.println(n.split("-")[0]);
		}

	}
	
	static void ordenarFacturacion (String []datos) {
		String cambio;
		for (int i=0;i<datos.length;i++) {
			for (int j=i+1;j<datos.length;j++) {
				int numeroI=Integer.parseInt(datos[i].split("-")[1]);
				int numeroJ=Integer.parseInt(datos[j].split("-")[1]);
				if (numeroJ<numeroI) {
					cambio=datos[j];
					datos[j]=datos[i];
					datos[i]=cambio;
				}
			}
		
		}
	}

}
