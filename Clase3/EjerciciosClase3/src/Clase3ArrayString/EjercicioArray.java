package Clase3ArrayString;

public class EjercicioArray {
	public static void main(String[] args) throws Exception {
        
		System.out.println("Hola Mundo!");
		
		int numeros[] = new int[3];
		
		numeros[0] = 1; 
		numeros[1] = 37;
		numeros[2] = 16;
		
		/* “length”, que nos dice el tamaño del array.*/
		System.out.println(numeros.length);
		
		 for(int indice=0;indice<numeros.length;indice++){
			 System.out.println(numeros[indice]);// imprime por pantalla cada elemento
			 }

		 int numero[] = new int[10];
		 char letras[] = {'a','b','c'};
		 
		 numero[0] = 10;
		 numero[5] = 14;
		 
		 System.out.println(numero[5] / 7);
		 //2
		 for (char letra : letras){
		 System.out.println(letra);
		 }
		 // a
		 // b
		 // c

	}
}
