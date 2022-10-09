import java.util.Scanner;

public class ejercicio28 {
  public static void main (String []args) {

    Scanner scanner = new Scanner (System.in);

    System.out.print ("Leer la longitud del array: ");
    int longitudArray = scanner.nextInt ();

    int numeros[] = new int [longitudArray];

    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = (int)(Math.random () * 201);
    }

    // Secuencia original
    System.out.println ();
    System.out.println ("Array Original: ");
    System.out.println ();
    System.out.println ("-------------------------------------------------------------------------------------------");
    System.out.print ("|Indice\t");

    for (int i = 0; i < numeros.length; i++) {
      System.out.print ("|" + i + "\t");
    }

    System.out.println ();

    for (int i = 0; i < numeros.length; i++) {

      if (i == 0) {
        System.out.print ("|\t|" + numeros[i] + "\t");
      } else {
        System.out.print ("|" + numeros[i] + "\t");
      }
    }

    System.out.println ();
    System.out.println ("-------------------------------------------------------------------------------------------");

    // Resultado
    System.out.println ();
    System.out.println ();
    System.out.println ();
    System.out.println ("Array Resultado: ");
    System.out.println ();
    System.out.println ("-------------------------------------------------------------------------------------------");
    System.out.print ("|Indice\t");

    for (int i = 0; i < numeros.length; i++) {
      System.out.print ("|" + i + "\t");
    }

    System.out.println ();

    for (int i = 0; i < numeros.length; i++) {

      if (i == 0) {
        System.out.print ("|\t");
      }

      for (i = 0; i < numeros.length; i++) {

        boolean posicionPar = ((i%2) == 0);

        if (posicionPar) {
          System.out.print ("|" + numeros[i] + "\t");
        }
      }
    }

    for (int i = numeros.length - 1; i > 0; i--) {

      boolean posicionImPar = ((i%2) == 1);

      if (posicionImPar) {
        System.out.print ("|" + numeros[i] + "\t");
      }
    }

    System.out.println ();
    System.out.println ("-------------------------------------------------------------------------------------------");
    System.out.println ();
  }
}
