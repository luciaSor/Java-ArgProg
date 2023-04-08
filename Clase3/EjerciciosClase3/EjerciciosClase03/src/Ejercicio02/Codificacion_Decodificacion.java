package Ejercicio02;

public class Codificacion_Decodificacion {
	
	static void codificacion(int desp , String txt){
		char[] abc = "abcdefghijklmnñopqrstuvwxyz".toLowerCase().toCharArray();
		char[] mensaje = txt.toLowerCase().toCharArray();
		
		System.out.println("Texto: \"" +txt +"\" Desplazamiento " +desp);
		System.out.println("Codificacion: ");

		 
		for(int i = 0; i< mensaje.length ;i++) {
			for(int j = 0; j < abc.length; j++) {
				if(mensaje[i] == abc [j]) {
					//System.out.print(abc[j + desp]);
					if(j+desp>=abc.length) {

						System.out.print(abc[desp-1]);

					}else {

						System.out.print(abc[j + desp]);

					}

					break;
				}
				
			}
			
			if(mensaje[i] == ' ') {
				System.out.print(abc[0]);
			}
			
		}
			System.out.println("\n");
			return;
		}
	static void decodificacion(int desp2 , String txt2) {
		
		char[] abc2 = "abcdefghijklmnñopqrstuvwxyz".toLowerCase().toCharArray();
		char[] mensaje2 = txt2.toLowerCase().toCharArray();
		
		System.out.println("Texto: \"" +txt2 +"\" Desplazamiento: " +desp2);
		System.out.println("Decodificacion: ");

		for(int i = 0 ; i < mensaje2.length; i++) {
			for(int j = 0; j < abc2.length; j++) {
				if(mensaje2[i]== abc2[j] && j - desp2	>= 0 ) {
					System.out.print(abc2[j- desp2]);
				}
			}
			
			if(mensaje2[i] == 'b') {
				System.out.print(" ");
			}
		}
		return;
	}
	 public static void main(String[] args) throws Exception {
	        // Your code here!
	        int desplazar = 1;
	        int desplazar2 = 2;
	        
	        String texto = "hola que tal";
	        String texto2= "jqncbswgbvcn";
	        
	       codificacion(desplazar , texto);
	       
	       decodificacion(desplazar2 , texto2);
	    }
}

