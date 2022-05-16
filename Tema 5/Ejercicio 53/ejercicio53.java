import java.util.Scanner;

public class ejercicio53 {
  public static void main (String []args) {

    Scanner scanner = new Scanner (System.in);

    System.out.print ("Introducir la altura del triangulo: ");
    int altura = scanner.nextInt();

    int base = altura;
    System.out.println ();

    for (int y = 0; y < altura; y++) {

      for (int x = 0; x < base; x++) {
        System.out.print ("*");
      }

      System.out.println ();
      base--;

    }
  }
}
