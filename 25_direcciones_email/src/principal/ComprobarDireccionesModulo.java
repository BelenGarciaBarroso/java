package principal;

public class ComprobarDireccionesModulo {

	public static void main(String[] args) {
		String emails="aaa@gmail.com,bbb@gmail.com,ccc@tel.es,ddd@gmail.com,eee@hotmail.com";
		//Indicar cuántas direcciones hay de cada dominio
		String [] correos=emails.split("[ ,-]");
		int es=0;
		int com=0;
		es=contarDominio ("es",correos);
		com=contarDominio ("com", correos);
		System.out.println("Hay "+es+" dominios .es");
		System.out.println("Hay "+com+" dominios .com");

	}
	
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
