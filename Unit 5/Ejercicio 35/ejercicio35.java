import java.util.Scanner;

public class ejercicio35 {
  public static void main (String []args) {

    String caracter = "*";
    int espaciosLaterales = 0;

    Scanner scanner = new Scanner (System.in);

    System.out.print ("Introducir la altura de la letra X: ");
    int altura = scanner.nextInt();

    int espacios = altura - 2;
    boolean impar = (altura%2 == 1);

    System.out.println ();

    if (impar) {

      for (int x = 0; x < altura; x++) {

        if ((x < (altura / 2)) && (espacios > 0)) {

          for (int i = 0; i < espaciosLaterales; i++) {
            System.out.print (" ");
          }

          System.out.print (caracter);

          for (int i = 0; i < espacios; i++) {
            System.out.print (" ");
          }

          System.out.print (caracter);

          for (int i = 0; i < espaciosLaterales; i++) {
            System.out.print (" ");
          }

          System.out.println ();
          espacios -= 2;
          espaciosLaterales++;

        }

        if (x == (altura / 2)) {

          for (int i = 0; i < espaciosLaterales; i++) {
            System.out.print (" ");
          }

          System.out.print (caracter);

          for (int i = 0; i < espaciosLaterales; i++) {
            System.out.print (" ");
          }

          System.out.println ();

        }

        if (x > (altura / 2)) {

          espaciosLaterales--;
          espacios+=2;

          for (int i = 0; i < espaciosLaterales; i++) {
            System.out.print (" ");
          }

          System.out.print (caracter);

          for (int i = 0; i < espacios; i++) {
            System.out.print (" ");
          }

          System.out.print (caracter);

          for (int i = 0; i < espaciosLaterales; i++) {
            System.out.print (" ");
          }

          System.out.println ();

        }
      }
    }
  }
}
