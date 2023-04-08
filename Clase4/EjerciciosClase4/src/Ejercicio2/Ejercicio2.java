//2. Haga una main donde por parámetro envíe la ruta de un archivo. Ese archivo debe
// contener números. El programa debe escribir por consola la suma de esos números

package Ejercicio2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		String linea2 = null;
		
		String ruta1 = "C:\\Users\\sors\\Documents\\GitHub\\Java-ArgProg\\Clase4\\EjerciciosClase4\\src\\Ejercicio2\\Numeros.txt";
		
		System.out.println("Los números del archivo son:");
		try {
			
			for(String linea : Files.readAllLines(Paths.get(ruta1), StandardCharsets.ISO_8859_1)) {
				linea2 = linea;
				System.out.println(linea);
				}
		} catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("Error! al leer los datos");
		}
		int sum = 0;
		for(int i=0; i < linea2.length() ; i++) {
			if(linea2.charAt(i) != ' ') {
			sum += (int) Character.getNumericValue( linea2.charAt(i));
			}
		}
	
		System.out.println(sum);
		System.out.println(linea2);
	}
}
