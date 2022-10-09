import java.util.Scanner;

public class ejercicio26 {
  public static void main (String []args) {

    int x;
    int y;

    Scanner scanner = new Scanner (System.in);

    System.out.print ("Introducir la anchura de la tableta: ");
    int anchura = scanner.nextInt ();

    System.out.println ();

    System.out.print ("Introducir la altura de la tableta: ");
    int altura = scanner.nextInt ();

    System.out.println ();

    if (altura <= anchura) {

      int resta = (anchura - altura) / 2;

      for (y = 0; y < altura; y++) {

        if (y == resta) {

          anchura = anchura - 1;

          for (x = 0; x < anchura; x++) {
            System.out.print ("*");
          }

          System.out.println ();
          anchura = anchura + 1;

        } else {

          for (x = 0; x < anchura; x++) {
            System.out.print ("*");
          }

          System.out.println ();

        }
      }

    } else {

      int resta = (anchura - altura) / 2;

      for (y = 0; y < altura; y++) {

        if (y == resta) {

          anchura = anchura - 1;

          for (x = 0; x < anchura; x++) {
            System.out.print ("*");
          }

          System.out.println ();
          anchura = anchura + 1;

        } else {

          for (x = 0; x < anchura; x++) {
            System.out.print ("*");
          }

          System.out.println ();

        }
      }
    }
  }
}
