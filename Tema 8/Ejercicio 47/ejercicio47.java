public class ejercicio47 {
  public static void main (String[] args) {

    int[] a = {6, 2, 5, 0, 1};

    for (int i = 0; i < a.length; i++) {
      String cadenaDevuelta = convierteArrayEnString (a, i);
      System.out.print (cadenaDevuelta);
    }
  }

  public static String convierteArrayEnString (int[] a, int i) {

    int numero = 0;

    numero = Integer.valueOf (a[i]);

    String cadenaNumeros = "" + numero;

    return cadenaNumeros;
  }
}
