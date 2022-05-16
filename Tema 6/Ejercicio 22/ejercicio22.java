import java.util.Scanner;

public class ejercicio22 {
  public static void main (String []args) {

    int espaciosLaterales = 12;
    int x;
    int y;

    Scanner scanner = new Scanner (System.in);

    System.out.print ("Introducir la longitud de la serpiente: ");
    int longitud = scanner.nextInt ();

    System.out.println ();

    for (x = 0; x < espaciosLaterales; x++) {
      System.out.print (" ");
    }

    System.out.println ("@");

    for (y = 1; y < longitud; y++) {

      int opcion = (int)(Math.random () * 3);

      switch (opcion) {

        case 0:

          espaciosLaterales = espaciosLaterales - 1;

          for (x = 0; x < espaciosLaterales; x++) {
            System.out.print (" ");
          }

          System.out.println ("*");

        break;

        case 1:

          for (x = 0; x < espaciosLaterales; x++) {
            System.out.print (" ");
          }

          System.out.println ("*");

        break;

        case 2:

          espaciosLaterales = espaciosLaterales + 1;

          for (x = 0; x < espaciosLaterales; x++) {
            System.out.print (" ");
          }

          System.out.println ("*");

        break;
      }
    }
  }
}
