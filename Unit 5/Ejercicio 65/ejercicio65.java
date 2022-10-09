import java.util.Scanner;

public class ejercicio65 {
  public static void main (String []args) {

    Scanner scanner = new Scanner (System.in);

    System.out.print ("Introducir la altura del la letra A: ");
    int altura = scanner.nextInt();

    System.out.print ("Introducir una fila : ");
    int fila = scanner.nextInt();

    int espaciosLaterales = altura - 1;
    int base = 1;
    int espacios = 0;

    System.out.println ();

    if (altura >= 3) {

      if ((fila > 1) && (fila < altura) ) {

        for (int y = 0; y < altura; y++) {

          if (y == 0) {

            for (int x = 0; x < espaciosLaterales; x++) {
              System.out.print (" ");
            }

            for (int x = 0; x < base; x++) {
              System.out.println ("*");

            }

            espaciosLaterales--;
            espacios++;
          }

          if (y == 1) {

            for (int x = 0; x < espaciosLaterales; x++) {
              System.out.print (" ");
            }

            for (int x = 0; x < base; x++) {
              System.out.print ("*");
            }

            for (int x = 0; x < espacios; x++) {
              System.out.print (" ");
            }

            for (int x = 0; x < base; x++) {
              System.out.println ("*");
            }

            espaciosLaterales--;
            espacios += 2;
          }

          if ((y > 1) && (y < (fila - 1))) {

            for (int x = 0; x < espaciosLaterales; x++) {
              System.out.print (" ");
            }

            for (int x = 0; x < base; x++) {
              System.out.print ("*");
            }

            for (int x = 0; x < espacios; x++) {
              System.out.print (" ");
            }

            for (int x = 0; x < base; x++) {
              System.out.println ("*");
            }

            espaciosLaterales--;
            espacios += 2;
          }

          if (y == (fila - 1)) {

            for (int x = 0; x < espaciosLaterales; x++) {
              System.out.print (" ");
            }

            System.out.print ("*");

            for (int x = 0; x < espacios; x++) {
              System.out.print ("*");
            }

            for (int x = 0; x < base; x++) {
              System.out.println ("*");
            }

            espaciosLaterales--;
            espacios += 2;
          }

          if (y > (fila - 1)) {

            for (int x = 0; x < espaciosLaterales; x++) {
              System.out.print (" ");
            }

            for (int x = 0; x < base; x++) {
              System.out.print ("*");
            }

            for (int x = 0; x < espacios; x++) {
              System.out.print (" ");
            }

            for (int x = 0; x < base; x++) {
              System.out.println ("*");
            }

            espaciosLaterales--;
            espacios += 2;
          }
        }

      } else {
        System.out.print ("La base introducida no es correcta ");
      }

    } else {
      System.out.print ("La altura introducida no es correcta ");
    }
  }
}

