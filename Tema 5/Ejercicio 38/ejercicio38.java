import java.util.Scanner;

public class ejercicio38 {
  public static void main (String []args) {

    int espacios = 0;

    Scanner scanner = new Scanner (System.in);

    System.out.print ("Introducir la altura del reloj de arena: ");
    int alturaReloj = scanner.nextInt ();

    boolean impar = (alturaReloj % 2 == 1);
    int baseReloj = alturaReloj;

    System.out.println ();

    if (impar && (alturaReloj >= 3)) {

      for (int y = 0; y < alturaReloj; y++) {

        if (y < 1) {

          for (int x = 0; x < espacios; x++) {
            System.out.print (" ");
          }

          for (int x = 0; x < baseReloj; x++) {
            System.out.print ("*");
          }

          System.out.println ();
          baseReloj -= 2;
          espacios++;

        }

        if ((y >= 1) && (y < (alturaReloj / 2))) {

          for (int x = 0; x < espacios; x++) {
            System.out.print (" ");
          }

          for (int x = 0; x < baseReloj; x++) {
            System.out.print ("*");
          }

          System.out.println ();
          baseReloj -= 2;
          espacios++;
        }

        if ((y == alturaReloj / 2)) {

          for (int x = 0; x < espacios; x++) {
            System.out.print (" ");
          }

          for (int x = 0; x < baseReloj; x++) {
            System.out.print ("*");
          }

          System.out.println ();
        }

        if ((y > alturaReloj / 2)) {

          baseReloj += 2;
          espacios--;

          for (int x = 0; x < espacios; x++) {
            System.out.print (" ");
          }

          for (int x = 0; x < baseReloj; x++) {
            System.out.print ("*");
          }

          System.out.println ();
        }
      }
    }
  }
}
