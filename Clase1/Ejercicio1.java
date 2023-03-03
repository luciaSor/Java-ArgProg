public class Ejercicio1{
    public static void main(String[] args) throws Exception {
    
        int numeroInicio = 5;
        int numeroFin = 14;
        int salida = numeroInicio;

        /* Utilizando la sentencia while, imprima todos los números entre 2 variables “a”
		y “b”. Su código puede arrancar (por ejemplo)
        Se deberían mostrar los números: 5,6,7,8,9,10,11,12,13,14
        */

        while (salida >= numeroInicio && salida <= numeroFin) {
            System.out.println(salida);
            salida++;
        }

        //! Punto b. A lo anterior, solo muestre los números pares
        salida = numeroInicio;
        System.out.println("Numeros pares:");
        while (salida >= numeroInicio && salida <= numeroFin) {
            if (salida % 2 == 0) {
                System.out.println(salida);
            }
            salida ++;
        }

        //? Punto c. A lo anterior, con una variable extra, elija si se deben mostrar los números
		//? pares o impares

        salida = numeroInicio;
        boolean mostrarPares = true;
        System.out.println("Numeros pares / impares");
        while (salida >= numeroInicio && salida <= numeroFin) {
            if (salida % 2 == 0 && mostrarPares) {
                System.out.println(salida);
            } else {
                if (salida % 2 == 1 && !mostrarPares) {
                    System.out.println(salida);
                }
            }
            salida ++;
        }

        //todo: Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden
        System.out.println("Numeros pares invertido");
        for (int i = numeroFin; i >= numeroInicio; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
