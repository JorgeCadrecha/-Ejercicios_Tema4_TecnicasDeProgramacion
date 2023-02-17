package Ejercicios;
/*
 * 6. ¿Qué hace este algoritmo?
Observe atentamente el siguiente algoritmo:

Algo Trampa  
Variable numIntento : entero <- 1  
Variable valorIntroducido : texto  
Constante MAX_INTENTOS : entero <- 5  
Inicio  
   valorIntroducido <- introducir("¿Cuál es la capital de Francia? ")  
   MientrasQue valorIntroducido ≠ "París" o MAX_INTENTOS - numIntentos ≠ 0 
         escribir("Respuesta incorrecta")  
         escribir("Solo quedan " & MAX_INTENTOS - numIntentos &  
" intento(s)")  
         valorIntroducido <- introducir("¿Cuál es la capital de Francia? ") 
   FMq  
   Si MAX_INTENTOS - numIntento ≠ 0 Entonces  
         escribir("Bravo")  
   Si no  
         escribir("Revise sus conocimientos en geografía")  
   FSi  
Fin 
¿Qué hace?

Corrija este algoritmo para que logre lo que se podría esperar.
 */

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numIntento = 1;
        String valorIntroducido;
        final int MAX_INTENTOS = 5;
        valorIntroducido = introducir("¿Cuál es la capital de Francia? ");
        while (!valorIntroducido.equals("París") && MAX_INTENTOS - numIntento != 0) {
            escribir("Respuesta incorrecta");
            escribir("Solo quedan " + (MAX_INTENTOS - numIntento) + " intento(s)");
            valorIntroducido = introducir("¿Cuál es la capital de Francia? ");
            numIntento++;
        }
        if (MAX_INTENTOS - numIntento != 0) {
            escribir("Bravo");
        } else {
            escribir("Revise sus conocimientos en geografía");
        }
    }

    private static void escribir(String texto) {
        System.out.println(texto);
    }

    private static String introducir(String texto) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(texto);
        return teclado.nextLine();
    }
}