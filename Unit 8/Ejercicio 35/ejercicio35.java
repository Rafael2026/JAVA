import java.util.Scanner;

public class ejercicio35 {
  public static void main (String[] args) {

    int numeroDigitos = 0;

    Scanner scanner = new Scanner (System.in);

    System.out.print ("Introducir un numero: ");
    int numeroIntroducido = scanner.nextInt ();

    int cantidadDigitos = contarDigitos (numeroIntroducido, numeroDigitos);
    String numeroEnPalotes = convierteEnPalotes(numeroIntroducido, cantidadDigitos);
    System.out.print (numeroEnPalotes);
  }

  public static String convierteEnPalotes (int numeroIntroducido, int cantidadDigitos) {

    int digito;
    String numero = String.valueOf (numeroIntroducido);
    String caracter;
    String digitoResultante = "";

    for (int i = 0; i < cantidadDigitos; i++) {

      caracter  = Character.toString (numero.charAt(i));
      digito = Integer.parseInt (caracter);

      for (int j = 0; j < digito + 1; j++) {

        if (j < digito) {
          System.out.print ("|");
        }

        else {
          System.out.print ("- ");
        }
      }
    }

    return digitoResultante;
  }

  public static int contarDigitos (int numeroIntroducido, int numeroDigitos) {

    do {

      if (numeroIntroducido >= 10000) {
        ++numeroDigitos;
        numeroIntroducido = numeroIntroducido / 10;
      }

      else if (numeroIntroducido >= 1000 && numeroIntroducido < 10000) {
        ++numeroDigitos;
        numeroIntroducido = numeroIntroducido / 10;
      }

      else if (numeroIntroducido >= 100 && numeroIntroducido < 1000) {
        ++numeroDigitos;
        numeroIntroducido = numeroIntroducido / 10;
      }

      else if (numeroIntroducido >= 10 && numeroIntroducido < 100) {
        ++numeroDigitos;
        numeroIntroducido = numeroIntroducido / 10;
      }

      else if (numeroIntroducido < 10) {
        ++numeroDigitos;
        numeroIntroducido = numeroIntroducido / 10;
      }

    } while (numeroIntroducido > 0);

    return numeroDigitos;
  }
}
