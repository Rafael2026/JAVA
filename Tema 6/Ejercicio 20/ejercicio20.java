import java.util.Scanner;

public class ejercicio20 {
  public static void main (String []args) {

    Scanner scanner = new Scanner (System.in);

    System.out.print ("Introducir la capacidad de la cuba en litros: ");
    int capacidad = scanner.nextInt();

    int espacios = capacidad + 1;

    int cantidadAgua = (int)(Math.random () * capacidad + 1);

    System.out.println ();

    for (int i = 0; i < capacidad; i++) {

      System.out.print ("*");

      if (i < (capacidad - cantidadAgua)) {

        for (int x = 0; x < espacios; x++) {
          System.out.print (" ");
        }

        System.out.println ("*");

      } else {

        for (int x = 0; x < espacios; x++) {
          System.out.print ("=");
        }

        System.out.println ("*");
      }
    }

    System.out.print ("*");

    for (int x = 0; x < espacios; x++) {
      System.out.print ("*");
    }

    System.out.print ("*");

    System.out.println ();
    System.out.print ("La cuba tiene una capacidad de " + capacidad + " litros y contiene " + cantidadAgua + " litros de agua");
  }
}
