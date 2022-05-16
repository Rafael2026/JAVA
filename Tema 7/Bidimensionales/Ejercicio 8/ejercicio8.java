import java.util.Scanner;

public class ejercicio8 {
  public static void main (String[] args) {

    int base = 8;
    int altura = 8;
    int x = 0;
    int y;
    int posicionX;
    int posicionY;

    String caracter[] = new String [base];
    int[][] posicionesTablero = new int [base][altura];

    Scanner scanner = new Scanner (System.in);

    caracter[0] = "a";
    caracter[1] = "b";
    caracter[2] = "c";
    caracter[3] = "d";
    caracter[4] = "e";
    caracter[5] = "f";
    caracter[6] = "g";
    caracter[7] = "h";

    System.out.print ("Introducir el primer valor: ");
    posicionX = scanner.nextInt ();

    System.out.print ("Introducir el segundo valor: ");
    posicionY = scanner.nextInt ();

    System.out.println ();
    System.out.println ();

    do {

      if (x == 0) {
        System.out.print ("  " + caracter[x]);
        x++;
      }

      else {
        System.out.print (" " + caracter[x]);
        x++;
      }

    } while (x < base);

    System.out.println ();

    System.out.println (" ----------------");

    for (x = base; x > 0; x--) {

      System.out.print (x);

      for (y = 0; y < altura; y++) {

        if (y%2 == 0) {

          if (x == posicionX && y == posicionY) {
            System.out.print ("|♝");
          }

          else {
            System.out.print ("| ");
          }
        }

        else {

          if (x == posicionX && y == posicionY) {
            System.out.print ("|♗");
          }

          else {
            System.out.print ("|█");
          }
        }
      }

      System.out.print (" " + (base - x));

      System.out.println ();
    }

    System.out.println (" ----------------");

    x = 0;

    do {

      if (x == 0) {
        System.out.print ("  " + caracter[x]);
        x++;
      }

      else {
        System.out.print (" " + caracter[x]);
        x++;
      }

    } while (x < base);

    System.out.println ();
    System.out.println ();

    System.out.print ("El alfil puede moverse a las siguientes posiciones: ");

    x = base;
    y = 0;

    do {

      if (y < posicionX - 1) {
        System.out.print (caracter[y]);
        System.out.print (x + ", ");
        x--;
        y++;
      }

      else if (x >= posicionX - 1) {

        System.out.print (caracter[y]);
        y++;

        x--;
        System.out.print (x + ", ");
      }

    } while (x >= (base/base) && y < altura);
  }
}
