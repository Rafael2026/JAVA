import java.util.Scanner;

public class ejercicio32 {
  public static void main (String[] args) {

    int filas = 3;
    int columnas = 3;
    int[][] arrayNumeros = new int [filas][columnas];
    int[] posiciones = {0, 0};

    Scanner scanner = new Scanner (System.in);

    System.out.println ("Introducir numeros en el array: ");

    for (int i = 0; i < filas; i++) {

      for (int j = 0; j < columnas; j++) {
        arrayNumeros[i][j] = scanner.nextInt ();
      }
    }

    System.out.println ();

    System.out.print ("Introducir un numero: ");
    int numeroIntroducido = scanner.nextInt();

    int posicionesDevueltas = generarArrayNumeros(filas, columnas, numeroIntroducido, posiciones, arrayNumeros);

    System.out.println ();

    for (int p = 0; p < posiciones.length; p++) {
      System.out.println ("Posicion " + p + ": " + posiciones[p]);
    }
  }

  public static int generarArrayNumeros (int filas, int columnas, int numeroIntroducido, int[] posiciones, int[][] arrayNumeros) {

    int p = 0;
    int i = 0;
    int j = 0;

    do {

      do {

        if (arrayNumeros[i][j] == numeroIntroducido) {
          posiciones[p] = i;
          p++;
          posiciones[p] = j;
          p = 0;
        }

        else {
          posiciones[p] = -1;
          p++;
          posiciones[p] = -1;
          p = 0;
          j++;
        }

      } while ((j < columnas) && (arrayNumeros[i][j] != numeroIntroducido));

      if ((j == columnas) && (arrayNumeros[i][j] != numeroIntroducido)) {
        i++;
        j = 0;
      }

    } while ((i < filas) && (arrayNumeros[i][j] != numeroIntroducido));

    return posiciones[p];
  }
}
