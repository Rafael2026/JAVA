import java.util.Scanner;

public class ejercicio23 {
  public static void main (String[] args) {

    int longitud = 5;
    int[] arrayNumeros = new int [longitud];
    int mediaParcial = 0;
    int mediaTotal = 0;
    int cantidadNumeros = 0;
    int cantidadNumerosIntroducidos = 0;

    Scanner scanner = new Scanner (System.in);

    System.out.println ("Introducir numeros: ");

    for (int i = 0; i < arrayNumeros.length; i++) {
      arrayNumeros[i] = scanner.nextInt ();
      cantidadNumerosIntroducidos = devuelveCantidadNumerosIntroducidos(cantidadNumeros);
      cantidadNumeros = cantidadNumerosIntroducidos;
    }

    System.out.println ();

    for (int i = 0; i < arrayNumeros.length; i++) {

      if (i == 0) {
        mediaParcial = arrayNumeros[i];
      }

      else {
        mediaTotal = arrayNumeros[i] + mediaParcial;
        mediaParcial = mediaTotal;
      }
    }

    System.out.print ("Resultado: ");

    int resultado = mediaTotal/cantidadNumerosIntroducidos;
    System.out.print (resultado);
  }

  public static int devuelveCantidadNumerosIntroducidos (int cantidadNumeros) {

    cantidadNumeros++;

    return cantidadNumeros;
  }
}
