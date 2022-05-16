import java.util.Scanner;

public class ejercicio28 {
  public static void main (String []args) {

    int numero;
    int resultado;
    int resultadoFinal;
    int i = 1;

    Scanner scanner = new Scanner (System.in);

    System.out.print ("Introducir un numero entero: ");
    numero = scanner.nextInt();

    resultado = i * (i + 1);

    System.out.println ();

    while ((i + 1) <= numero) {

      i++;
      resultadoFinal = resultado * (i + 1);
      resultado = resultadoFinal;

      if ((i + 1) == numero) {
        System.out.print (numero + "! " + "= " + resultadoFinal);
      }
    }
  }
}
