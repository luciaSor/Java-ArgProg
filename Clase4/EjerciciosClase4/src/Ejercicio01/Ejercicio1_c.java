package Ejercicio01;

import java.util.Scanner;

public class Ejercicio1_c {

	    public static void main(String[] args) {
	        int[] numeros = new int[3];
	        char opcion;

	            
	            	try (Scanner scanner = new Scanner(System.in)) {
	            		
						System.out.print("Ingrese 3 números: \n");
						
						for (int i = 0; i < 3; i++) {
						    
						    numeros[i] = scanner.nextInt();
						}
						System.out.print("Ingrese 'a' para orden ascendente o 'b' para orden descendente: ");
						opcion = scanner.next().charAt(0);
					}
	            	
	            	if (opcion == 'a') {
	            ascendente(numeros);
	        } else if (opcion == 'b') {
	            descendente(numeros);
	        } else {
	            System.out.println("Error! opcion incorrecta");
	            return;
	        }

	        System.out.println("Los numers ordenados son: ");
            System.out.print(" { ");

	        for (int i = 0; i < 3; i++) {
	            System.out.print(numeros[i] + " ");
	        }
	        System.out.println("} ");

	    }

	    public static void ascendente(int[] num) {
	        for (int i = 0; i < num.length - 1; i++) {
	            for (int j = i + 1; j < num.length; j++) {
	                if (num[i] > num[j]) {
	                    int temp = num[i];
	                    num[i] = num[j];
	                    num[j] = temp;
	                }
	            }
	        }
	    }

	    public static void descendente(int[] arregloNum) {
	        for (int i = 0; i < arregloNum.length - 1; i++) {
	            for (int j = i + 1; j < arregloNum.length; j++) {
	                if (arregloNum[i] < arregloNum[j]) {
	                    int temp = arregloNum[i];
	                    arregloNum[i] = arregloNum[j];
	                    arregloNum[j] = temp;
	                }
	            }
	        }
	    }
	}

