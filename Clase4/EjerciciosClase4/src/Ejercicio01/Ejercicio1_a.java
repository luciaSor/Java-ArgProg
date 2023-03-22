package Ejercicio01;

public class Ejercicio1_a {
	
	public static void main(String[] args) {
		
		// haga un main, donde por parámetro ponga 3 números y una letra que
		// represente ascendente o descendente y los muestre ordenados por tal criterio
	
		char opcion = 'b';
		int[] numeros = new int[] {58,9,13};
		
		System.out.println("{" +numeros[0] +" , " +numeros[1] +" , " +numeros[2] +"}");
		System.out.println("Opcion:  'a' (ordenamiento ascendende) - 'b' (ordenamiento descendente)\n" +opcion);
		
		// ordenamiento ascendente
		
				for(int i = 0;i < numeros.length; i++) {
					for(int j = 0;j < numeros.length -1 -i; j++) {
						int aux = 0;
						if(numeros[j] > numeros[j+1] && opcion == 'a') {
					
							aux = numeros[j];
							numeros[j] = numeros[j+1];
							numeros[j+1] = aux;
						}else {
							
							if(numeros[j] < numeros[j+1] && opcion == 'b') {
								aux = numeros[j];
								numeros[j] = numeros[j+1];
								numeros[j+1] = aux;
								}
						}
					}
				}
				System.out.println("{" +numeros[0] +" , " + numeros[1] +" , " +numeros[2] +"}");
		
	}

}
