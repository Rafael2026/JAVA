import java.util.Scanner;

public class ejercicio6 {
  public static void main (String []args) {

    int adivinarNumero;
    int oportunidades = 5;
    int numeroIntroducido;
    boolean numeroAdivinado = false;

    Scanner scanner = new Scanner (System.in);

    adivinarNumero = (int)(Math.random() * 101);

    while ((oportunidades > 0) && (!numeroAdivinado)) {

      System.out.print ("Introducir un numero: ");
      numeroIntroducido = scanner.nextInt ();
      System.out.println ();

      if (numeroIntroducido == adivinarNumero) {
        System.out.println ();
        System.out.print ("Has adinivdado el numero");

      } else {

        if (numeroIntroducido > adivinarNumero) {
          System.out.println ("El numero introducido es mayor");
          oportunidades--;
        }

        if (numeroIntroducido < adivinarNumero) {
          System.out.println ("El numero introducido es menor");
          oportunidades--;
        }

        if (oportunidades == 0) {

          System.out.print ("El numero oculto es " + adivinarNumero);
          System.out.println ();

        } else {

          System.out.println ("Te queda " + oportunidades + " oportunidades");
          System.out.println ();

        }
      }
    }
  }
}
