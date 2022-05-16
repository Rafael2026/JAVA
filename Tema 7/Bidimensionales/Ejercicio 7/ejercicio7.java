// Minijuego "Busca el tesoro"

import java.util.Scanner;

public class ejercicio7 {
  public static void main (String[] args) {

    final int intento = 250; // Te meustra esto en un intento donde no has encontrado una mina o dos tesoros
    final int mina = 100; // Muestra esto si encuentras una mina
    final int tesoro = 500; // Muestra esto si encuentras el tesoro
    final int posicionVacia = 0; // Posiciones vacias

    final int base = 5; // Anchura del tablero
    final int altura = 5; // Altura del tablero

    int[][] posicionesTablero = new int [base][altura]; // Dimensiones del tablero
    int x;
    int y;

    boolean encontrado = false;
    String posicionOcupada = "";

    Scanner scanner = new Scanner (System.in);

    // Coloca la primera mina
    int posicion1Mina1 = (int) (Math.random() * base);
    int posicion2Mina1 = (int) (Math.random() * altura);

    posicionesTablero[posicion1Mina1][posicion2Mina1] = mina;

    // Coloca la segunda mina
    int posicion1Mina2 = (int) (Math.random() * base);
    int posicion2Mina2 = (int) (Math.random() * altura);

    posicionesTablero[posicion1Mina2][posicion2Mina2] = mina;

    // Coloca tesoro
    int posicion1Tesoro = (int) (Math.random() * base);
    int posicion2Tesoro = (int) (Math.random() * altura);

    posicionesTablero[posicion1Tesoro][posicion2Tesoro] = tesoro;

    do {

      // Dibuja el tablero
      for (x = 0; x < base; x++) {

        for (y = 0; y < altura; y++) {

          if (posicionesTablero[x][y] == intento) {
            System.out.print ("X |");
          }

          else {
            System.out.print ("  |");
          }
        }

        System.out.println ();
      }

      System.out.println ();

      // Pedir las coordenadas
      do {

        System.out.print ("Introducir una posicion x (0 - 4): ");
        x = scanner.nextInt ();

        System.out.print ("Introducir una posicion y (0 - 4): ");
        y = scanner.nextInt ();

        System.out.println ();

      } while ((x < 0 || x > 4) || (y < 0 || y > 4));

      switch (posicionesTablero[x][y]) {

        case posicionVacia:
          posicionesTablero[x][y] = intento;
        break;

        case mina:
          System.out.println ("Lo siento, has perdido.");
          encontrado = true;
          System.out.println ();
        break;

        case tesoro:
          System.out.println ("¡Enhorabuena! ¡Has encontrado el tesoro!");
          encontrado = true;
          System.out.println ();
        break;

        default:
      }

    } while (!encontrado);

    // Pintar el tablero con las figuras
    for (x = 0; x < base; x++) {

      for (y = 0; y < altura; y++) {

        switch (posicionesTablero[x][y]) {

          case posicionVacia:
            posicionOcupada = "  |";
          break;

          case mina:
            posicionOcupada = "M |";
          break;

          case tesoro:
            posicionOcupada = "T |";
          break;

          case intento:
            posicionOcupada = "X |";
          break;

          default:
        }

        System.out.print (posicionOcupada);
      }

      System.out.println ();
    }
  }
}
