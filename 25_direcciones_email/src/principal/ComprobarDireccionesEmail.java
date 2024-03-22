package principal;

public class ComprobarDireccionesEmail {

	public static void main(String[] args) {
		String emails="aaa@gmail.com,bbb@gmail.com,ccc@tel.es,ddd@gmail.com,eee@hotmail.com";
		//Indicar cuántas direcciones hay de cada dominio
		String [] correos=emails.split("[ ,-]");
		int es=0;
		int com=0;
		for (String correo:correos) {
			int punto=correo.indexOf(".");
			String domi= correo.substring(punto+1,correo.length());
			if (domi.equals ("es")) {
				es++;
			}else {
				com++;
			}
			
		}
		System.out.println("Hay "+es+" dominios .es");
		System.out.println("Hay "+com+" dominios .com");

	}

}
