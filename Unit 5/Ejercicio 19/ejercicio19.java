import java.util.Scanner;

public class ejercicio19 {
  public static void main (String []args) {

    String espacios = " ";
    int cantidadCaracteres = 1;

    Scanner scanner = new Scanner (System.in);

    System.out.print ("Pedir el caracter para pintar la piramide: ");
    String caracter = scanner.nextLine();

    System.out.print ("Pedir la altura de la piramide: ");
    int altura = scanner.nextInt();

    System.out.println ();

    int cantidadEspacios = (altura - 1);

    if (altura > 1) {

      for (int x = 0; x < altura; x++) {

        for (int i = 0; i < cantidadEspacios; i++) {
          System.out.print (espacios);
        }

        for (int i = 0; i < cantidadCaracteres; i++) {
          System.out.print (caracter);
        }

        for (int i = 0; i < cantidadEspacios; i++) {
          System.out.print (espacios);
        }

        cantidadEspacios--;
        cantidadCaracteres+=2;
        System.out.println ();
      }
    }
  }
}
