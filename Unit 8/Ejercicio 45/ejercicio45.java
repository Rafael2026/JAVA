import java.util.Scanner;

public class ejercicio45 {
  public static void main (String[] args) {

    Scanner scanner = new Scanner (System.in);

    System.out.print ("Introduzca la altura de la figura: ");
    int altura = scanner.nextInt();

    while (altura < 3) {
      altura = scanner.nextInt ();
    }

    dibujaFigura (altura);
  }

  public static void dibujaFigura (int altura) {

    int cantidadCaracteres1 = 0;
    int cantidadCaracteres2 = 0;
    String[][] caracteres1 = new String [altura][altura];
    String[][] caracteres2 = new String [altura][altura];
    int j = 0;
    String[][] figura1 = new String [altura][altura];
    String[][] figura2 = new String[altura][altura];
    int cantidadEspacios = altura + (altura - 3);
    String[][] espacios = new String[altura][altura];

    for (int i = 0; i < altura; i++) {

      ++cantidadCaracteres1;

      if (cantidadCaracteres2 < altura - 1) {
        ++cantidadCaracteres2;
      }

      for (int c1 = 0; c1 < cantidadCaracteres1; c1++) {
        System.out.print ("*");
        j++;
      }

      for (int e = 0; e < cantidadEspacios; e++) {
        System.out.print (" ");
        j++;
      }

      cantidadEspacios -= 2;

      for (int c2 = 0; c2 < cantidadCaracteres2; c2++) {
        System.out.print ("*");
        j++;
      }

      System.out.println ();

      j = 0;
    }
  }
}
