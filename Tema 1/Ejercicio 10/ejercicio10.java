public class ejercicio10 {
  public static void main(String[] args) {

    int y = 0;
    String azul = "\33[34m"; // Color de la bandera

    System.out.print("Introducir base: ");
    int base = Integer.parseInt (System.console().readLine()); // Anchura de la bandera

    System.out.print("Introducir altura: ");
    int altura = Integer.parseInt (System.console().readLine()); // Altura de la bandera

    System.out.println();

    // Pintar la bandera
    do {

      System.out.print (azul + "|");

      for (int x = 0; x < base; x++) {

        System.out.print ("*");

        if (x == base - 1) {
          System.out.print ("|");
          System.out.println ();
        }
      }

      y++;

    } while (y < altura);
  }
}
