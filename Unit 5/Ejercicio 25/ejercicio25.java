import java.util.Scanner;

public class ejercicio25 {
  public static void main (String []args) {

    Scanner scanner = new Scanner (System.in);

    System.out.print ("Introducir un numero: ");
    int numero = scanner.nextInt();

    System.out.println ();

    while (numero >= 1) {

      int aux = numero%10;
      System.out.print (aux);

      numero = numero / 10;

    }
  }
}
