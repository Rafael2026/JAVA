import java.util.Scanner;

public class ejercicio40 {
  public static void main (String []args) {

    int espacios = 0;

    Scanner scanner = new Scanner (System.in);

    System.out.print ("Introducir la altura del rombo: ");
    int alturaReloj = scanner.nextInt ();

    boolean impar = (alturaReloj % 2 == 1);
    int baseReloj = 1;
    int espaciosLaterales = (alturaReloj / 2);

    System.out.println ();

    if (impar && (alturaReloj >= 3)) {

      for (int y = 0; y < alturaReloj; y++) {

        if (y < 1) {

          for (int x = 0; x < espaciosLaterales; x++) {
            System.out.print (" ");
          }

          for (int x = 0; x < baseReloj; x++) {
            System.out.print ("*");
          }

          for (int x = 0; x < espaciosLaterales; x++) {
            System.out.print (" ");
          }

          System.out.println ();
          espaciosLaterales--;
          espacios++;

        }

        if ((y >= 1) && (y < (alturaReloj / 2))) {

          for (int x = 0; x < espaciosLaterales; x++) {
            System.out.print (" ");
          }

          for (int x = 0; x < baseReloj; x++) {
            System.out.print ("*");
          }

          for (int x = 0; x < espacios; x++) {
            System.out.print (" ");
          }

          for (int x = 0; x < baseReloj; x++) {
            System.out.print ("*");
          }

          System.out.println ();
          espacios += 2;
          espaciosLaterales--;
        }

        if ((y == alturaReloj / 2)) {

          for (int x = 0; x < espaciosLaterales; x++) {
            System.out.print (" ");
          }

          for (int x = 0; x < baseReloj; x++) {
            System.out.print ("*");
          }

          for (int x = 0; x < espacios; x++) {
            System.out.print (" ");
          }

          for (int x = 0; x < baseReloj; x++) {
            System.out.print ("*");
          }

          System.out.println ();
          espacios -= 2;
          espaciosLaterales++;

        }

        if ((y > alturaReloj / 2) && (y < (alturaReloj - 1))) {

          for (int x = 0; x < espaciosLaterales; x++) {
            System.out.print (" ");
          }

          for (int x = 0; x < baseReloj; x++) {
            System.out.print ("*");
          }

          for (int x = 0; x < espacios; x++) {
            System.out.print (" ");
          }

          for (int x = 0; x < baseReloj; x++) {
            System.out.print ("*");
          }

          System.out.println ();
          espaciosLaterales++;
          espacios -= 2;
        }

        if (y == (alturaReloj - 1)) {

          for (int x = 0; x < espaciosLaterales; x++) {
            System.out.print (" ");
          }

          for (int x = 0; x < baseReloj; x++) {
            System.out.print ("*");
          }

          for (int x = 0; x < espaciosLaterales; x++) {
            System.out.print (" ");
          }
        }
      }
    }

  }
}
