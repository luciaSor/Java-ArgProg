//2. Haga una main donde por parámetro envíe la ruta de un archivo. Ese archivo debe
// contener números. El programa debe escribir por consola la suma de esos números

package Ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner numeros = null;
		try{
			numeros = new Scanner(new File("C:\\Users\\sors\\Documents\\GitHub\\Java-ArgProg\\Clase4\\EjerciciosClase4\\src\\Ejercicio2\\Numeros.txt"));
			
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado!");
			e.printStackTrace();
		}
		
		System.out.println("De los siguientes números: ");
		
		int suma = 0, num =0;
		while(numeros.hasNext()) {
			
			num = numeros.nextInt();
			System.out.println(num);
			suma += num;
		}
		System.out.println("La suma de los numeros es:" +suma);
		}
	}