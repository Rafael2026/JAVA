import java.util.Scanner;

public class ejercicio39 {

  public static void main (String[] args) {

    Scanner scanner = new Scanner (System.in);

    System.out.println ("Introduzca un numero: ");
    int numero = scanner.nextInt ();

    System.out.println ();

    String[] haDevueltoUnNumero = convierteEnPalabras(numero);

    for (int i = haDevueltoUnNumero.length - 1; i >= 0; i--) {
      System.out.print (haDevueltoUnNumero[i] + ", ");
    }
  }

  public static String[] convierteEnPalabras (int numero) {

    int cuentaDigitos = 0;
    int numero2 = numero;

    do {
      numero2 = numero2/10;
      cuentaDigitos++;
    } while (numero2 > 0);

    String[] tablaNumeros = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
    int[] digitos = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    int sustraendo = 0;
    boolean valorRecorrido = false;

    String[] digitoDevuelto = new String [cuentaDigitos];
    int d = 0;
    boolean valorDevuelto = false;
    int resta = 0;

    for (int i = 0; (i < digitoDevuelto.length) && (!valorRecorrido); i++) {

      sustraendo = numero / 10;
      sustraendo = sustraendo * 10;

      for (int j = 0; ((j < digitos.length) && (!valorDevuelto)); j++) {

        resta = numero - sustraendo;

        if (resta == digitos[j]) {
          digitoDevuelto[d] = tablaNumeros[j];
          valorDevuelto = true;
        }
      }

      valorDevuelto = false;
      numero = numero/10;
      d++;

      if (numero == 0) {
        valorRecorrido = true;
      }
    }

    return digitoDevuelto;
  }
}
