import java.util.HashMap;
import java.util.Scanner;

public class ejercicio16 {
  public static void main (String[] args) {

    Scanner scanner = new Scanner (System.in);
    HashMap <String, String> capitales = new HashMap <> ();

    capitales.put ("Espana", "Madrid");
    capitales.put ("Portugal", "Lisboa");
    capitales.put ("Francia", "Paris");

    String cadenaIntroducida = "";

    do {

      System.out.print ("Escribe el nombre de un pais y te dire su capital: ");
      cadenaIntroducida = scanner.nextLine ();

      if (!cadenaIntroducida.equals ("salir")) {

        if (capitales.containsKey (cadenaIntroducida)) {
          System.out.print ("La capital de " + cadenaIntroducida);
          System.out.println (" es " + capitales.get (cadenaIntroducida) + "\n");
        }

        else {

          System.out.print ("No conozco la respuesta ");
          System.out.print ("¿cuál es la capital de " + cadenaIntroducida + "?: ");

          String capital = scanner.nextLine ();

          capitales.put (cadenaIntroducida, capital);

          System.out.println ("\nGracias por ensenarme nuevas capitales\n");
        }
      }

    } while (!cadenaIntroducida.equals ("salir"));
  }
}
