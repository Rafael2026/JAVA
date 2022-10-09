import java.lang.Math;

public class ejercicio9 {
  public static void main (String []args) {

    int numero = 10;

    for (int contador = 0; contador < 10; contador++) {

      System.out.print ("Numero: " + Math.pow(numero, contador));

      if (Math.pow(numero, contador) < Math.pow(numero, contador + 1)) {
        System.out.println ();
        System.out.print ("Digitos: " + (contador + 1));
        System.out.println ();
        System.out.println ();
      }
    }
  }
}
