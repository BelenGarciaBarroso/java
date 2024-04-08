package principal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PruebaLectura {

	public static void main(String[] args) {
		String ruta="dias.txt";
		try (FileReader fr=new FileReader(ruta);
				BufferedReader bf=new BufferedReader(fr);) {
			/*System.out.println(bf.readLine()); // lee la primera línea	
			System.out.println(bf.readLine()); // lee la segunda línea*/
			/*String linea=bf.readLine(); 
			while (linea !=null) { // Lee todas las líneas miestras que la línea no sea null(vacia)
				System.out.println(linea);
				linea=bf.readLine();
				
			}*/
			String linea;
			while ((linea=bf.readLine())!=null) { //cogemos y comparamos a la vez
				System.out.println(linea);
			}
	}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}

	}
}
