import java.util.Scanner;

public class ejercicio31 {
  public static void main (String []args) {

    String caracter = "*";

    Scanner scanner = new Scanner (System.in);

    System.out.print ("Introducir la altura de la letra L: ");
    int altura = scanner.nextInt();

    System.out.println ();

    for (int i = 0; i < altura; i++) {

      if (i == (altura - 1)) {

        for (int j = 0; j < ((altura + 1) / 2); j++) {
          System.out.print (caracter + " ");
        }

      } else {
        System.out.println (caracter);
      }
    }
  }
}
