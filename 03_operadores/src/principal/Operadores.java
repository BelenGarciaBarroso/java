package principal;

public class Operadores {

	public static void main(String[] args) {
		int a=3;
		int b=5;
		System.out.println(b/a);
		System.out.println(b%a);//devuelve el resto de la división, en este caso 2
		b++; // b=b+1 --> b=6
		--a; // a=a-1 --> a=2
		int c=10;
		System.out.println(c++); //el resultado es 10
		int n=--c; // el resultado es 10
		
		double r=3.5;
		r++;
		int x=5;
		int y=3;
		int z=6;
		System.out.println(x==y++);// false
		boolean rs=x>y||++z>2;
		System.out.println(z);//z=6
		

	}

}
