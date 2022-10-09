import java.util.Scanner;

public class ejercicio13 {
  public static void main (String[] args) {

    int aux;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Introducir un numero: ");
    int numero = scanner.nextInt();

    int digitos = devuelveTrozo (numero);

    for (int i = 0; i < digitos; i++) {

      if (i != 0 && i != digitos - 1) {
        aux = numero % 10;
        System.out.print (aux);
      }

      else {
        aux = numero % 10;
      }

      numero = numero / 10;
    }
  }

  public static int devuelveTrozo (int numero) {

    int cantidadDigitos = 0;

    do {
      numero = numero/10;
      cantidadDigitos++;
    } while (numero != 0);

    return cantidadDigitos;
  }
}
