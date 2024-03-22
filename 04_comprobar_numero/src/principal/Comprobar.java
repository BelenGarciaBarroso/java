package principal;

public class Comprobar {

	public static void main(String[] args) {
		int num=6, resul;
		// si el número es par muetra la mitad de ese número
		// si es impar muestra la mitad del anterior
		resul=(num%2==0?num/2:--num/2);
		System.out.println(resul);
		
		int a=10;
		int b=a++;
		int c=++b;
		System.out.println(a<b?b>c?a--:c++:--b); 

		if(a<b){
			if(b>c){
				a--;
			}else{
				c++;
			}
		}else{
			--b; //imprime 10
		} 

	}

}
