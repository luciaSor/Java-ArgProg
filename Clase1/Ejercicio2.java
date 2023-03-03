public class Ejercicio2 {
    public static void main(String[] args) {
        //! vamos a atacar el siguiente problema: “determinar si una
        //! persona pertenece al segmento de ingresos altos”

        double ingresosMensuales = 1112460.00;
        int cantidadAutos = 2;
        int cantidadInmuebles = 1; 
        boolean embaracion = false;  
        boolean aeronaves = false;
        boolean activosSocietarios= true;

        boolean capacidadEconomica = embaracion || aeronaves || activosSocietarios;
        if (ingresosMensuales >= 489083 || cantidadAutos >= 3 || cantidadInmuebles >= 3 || capacidadEconomica) {
            System.out.println(" Pertenece al segmento de ingresos altos");
        } else  System.out.println(" No pertenece al segmento de ingresos altos");

        float ingresos = 1099899;
        int superficie = 43;
        int energia = 4890;

        if ( (ingresos <= 748382.07) && ( superficie <= 30) && (energia <= 3330) ) {
            System.out.println("Categoría A");
        } else if((ingresos <= 1112459.83) && (superficie <= 45) && (energia <= 5000) ) {
                System.out.println("Categoría B");
                }
    }
}