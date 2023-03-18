package Ejercicio01;

public class Ejercicio1_c {
	
	public static void main(String[] args) {
		
		//dado un vector de números, y un número X, que sume todos los números > X y
		//retorne el resultado
		
		int numeros[] = new int[] {3,5,2,15,0,6};
		int numX = 4;
		int sumar = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] > numX) {
				sumar = sumar + numeros[i];
			}
		}
		System.out.println("Resultado de la suma de numeros es: " +sumar);
	}
}
