import java.util.Scanner;

public class ejercico17 {
  public static void main (String[] args) {

    int numero;

    Scanner scanner = new Scanner (System.in);

    System.out.print ("Introducir un numero binario: ");
    numero = scanner.nextInt ();

    int base = 2;
    int exponente = 0;
    int aux1 = numero;
    int sumaTotal = 0;
    int aux2 = 0;

    System.out.println ();
    System.out.print (numero + " -> ");

    do {

      aux1 = numero%10;

      int sumaParcial = pasarABinario (base, exponente, aux1);
      sumaTotal = sumaParcial + aux2;

      aux2 = sumaTotal;

      numero = numero / 10;
      exponente++;

    } while (numero != 0);

    System.out.print (sumaTotal);
  }

  public static int pasarABinario (int base, int exponente, int aux1) {

    int numeroPorCadaDigito = (int) (Math.pow (base, exponente)) * aux1;

    return numeroPorCadaDigito;
  }
}
