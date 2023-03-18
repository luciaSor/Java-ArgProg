package Ejercicio02;

public class Codificacion_Decodificacion {
	
public static void Metodo_codificacion(){
		
	int desplazamiento = 1 ;
		char[] abecedario = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
		String mensaje = "hola que tal z";
		char[] texto = mensaje.toCharArray();
	
		
        for (int i = 0; i < texto.length; i++) {
        	for(int j=0;j<abecedario.length;j++) {
        		if(texto[i] == abecedario[j]) {
        			int auxiliar = j + desplazamiento;
        			//texto[i] = abecedario[auxiliar];
        		}
            }
        }
        
        	System.out.println(texto);
        
        return;
}

	
	public static void main(String[] args) {
		
		  Metodo_codificacion();
	}
}

