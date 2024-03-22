package principal;

import java.util.Scanner;

public class BuscarProducto {

	public static void main(String[] args) {
		String cesta ="tomates patatas,vino-tomates,leche,azucar,vino,pan,vino,patatas,pan";
		//Pedir el nombre el producto y el programa muestra el stock de ese producto.
		Scanner sc=new Scanner (System.in);
		String producto;
		int stock = 0;
		String []productos=cesta.split("[ ,.-]");//Definimos los posibles separadores de las palabras para el array
		System.out.println("Introduce el producto: ");
		producto=sc.nextLine (); // esta es la varible que recoge el producto introducido por teclado
		for (String p:productos) {
			if (p.equals (producto)) {
				stock++;
			}
		}
		System.out.println("Hay "+ stock+ " ud de "+producto);
	}

}
