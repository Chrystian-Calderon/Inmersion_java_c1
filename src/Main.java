import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String nombrePelicula = "";
        double calificacion = 0;
        int contador = 0;

        System.out.println("¿Qué pelicula quiere calificar?");
        nombrePelicula = leer.nextLine();
        System.out.print("\nPelicula " + nombrePelicula);
        while (true) {
            System.out.println("\nIngrese exit para salir");
            System.out.println("¿Qué puntuación calificara?");

            if (leer.hasNextDouble()) {
                double lectura = leer.nextDouble();
                if (lectura >= 0 && lectura <= 5) { // calificacion entre 0 y 5
                    calificacion += lectura;
                    contador++;
                    continue;
                } else {
                    System.out.println("\n----Ingrese calificación entre 0 y 5----");
                    continue;
                }
            }

            if (leer.hasNextLine()) { // salir del programa
                if (leer.nextLine().equals("exit")) {
                    break;
                } else {
                    System.out.println("\nNo se permite otros caracteres");
                    break;
                }
            }
        }

        double calificacionFinal = (calificacion == 0) ? 0 : (calificacion / contador);
        System.out.println("Calificación media de la pelicula " + nombrePelicula + " es de " + calificacionFinal);
    }
}