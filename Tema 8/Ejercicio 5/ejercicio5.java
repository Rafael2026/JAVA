import java.util.Scanner;

public class ejercicio5 {
  public static void main (String[] args) {

    int numero;
    int numeroDigitos = 1;

    Scanner scanner = new Scanner(System.in);

    System.out.print ("Introducir un numero: ");
    numero = scanner.nextInt ();

    System.out.println ();

    System.out.print (numero);

    do {

      if (numero >= 10000) {
        numeroDigitos = contarDigitos (numeroDigitos);
        numero = numero / 10;
      }

      else if (numero >= 1000 && numero < 10000) {
        numeroDigitos = contarDigitos (numeroDigitos);
        numero = numero / 10;
      }

      else if (numero >= 100 && numero < 1000) {
        numeroDigitos = contarDigitos (numeroDigitos);
        numero = numero / 10;
      }

      else if (numero >= 10 && numero < 100) {
        numeroDigitos = contarDigitos(numeroDigitos);
        numero = numero / 10;
      }

      else if (numero < 10) {
        numeroDigitos = contarDigitos (numeroDigitos);
      }

    } while (numero > 10);

    System.out.print (" -> ");
    System.out.print (numeroDigitos);
  }

  public static int contarDigitos (int numeroDigitos) {

    numeroDigitos++;

    return numeroDigitos;
  }
}
