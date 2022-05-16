import java.util.Scanner;

public class ejercicio7 {
  public static void main (String []args) {

    int cantidadNumerosAleatorios = 100;

    int numerosAleatorios[] = new int [cantidadNumerosAleatorios];

    Scanner scanner = new Scanner (System.in);

    System.out.println ("Array original");

    for (int i = 0; i < numerosAleatorios.length; i++) {
      numerosAleatorios[i] = (int)(Math.random () * 21);
      System.out.print (numerosAleatorios[i] + "  ");
    }

    System.out.println ();
    System.out.println ();

    // Leer dos valores
    System.out.print ("Valor 1: ");
    int valor1 = scanner.nextInt ();

    System.out.print ("Valor 2: ");
    int valor2 = scanner.nextInt ();

    System.out.println ();

    for (int i = 0; i < numerosAleatorios.length; i++) {

      if (numerosAleatorios[i] == valor1) {

        numerosAleatorios[i] = valor2;
        System.out.print ("'" + numerosAleatorios[i] + "'" + " ");

      } else {
        System.out.print (numerosAleatorios[i] + "  ");
      }
    }
  }
}
