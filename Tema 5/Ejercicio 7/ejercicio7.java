public class ejercicio7 {
  public static void main (String []args) {

    int intentos = 4;
    int combinacionValida = 1234;
    int combinacionIntroducida;

    System.out.print ("Combinacion introducida: ");
    combinacionIntroducida = Integer.parseInt (System.console().readLine());

    boolean cajaFuerteAbierta = (combinacionValida == combinacionIntroducida);

    if (!cajaFuerteAbierta) {

      intentos--;

      while ((intentos >= 1)) {

        System.out.print ("Combinacion introducida: ");
        combinacionIntroducida = Integer.parseInt (System.console().readLine());

        intentos--;

      }

      System.out.println ();
      System.out.print ("Te has quedado sin intentos");

    } else {
      System.out.println ();
      System.out.print ("La caja fuerte se ha abierto satisfactoriamente");
    }
  }
}
