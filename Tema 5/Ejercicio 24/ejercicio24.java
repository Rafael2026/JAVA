import java.util.Scanner;

public class ejercicio24 {
  public static void main (String []args) {

    String espacios = " ";
    int cantidadCaracteres = 1;
    int caracter;
    int posicionDondeAumentaNumero = 2;

    Scanner scanner = new Scanner (System.in);

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
            caracter = 1;
            System.out.print (caracter);
          }

          for (int x = 0; x < cantidadEspacios; x++) {
            System.out.print (espacios);
          }

          cantidadEspacios--;
          cantidadCaracteres+=2;
          System.out.println ();
        }

        if (y >= 1) {

          caracter = 1;

          for (int x = 0; x < cantidadEspacios; x++) {
            System.out.print (espacios);
          }

          for (int x = 0; x < cantidadCaracteres; x++) {

            if (x < (cantidadCaracteres - posicionDondeAumentaNumero)) {
              System.out.print (caracter);
              caracter++;
            }

            if (x >= (cantidadCaracteres - posicionDondeAumentaNumero)) {
              System.out.print (caracter);
              caracter--;
            }
          }

          for (int x = 0; x < cantidadEspacios; x++) {
            System.out.print (espacios);
          }

          cantidadEspacios--;
          cantidadCaracteres+=2;
          System.out.println ();
          posicionDondeAumentaNumero++;
        }
      }
    }
  }
}
