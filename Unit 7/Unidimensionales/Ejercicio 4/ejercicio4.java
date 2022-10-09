public class ejercicio4 {
  public static void main (String []args) {

    int numeros[] = new int [20];
    int cuadrado;
    int cubo;

    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = (int)(Math.random () * 101);
    }

    System.out.print ("|Numero\t");
    System.out.print ("|Cuadrado  ");
    System.out.println ("|Cubo\t|");
    System.out.println ("---------------------------------");

    for (int i = 0; i < numeros.length; i++) {

      System.out.print ("|" + numeros[i] + "\t");

      cuadrado = numeros[i] * numeros[i];
      System.out.print ("|" + cuadrado + "\t");

      cubo = cuadrado * numeros[i];
      System.out.print ("   |" + cubo);

      System.out.println ();
    }
  }
}
