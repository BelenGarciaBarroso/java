package principal;

import java.util.ArrayList;

public class PruebaLista {

	public static void main(String[] args) {
		ArrayList<String>cadenas= new ArrayList<>();
		ArrayList<Integer> numeros= new ArrayList<>();
		var decimales=new ArrayList<>();
		System.out.println(cadenas.size()); // size para conocer el tamaño. Si está vacío devuelve 0
		cadenas.add("Lunes"); //añade el dato en la primera posición libre (0)
		cadenas.add("Martes"); //añade el dato en la primera posición libre (1)
		cadenas.add(0,"Miércoles"); // Inserta Miércoles en el 0, Lunes pasa a 1, etc...
		//cadenas.add(7,"Jueves");// Excepción, el 7  todavía no existe, tendría que ser 3
		System.out.println(cadenas.get(2)); // Imprime el elemeto en la posición 2 "Martes"
		cadenas.set(2,"martes"); // sustituye el valor de la posición 2
		numeros.add(35);
		numeros.add(numeros.get(0)); // tiene el mismo valor que 0, es decir apunta a 35
		numeros.set(0,100); // Sustituye el valor, ahora no es 35, sino 100
		System.out.println(numeros.get(1)); // devuelve 35
		numeros.add(0,52); //Inserta el 52 entre el 100 y el 35
		cadenas.remove(1); // Elimina Lunes que estaba en la posición 1, sube el resto.
		
		for (int i=0;i<cadenas.size();i++) {
			System.out.println(cadenas.get(i));
		}

	}

}
