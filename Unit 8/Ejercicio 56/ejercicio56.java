public class ejercicio56 {
  public static void main (String[] args) {

    int numeroFilas = 4;
    int numeroColumnas = 6;

    int[][] n = new int [numeroFilas][numeroColumnas];

    for (int i = 0; i < numeroFilas; i++) {

      for (int j = 0; j < numeroColumnas; j++) {
        n[i][j] = (int)((Math.random () * 99) + 1);
      }
    }

    for (int i = 0; i < numeroFilas; i++) {

      for (int j = 0; j < numeroColumnas; j++) {
        System.out.print (n[i][j] + "\t|");
      }

      System.out.println ();
    }

    int[] arrayUnidimensional = corteza (n);
    System.out.println ();

    for (int p = 0; p < arrayUnidimensional.length; p++) {

      if (arrayUnidimensional[p] != 0) {
        System.out.print (arrayUnidimensional[p] + ", ");
      }
    }
  }

  public static int[] corteza (int[][] n) {

    int numeroFilas = 4;
    int numeroColumnas = 6;
    int p = 0;
    int[] arrayUnidimensional = new int [numeroFilas * numeroColumnas];
    int i = 0;
    int j = 0;

    for (i = 0; i < numeroFilas/numeroFilas; i++) {

      for (j = 0; j < numeroColumnas; j++) {

        if (i == 0) {
          arrayUnidimensional[p] = n[i][j];
          p++;
        }
      }
    }

    i = 1;

    do {
      arrayUnidimensional[p] = n[i][numeroColumnas - 1];
      p++;
      i++;
    } while (i < numeroFilas);

    for (i = 0; i < numeroFilas; i++) {

      for (j = numeroColumnas - 2; j >= 0; j--) {

        if (i == numeroFilas - 1) {
          arrayUnidimensional[p] = n[i][j];
          p++;
        }
      }
    }

    i = numeroFilas  - 2;

    do {
      arrayUnidimensional[p] = n[i][0];
      p++;
      i--;
    } while (i > 0);

    return arrayUnidimensional;
  }
}
