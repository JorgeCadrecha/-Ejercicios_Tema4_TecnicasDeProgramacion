package Ejercicios;
/*
 * 5. Ahora tengo que encontrarlo yo
Esta vez, el ordenador debe adivinar un número elegido por el usuario. El usuario le indica si el número es mayor (+), menor (-) o si lo ha encontrado (=).

Ejemplo de ejecución del algoritmo:

Elija un número del 1 al 100, luego presione cualquier tecla.

a

Pruebo con 45, ¿es mayor, menor o es el número (+/-/=)?

-

Pruebo con 10, ¿es mayor, menor o es el número (+/-/=)?

+

Pruebo con 22, ¿es mayor, menor o es el número (+/-/=)?

+

Pruebo con 27, ¿es mayor, menor o es el número (+/-/=)?

=

Fenomenal, lo he encontrado después de 4 intentos.
 */

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija un número del 1 al 100, luego presione cualquier tecla.");
        sc.nextLine();
        int minimo = 1;
        int maximo = 100;
        int numero = (int) (Math.random() * (maximo - minimo + 1) + minimo);
        System.out.println("Pruebo con " + numero + ", ¿es mayor, menor o es el número (+/-/=)?");
        String respuesta = sc.nextLine();
        int intentos = 1;
        while (!respuesta.equals("=")) {
            if (respuesta.equals("+")) {
                minimo = numero + 1;
            } else {
                maximo = numero - 1;
            }
            numero = (int) (Math.random() * (maximo - minimo + 1) + minimo);
            System.out.println("Pruebo con " + numero + ", ¿es mayor, menor o es el número (+/-/=)?");
            respuesta = sc.nextLine();
            intentos++;
        }
        System.out.println("Fenomenal, lo he encontrado después de " + intentos + " intentos.");
    }
}