import java.util.Scanner;

public class ejercicio1 {
  public static void main (String[] args) {

    int numero;
    boolean esCapicua;
    int aux;

    Scanner scanner = new Scanner (System.in);

    System.out.print ("Introducir un numero: ");
    numero = scanner.nextInt ();

    System.out.println ();

    do {

      if (numero >= 10000) {
        aux = numero % 10;
        numero = numero / 10;
        System.out.print (aux);
      }

      if (numero >= 1000 && numero < 10000) {
        aux = numero % 10;
        numero = numero / 10;
        System.out.print (aux);
      }

      if (numero >= 100 && numero < 1000) {
        aux = numero % 10;
        numero = numero / 10;
        System.out.print (aux);
      }

      if (numero >= 10 && numero < 100) {
        aux = numero % 10;
        numero = numero / 10;
        System.out.print (aux);
      }

      if (numero < 10) {
        aux = numero % 10;
        System.out.print (aux);
      }

    } while (numero > 10);

    System.out.print (" -> ");

    esCapicua = numeroCapicua (numero);
    System.out.print (esCapicua);
  }

  public static boolean numeroCapicua (int numero) {

    int aux = numero;
    boolean esCapicua;

    if (numero == aux) {
      esCapicua = true;
    }

    else {
      esCapicua = false;
    }

    return esCapicua;
  }
}
