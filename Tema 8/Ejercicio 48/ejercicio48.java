public class ejercicio48 {
  public static void main(String[] args) {

    int[] a = {8, 9, 0};
    int[] b = {1, 2, 3};

    int[] arrayConcatenado = concatena (a, b);

    for (int i = 0; i < arrayConcatenado.length; i++) {
      System.out.print (arrayConcatenado[i] + ", ");
    }
  }

  public static int[] concatena (int[] a, int[] b) {

    int[] resultado = new int [a.length + b.length];

    System.arraycopy (a, 0, resultado, 0, a.length);
    System.arraycopy (b, 0, resultado, a.length, b.length);

    return resultado;
  }
}
