package pirncipal;

public class VariablesTipos {
	static int r; // variables de tipo atributo, vienen inicializadas
    public static void main(String [] args) {
    	int x,v,a=10; // variables locales no están inicializdas a no ser que se les asigne un valor
    	System.out.println("El valor de a es "+a);
    	int s=6;
    	System.out.println(s);
    	System.out.println(r);
    	//int 4b no puede empezar
    	int b4;
    	short _r;
    	int x=10;
    	long z=3000;
    	boolean bol=true;
    	double tr=3.6;
    	char w='t';
    	// casos especiales
    	int car=345_223_444;
    	double df=345.55_7;
    	float n=4.5f; // ñps ñoterañes decimales son double
    	long yq=1212112458512254; //los literales enteros son int, salvo que le pongamos la "l" al final
    	int bin=101; // es el número 101
    	int bin=0b101; // es el número binario 5
    	System.out.println (bin);
    			
    	
    
    }
}
