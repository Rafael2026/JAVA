import java.util.Scanner;

public class ejercicio20 {
  public static void main (String []args) {

    String espacios = " ";
    int cantidadCaracteres = 1;
    int espaciosEntreCaracteres = 1;

    Scanner scanner = new Scanner (System.in);

    System.out.print ("Pedir el caracter para pintar la piramide: ");
    String caracter = scanner.nextLine();

    System.out.print ("Pedir la altura de la piramide: ");
    int altura = scanner.nextInt();

    System.out.println ();

    int cantidadEspacios = (altura - 1);

    if (altura > 1) {

      for (int y = 0; y < altura; y++) {

        if (y == 0) {

          for (int x = 0; x < cantidadEspacios; x++) {
            System.out.print (espacios);
          }

          for (int x = 0; x < cantidadCaracteres; x++) {
            System.out.print (caracter);
          }

          for (int x = 0; x < espaciosEntreCaracteres; x++) {
            System.out.print (espacios);
          }

          System.out.println ();
          cantidadEspacios--;

        }

        if ((y >= 1) && (y < (altura - 1))) {

          for (int x = 0; x < cantidadEspacios; x++) {
            System.out.print (espacios);
          }

          for (int x = 0; x < cantidadCaracteres; x++) {
            System.out.print (caracter);
          }

          for (int x = 0; x < espaciosEntreCaracteres; x++) {
            System.out.print (espacios);
          }

          for (int x = 0; x < cantidadCaracteres; x++) {
            System.out.print (caracter);
          }

          System.out.println ();
          espaciosEntreCaracteres+=2;
          cantidadEspacios--;

        }

        if (y == (altura - 1)) {

          cantidadCaracteres = altura;

          for (int x = 0; x < cantidadCaracteres; x++) {
            System.out.print (caracter + " ");
          }

        }
      }
    }
  }
}
