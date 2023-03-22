package Ejercicio2;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		String ruta1 = "C:\\Users\\sors\\Documents\\GitHub\\Java-ArgProg\\Clase4\\EjerciciosClase4\\src\\Ejercicio2\\Numeros.txt";

		try {
			
			for(String linea : Files.readAllLines(Paths.get(ruta1), StandardCharsets.ISO_8859_1)) {
				System.out.println(linea);
			}
		} catch (IOException e) {

			e.printStackTrace();
			System.out.println("Error! al leer los datos");
		}
		
		
	}

}
