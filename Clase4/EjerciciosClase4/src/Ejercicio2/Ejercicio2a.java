// Al ejercicio 2 agregarle un parámetro para que la operación pueda ser
//suma o multiplicación.

package Ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio2a {

	public static void main(String[] args) {
		
		Scanner numeros = null;
		try{
			numeros = new Scanner(new File("C:\\Users\\sors\\Documents\\GitHub\\Java-ArgProg\\Clase4\\EjerciciosClase4\\src\\Ejercicio2\\Numeros.txt"));
			
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado!");
			e.printStackTrace();
		}
		
		System.out.println("Ingrese opción: "+"\n a: suma " +"\n b: multiplicación");
		
		try (Scanner opcion = new Scanner(System.in)) {
			String op = opcion.next();
			
			System.out.println("De los siguientes números: ");
			
			if(op.charAt(0) == 'a' ) {
				 //suma de numeros
				sumaNum(numeros);

			}else {
				if(op.charAt(0)== 'b') {
					 //multiplicación de l
					multiplicacion(numeros);	 
				}
			}
		}
		}
	//metodo que suma los numeros
	private static void sumaNum(Scanner numeros) {
		
		int suma = 0, num =0;
		while(numeros.hasNext()) {
			num = numeros.nextInt();
			System.out.println(num);
			suma += num;
		}
		System.out.println("La suma es: " +suma);
	}
	//metodo de multiplicacion
	private static void multiplicacion(Scanner numeros) {
		
		int suma = 1, num =0;
		
		while(numeros.hasNext()) {
			num = numeros.nextInt();
			System.out.println(num);
			suma = suma * num;
		}
		System.out.println("La multiplicación es: " +suma);
	}
}
