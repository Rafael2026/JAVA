import java.util.Scanner;

public class ejercicio20 {
  public static void main (String[] args) {

    int numeroMinimo;
    int numeroMaximo;
    int minimo = 0;
    int maximo = 10;

    Scanner scanner = new Scanner(System.in);

    System.out.print ("Cuantos nueros quieres introducir: ");
    int n = scanner.nextInt ();

    int[] numerosIntroducidos = new int [n];

    for (int i = 0; i < n; i++) {
      numerosIntroducidos[i] = (int)(Math.random () * maximo);
      System.out.print (numerosIntroducidos[i] + " | ");
    }

    System.out.println ();

    for (int i = 0; i < n; i++) {

      if (i == 0) {
        minimo = numerosIntroducidos[i];
        maximo = numerosIntroducidos[i];
      }

      else if (i > 0) {

        numeroMinimo = devuelveNumeroMinimo (numerosIntroducidos, minimo, i);
        numeroMaximo = devuelveNumeroMaximo (numerosIntroducidos, maximo, i);

        if (i == n - 1) {
          System.out.println ();
          System.out.println ("Maximo: " + numeroMaximo);
          System.out.println ("Minimo: " + numeroMinimo);
        }
      }
    }
  }

  public static int devuelveNumeroMinimo (int[] numerosIntroducidos, int minimo, int i) {

    if (numerosIntroducidos[i] < minimo) {
      minimo = numerosIntroducidos[i];
    }

    return minimo;
  }

  public static int devuelveNumeroMaximo (int[] numerosIntroducidos, int maximo, int i) {

    if (numerosIntroducidos[i] > maximo) {
      maximo = numerosIntroducidos[i];
    }

    return maximo;
  }
}
