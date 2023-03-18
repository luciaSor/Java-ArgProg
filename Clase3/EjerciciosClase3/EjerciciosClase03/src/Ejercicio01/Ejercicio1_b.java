package Ejercicio01;

public class Ejercicio1_b {

	public static void main(String[] args) {
		
		//Dados 3 números y un orden (ascendente o decreciente) que ordene los
		// mismos y los retorne en un vector de 3
		
		int numeros[] = new int[] {3,1,37};
	
		// ordenamiento ascendente
		for (int i = 0; i < numeros.length; i++) {
		    for (int j = 0; j < numeros.length; j++) {
		        if (numeros[i] < numeros[j]) {
		            int auxiliar = numeros[i];
		            numeros[i] = numeros[j];
		            numeros[j] = auxiliar;
		        }
		    }
		}
		
		// ordenamiento decreciente

		int num_decreciente [] = new int [3];
		
		for	(int k = 0; k < num_decreciente.length; k++) {
			num_decreciente [k] = numeros[k];
		}
		
		for (int i = 0; i < num_decreciente.length; i++) {
		    for (int j = 0; j < num_decreciente.length; j++) {
		        if (num_decreciente[i] > num_decreciente[j]) {
		            int auxiliar = num_decreciente[i];
		            num_decreciente[i] = num_decreciente[j];
		            num_decreciente[j] = auxiliar;
		        }
		    }
		}
		
		//mostrar resultados
		System.out.println("Array en orden ascendente");
		for(int i=0;i < numeros.length;i++) {
			 System.out.println("\t " +numeros[i]);
		}
		
		System.out.println("Array en orden decreciente");

		for(int i=0;i < num_decreciente.length;i++) {
			 System.out.println("\t" +num_decreciente[i]);
		}
		

	}
}
