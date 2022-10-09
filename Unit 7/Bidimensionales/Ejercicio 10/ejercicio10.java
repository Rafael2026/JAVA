import java.util.Scanner;

public class ejercicio10 {
  public static void main (String[] args) {

    int base = 3;
    int altura = 3;
    boolean ganador = false;
    int numeroJugador = 1;
    int posicion1;
    int posicion2;
    int posicion3;
    int posicion4;

    Scanner scanner = new Scanner (System.in);

    int[][] posicionesTablero = new int [base][altura];

    for (int x = 0; x < base; x++) {

      for (int y = 0; y < altura; y++) {
        System.out.print ("  |");
      }

      System.out.println ();
    }

    do {

      System.out.println ();

      if (numeroJugador == 1) {

        System.out.println ("Turno del jugador 1: ");
        System.out.println ();

        do {

          System.out.print("Introducir la primera posicion : ");
          posicion1 = scanner.nextInt();

          System.out.print("Introducir la segunda posicion : ");
          posicion2 = scanner.nextInt();

          System.out.println ();

        } while ((posicion1 < 0 || posicion1 >= base) || (posicion2 < 0 || posicion2 >= altura));

        if ((posicionesTablero[0][0] == 1 && posicionesTablero[0][1] == 1 && posicionesTablero[0][2] == 1) || (posicionesTablero[1][0] == 1 && posicionesTablero[1][1] == 1 && posicionesTablero[1][2] == 1) || (posicionesTablero[2][0] == 1 && posicionesTablero[2][1] == 1 && posicionesTablero[2][2] == 1) || (posicionesTablero[0][0] == 1 && posicionesTablero[1][0] == 1 && posicionesTablero[2][0] == 1) || (posicionesTablero[0][1] == 1 && posicionesTablero[1][1] == 1 && posicionesTablero[2][1] == 1) || (posicionesTablero[0][2] == 1 && posicionesTablero[1][2] == 1 && posicionesTablero[2][2] == 1) || (posicionesTablero[0][0] == 1 && posicionesTablero[1][1] == 1 && posicionesTablero[2][2] == 1) || (posicionesTablero[0][2] == 1 && posicionesTablero[1][1] == 1 && posicionesTablero[2][0] == 1)) {
          ganador = true;
        }

        else {
          posicionesTablero[posicion1][posicion2] = 1;
          numeroJugador++;
        }
      }

      else if (numeroJugador == 2) {

        System.out.println ("Turno del jugador 2: ");
        System.out.println ();

        do {

          System.out.print ("Introducir la primera posicion : ");
          posicion3 = scanner.nextInt();

          System.out.print ("Introducir la segunda posicion : ");
          posicion4 = scanner.nextInt ();

          System.out.println ();

        } while ((posicion3 < 0 || posicion3 >= base) || (posicion4 < 0 || posicion4 >= altura));

        if ((posicionesTablero[0][0] == 2 && posicionesTablero[0][1] == 2 && posicionesTablero[0][2] == 2) || (posicionesTablero[1][0] == 2 && posicionesTablero[1][1] == 2 && posicionesTablero[1][2] == 2) || (posicionesTablero[2][0] == 2 && posicionesTablero[2][1] == 2 && posicionesTablero[2][2] == 2) || (posicionesTablero[0][0] == 2 && posicionesTablero[1][0] == 2 && posicionesTablero[2][0] == 2) || (posicionesTablero[0][1] == 2 && posicionesTablero[1][1] == 2 && posicionesTablero[2][1] == 2) || (posicionesTablero[0][2] == 2 && posicionesTablero[1][2] == 2 && posicionesTablero[2][2] == 2) || (posicionesTablero[0][0] == 2 && posicionesTablero[1][1] == 2 && posicionesTablero[2][2] == 2) || (posicionesTablero[0][2] == 2 && posicionesTablero[1][1] == 2 && posicionesTablero[2][0] == 2)) {
          ganador = true;
        }

        else {
          posicionesTablero[posicion3][posicion4] = 2;
          numeroJugador--;
        }
      }

    } while (!ganador);

    for (int x = 0; x < base; x++) {

      for (int y = 0; y < altura; y++) {
        System.out.print (posicionesTablero[x][y] + " |");
      }

      System.out.println ();
    }
  }
}
