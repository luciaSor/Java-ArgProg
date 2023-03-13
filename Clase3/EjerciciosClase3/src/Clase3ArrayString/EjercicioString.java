package Clase3ArrayString;

public class EjercicioString {

	public static void main(String[] args) throws Exception {

		//String
		 String txt1 = "Hola!";
		 String txt2 = "Chau!";
		 System.out.println(txt1);
		 System.out.println(txt2);

		 String txt3 = txt1 + txt2 ; // "Hola!Chau!"
		 String txt4 = txt1 + " " + txt2 ; // "Hola! Chau!"
		 System.out.println(txt3);
		 System.out.println(txt4);

		// 5 Largo de un String
		 System.out.println(txt1.length());

		 String unTexto = "laLA";
		 //● Pasar a mayúscula o minúscula
		// lalaLALA
		 System.out.println(unTexto.toLowerCase() + unTexto.toUpperCase());
		 
		 //● Indicar si contiene otro string
		 System.out.println(unTexto.contains("la")); //true
		 System.out.println(unTexto.contains("aL")); //true
		 System.out.println(unTexto.contains("La")); //false
		 
		 //● Ver si inicia o termina con otra cadena
		 System.out.println(unTexto.startsWith("la")); // true
		 System.out.println(unTexto.endsWith("LE")); // false
		 //● Reemplazar
		 System.out.println(unTexto.replace("la", "le")); // leLA
		 
		 System.out.println("hola que tal?".replace(
				 "hola","chau").toUpperCase());
				 // CHAU QUE TAL?
		 
		 String saludo = "hola que tal?" ;
		 String[] saludoPartido1 = saludo.split(" "); 
		 // "hola", "que", "tal?"
		 String[] saludoPartido2 = saludo.split("a"); 
		 // "hol", " que t", "l?" --> notar la presencia de espacios
		 System.out.println(saludo);
		 
		 for(int i=0;i<3;i++) {
		 System.out.println(saludoPartido1[i]);
		 }
		 for(int j=0;j<3;j++) {
		 System.out.println(saludoPartido2[j]);
		 }

	}

}
