import java.util.Scanner;

public class ejercicio47 {
  public static void main (String []args) {

    int anchura = 6;
    String caracter = "M";

    Scanner scanner = new Scanner (System.in);

    System.out.print ("Introducir la altura del numero 8: ");
    int altura = scanner.nextInt ();

    boolean impar = ((altura % 2) == 1);

    System.out.println ();

    if (impar && (altura >= 5)) {

      for (int y = 0; y < altura; y++) {

        if (y == 0) {

          for (int x = 0; x < anchura; x++) {
            System.out.print (caracter);
          }

          System.out.println ();
        }

        if ((y > 0) && (y < (altura / 2))) {

          System.out.print (caracter);

          for (int x = 0; x < (anchura - 2); x++) {
            System.out.print (" ");
          }

          System.out.println (caracter);
        }

        if (y == (altura / 2)) {

          for (int x = 0; x < anchura; x++) {
            System.out.print (caracter);
          }

          System.out.println ();
        }

        if (y > (altura / 2) && (y < (altura - 1))) {

          System.out.print (caracter);

          for (int x = 0; x < (anchura - 2); x++) {
            System.out.print (" ");
          }

          System.out.println (caracter);
        }

        if (y == (altura - 1)) {

          for (int x = 0; x < anchura; x++) {
            System.out.print (caracter);
          }
        }
      }

    } else {
      System.out.println ();
      System.out.print ("La altura introducida no es correcta ");
    }
  }
}
