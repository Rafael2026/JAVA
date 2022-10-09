import java.util.Scanner;

public class ejercicio69 {
  public static void main (String []args) {

    int cantidadCaracteres = 6;

    Scanner scanner = new Scanner (System.in);

    System.out.print ("Introducir la altura de la piramide maya: ");
    int altura = scanner.nextInt();

    int base = 2;
    int espaciosLaterales = altura - 1;

    System.out.println ();

    for (int y = 0; y < altura; y++) {

      boolean par = ((y%2) == 0);
      boolean impar = ((y%2) == 1);

      if (par) {

        for (int x = 0; x < espaciosLaterales; x++) {
          System.out.print (" ");
        }

        for (int x = 0; x < cantidadCaracteres; x++) {
          System.out.print ("*");
        }

        System.out.println ();

        cantidadCaracteres += 2;
        espaciosLaterales--;
      }

      if (impar) {

        for (int x = 0; x < espaciosLaterales; x++) {
          System.out.print (" ");
        }

        int espacios = altura - 1;

        for (int x = 0; x < base; x++) {
          System.out.print ("*");
        }

        for (int x = 0; x < espacios; x++) {
          System.out.print (" ");
        }

        for (int x = 0; x < base; x++) {
          System.out.print ("*");
        }

        base += 2;
        cantidadCaracteres += 2;
        espaciosLaterales--;

        System.out.println ();
      }
    }
  }
}

