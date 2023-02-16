/*
 * 8. Visualización de citas de películas (versión 2)
Retomar el algoritmo anterior, modificándolo para que no se muestre siempre la misma cita de una película, sino que haya dos o tres y presente aleatoriamente una de ellas.

 */
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Una cita de la ciudad del miedo");
        System.out.println("2 - Una cita de James Bond");
        System.out.println("3 - Una cita de la vida es un largo río tranquilo");
        System.out.println("4 - Una cita de Star Wars");
        System.out.println("5 - Salir de esta magnífica aplicación");
        int opcion = sc.nextInt();
        while (opcion != 5) {
            switch (opcion) {
                case 1:
                    int cita1 = (int) (Math.random() * 3 + 1);
                    switch (cita1) {
                        case 1:
                            System.out.println("Cuidado, es una auténtica carnicería");
                            break;
                        case 2:
                            System.out.println("¿Qué es la felicidad? Una ilusión, una sombra, una ilusión");
                            break;
                        case 3:
                            System.out.println("¿Qué es la felicidad? Una ilusión, una sombra, una ilusión");
                            break;
                    }
                    break;
                case 2:
                    int cita2 = (int) (Math.random() * 3 + 1);
                    switch (cita2) {
                        case 1:
                            System.out.println("Me llamo Bond, James Bond");
                            break;
                        case 2:
                            System.out.println("¿Qué es la felicidad? Una ilusión, una sombra, una ilusión");
                            break;
                        case 3:
                            System.out.println("¿Qué es la felicidad? Una ilusión, una sombra, una ilusión");
                            break;
                    }
                    break;
                case 3:
                    int cita3 = (int) (Math.random() * 3 + 1);
                    switch (cita3) {
                        case 1:
                            System.out.println("¿Qué es la felicidad? Una ilusión, una sombra, una ilusión");
                            break;
                        case 2:
                            System.out.println("¿Qué es la felicidad? Una ilusión, una sombra, una ilusión");
                            break;
                        case 3:
                            System.out.println("¿Qué es la felicidad? Una ilusión, una sombra, una ilusión");
                            break;
                    }
                    break;
                case 4:
                    int cita4 = (int) (Math.random() * 3 + 1);
                    switch (cita4) {
                        case 1:
                            System.out.println("Yo soy tu padre");
                            break;
                        case 2:
                            System.out.println("¿Qué es la felicidad? Una ilusión, una sombra, una ilusión");
                            break;
                        case 3:
                            System.out.println("¿Qué es la felicidad? Una ilusión, una sombra, una ilusión");
                            break;
                    }
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
            System.out.println("1 - Una cita de la ciudad del miedo");
            System.out.println("2 - Una cita de James Bond");
            System.out.println("3 - Una cita de la vida es un largo río tranquilo");
            System.out.println("4 - Una cita de Star Wars");
            System.out.println("5 - Salir de esta magnífica aplicación");
            opcion = sc.nextInt();
        }
    }
}
