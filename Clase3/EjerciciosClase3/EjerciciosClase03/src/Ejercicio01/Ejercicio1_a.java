package Ejercicio01;

public class Ejercicio1_a {

	public static void main(String[] args) {
		// Dado un String y una letra, que cuente la cantidad de apariciones de la letra en
		// el String
		
		String texto = "Cantidad de Apariciones de La Letra... Abc";
		char letra = 'b';
		
		// una forma de contar letras
		System.out.println("Texto: \n\""+texto +"\"\n"); 
		System.out.println(" 1- Cantidad de apariciones de la letra \"" +letra +"\" ");

		int contarletra = texto.toLowerCase().split(String.valueOf(letra).toLowerCase()).length - 1;
		
		System.out.println(" en el texto son: " +contarletra +"\n");
		
		//es otra forma de lograr el mismo resultado
		String letra2 = "a";
		
		System.out.println(" 2- Cantidad de apariciones de la letra \"" +letra2 +"\"");

		int cant_letras = texto.toLowerCase().split(letra2.toLowerCase()).length - 1;
		
		System.out.println(" en el texto son: " +cant_letras);
	}
}