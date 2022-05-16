public class ejercicio52 {
  public static void main (String[] args) {

    int[] a = {111, 222, 333, 444};

    int numero = aleatorioDeArray (a);

    System.out.print ("Numero: " + numero);
  }

  public static int aleatorioDeArray(int[] a) {

    int i = (int)(Math.random () * a.length);
    int valorDevuelto = a[i];

    return valorDevuelto;
  }
}
