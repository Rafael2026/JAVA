import java.util.Scanner;

public class ejercicio9 {
  public static void main (String[] args) {

    int numero;
    int numeroAcortado;
    int n = 2;

    Scanner scanner = new Scanner (System.in);

    System.out.print ("Introducir un numero: ");
    numero = scanner.nextInt ();

    System.out.println ();

    for (int i = 0; i < n; i++) {

      numeroAcortado = quitaDetras (numero);
      numero = numeroAcortado;

      if (i == n - 1) {
        System.out.print("El numero acaba asi: ");
        System.out.print(numeroAcortado);
      }
    }
  }

  public static int quitaDetras (int numero) {

    int aux = numero/10;

    return aux;
  }
}
