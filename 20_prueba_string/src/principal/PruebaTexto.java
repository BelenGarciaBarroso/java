package principal;

public class PruebaTexto {

	public static void main(String[] args) {
		String n="hello"; // Las variable string son inmutables, no se puede modificar.
		n=n.toUpperCase(); // para modificarla hay que volver a asignarla
		System.out.println(n);
		
		String a=new String ("mitexto");
		String b=new String ("mitexto");
		if (a==b) {
			System.out.println("Iguales");
		}else {
			System.out.println("Diferentes");
		}
// El resultado es diferente porque al ser objetos lo que se almacena es una dirección
// y no el texto.
		
		if (a.equals(b)) {
			System.out.println("Iguales");
		}else {
			System.out.println("Diferentes");
		}
// En este caso sale iguales pq hemos utilizado equal que compara los textos.
		// Si utilizamos equalsIgnoreCase no distingue entre mayus y minus
	}

}
