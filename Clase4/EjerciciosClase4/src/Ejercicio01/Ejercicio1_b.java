package Ejercicio01;

import java.util.Scanner;

public class Ejercicio1_b {

	public static void main(String[] args) {
		
		char opcion;
		int[] numeros = new int[3];

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Ingrese 3 números");
			
			for(int l = 0; l < numeros.length; l++) {
			numeros[l] = scanner.nextInt();
			}
			System.out.println("Ingrese opcion: 'a' (ascendente) o 'b' (descendente)");
			
			opcion = scanner.next().charAt(0);
		}
		
		ordenarAscDes(numeros,opcion);	
				
	}
	
	public static void ordenarAscDes(int[] num , char op) {
		
		int[] ordnumeros = new int[num.length];
		char opcionord = op;
		
		for(int k = 0;k < ordnumeros.length; k++) {
			ordnumeros [k] = num[k];
		}
		for(int i = 0;i < ordnumeros.length; i++) {
			for(int j = 0;j < ordnumeros.length -1 -i; j++) {
				int aux = 0;
				if(ordnumeros[j] > ordnumeros[j+1] && opcionord == 'a') {
			
					aux = ordnumeros[j];
					ordnumeros[j] = ordnumeros[j+1];
					ordnumeros[j+1] = aux;
				}else {
					
					if(ordnumeros[j] < ordnumeros[j+1] && opcionord == 'b') {
						aux = ordnumeros[j];
						ordnumeros[j] = ordnumeros[j+1];
						ordnumeros[j+1] = aux;
						}
				}
			}
		}
		System.out.println("{" +ordnumeros[0] +" , " + ordnumeros[1] +" , " +ordnumeros[2] +"}");
		
	}
}
