public class exercise9 {
  public static void main(String []args) {

    int y = 0;

    // Anchura de la bandera
    System.out.print ("Introducir base: ");
    int base = Integer.parseInt(System.console().readLine());

    System.out.println ();

    // Altura de la bandera
    System.out.print ("Introducir altura: ");
    int altura = Integer.parseInt(System.console().readLine());

    System.out.println();

    // Pintar la bandera
    do {

      System.out.print ("|");

      for (int x = 0; x < base; x++) {

        System.out.print ("*");

        if (x == base - 1) {
          System.out.print("|");
          System.out.println();
        }
      }

      y++;

    } while (y < altura);
  }
}