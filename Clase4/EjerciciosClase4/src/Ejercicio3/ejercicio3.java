//3. Tome el ejercicio B de la clase 3 y que por parámetro se pueda elegir si es una
//codificación o decodificación, el valor del desplazo, y 2 archivos, uno para la entrada y
//otro para la salida. Que por pantalla solo indique si terminó o no correctamente, los
//resultados deben estar en el archivo de salida

package Ejercicio3;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class ejercicio3 {

	
	public static void main(String[] args) {
		
		System.out.println("Elija una opción: " +"\n a: codificación" +"\n b: decodificación");
		try (Scanner opcion = new Scanner(System.in)) {
			String op = opcion.next();
			
			System.out.println("Introduzca el desplazamiento: ");
			try (Scanner opcion2 = new Scanner(System.in)) {
				int desplazamiento = opcion2.nextInt();
				
				Scanner texto = new Scanner(new File("C:\\Users\\sors\\Documents\\GitHub\\Java-ArgProg\\Clase4\\EjerciciosClase4\\src\\Ejercicio3\\entrada.txt"));
				String texto2 = texto.nextLine();
				
				if(op.charAt(0)== 'a') {
				codificacion(desplazamiento , texto2);
				}else {
					if(op.charAt(0) == 'b') {
						decodificacion(desplazamiento , texto2);
				   }
				   }
			} catch (FileNotFoundException e) {
				System.out.println("Error! No se encontró el archivo entrada.txt");
				e.printStackTrace();
			}
			}
	}
	//Decodificación de un texto
	private static void decodificacion(int desp2, String txt2) {
		
		char[] abc2 = "abcdefghijklmnñopqrstuvwxyz".toLowerCase().toCharArray();
		char[] mensaje2 = txt2.toLowerCase().toCharArray();
		char[] resultado2 = new char[mensaje2.length];
		
		System.out.println("Texto: \"" +txt2 +"\" Desplazamiento: " +desp2);
		System.out.println("Decodificacion: ");

		for(int i = 0 ; i < mensaje2.length; i++) {
			for(int j = 0; j < abc2.length; j++) {
				if(mensaje2[i]== abc2[j] && j - desp2	>= 0 ) {
					//System.out.print(abc2[j- desp2]);
					resultado2[i]= abc2[j -desp2];
				}
			}
			
			if(mensaje2[i] == 'b') {
				resultado2[i]= ' ';
				//System.out.print(" ");
			}
		}
		//escribir en archivo salida.txt
		try {
			FileWriter out = new FileWriter("C:\\Users\\sors\\Documents\\GitHub\\Java-ArgProg\\Clase4\\EjerciciosClase4\\src\\Ejercicio3\\salida.txt");
			out.write(resultado2);
			System.out.println("Exitosa ..........");
		       out.close();
		} catch (IOException e) {
			System.out.println("Error! No se pudo concretar.");
			e.printStackTrace();
		}
	}
	//Codificación de un texto
	private static void codificacion(int desp, String txt) {
		char[] abc = "abcdefghijklmnñopqrstuvwxyz".toLowerCase().toCharArray();
		char[] mensaje = txt.toLowerCase().toCharArray();
		char[] resultado = new char[mensaje.length];
		System.out.println("Texto: \"" +txt +"\" Desplazamiento " +desp);
		System.out.println("Codificacion guardada!");

		 
		for(int i = 0; i< mensaje.length ;i++) {
			for(int j = 0; j < abc.length; j++) {
				if(mensaje[i] == abc [j]) {
					//System.out.print(abc[j + desp]);
					if(j+desp>=abc.length) {

						//System.out.print(abc[desp-1]);
						resultado[i]= abc[desp-1];

					}else {

						//System.out.print(abc[j + desp]);
						resultado[i] = abc[j + desp];

					}

					break;
				}
				
			}
			
			if(mensaje[i] == ' ') {
				//System.out.print(abc[0]);
				resultado[i] = abc[0];
			}
			
		}
			//escribir en archivo salida.txt
		try {
			FileWriter out = new FileWriter("C:\\Users\\sors\\Documents\\GitHub\\Java-ArgProg\\Clase4\\EjerciciosClase4\\src\\Ejercicio3\\salida.txt");
			out.write(resultado);
			System.out.println("Exitosa ..........");
		       out.close();
		} catch (IOException e) {
			System.out.println("Error! No se pudo concretar.");
			e.printStackTrace();
		}
	       
			System.out.println("\n");
	}	

}
