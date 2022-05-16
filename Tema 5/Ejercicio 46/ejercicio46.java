import java.util.Scanner;

public class ejercicio46 {
  public static void main (String []args) {

    Scanner scanner = new Scanner (System.in);

    System.out.print ("Introducir la altura del rectangulo: ");
    int altura = scanner.nextInt ();

    System.out.println ();

    System.out.print ("Introducir la anchura del rectangulo: ");
    int anchura = scanner.nextInt ();

    System.out.println ();

    if ((altura >= 2) && (anchura >= 2)) {

      for (int y = 0; y < altura; y++) {

        if (y == 0) {

          for (int x = 0; x < anchura; x++) {
            System.out.print ("*");
            System.out.print (" ");
          }

          System.out.println ();
        }

        if (y < (altura - 1) && (altura > anchura)) {

          System.out.print ("*");
          System.out.print (" ");

          for (int x = 0; x < (anchura - 1); x++) {
            System.out.print (" ");
          }

          System.out.print ("*");
          System.out.println ();
        }

        if (y < (altura - 1) && (altura < anchura)) {

          System.out.print ("*");

          for (int x = 0; x < ((anchura + anchura) / 2) + 3; x++) {
            System.out.print (" ");
          }

          System.out.print ("*");
          System.out.println ();
        }

        if (y == (altura - 1)) {

          anchura = anchura;

          for (int x = 0; x < anchura; x++) {
            System.out.print ("*");
            System.out.print (" ");
          }

          System.out.println ();
        }
      }

    } else {
      System.out.println ("El valor minimo de la altura y de la anchura es 2 ");
    }
  }
}
