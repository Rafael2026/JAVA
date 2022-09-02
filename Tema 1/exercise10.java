public class exercise10 {
  public static void main(String []args) {

    int y = 0;

    // Flag's width de la bandera
    System.out.print ("Introducir base: ");
    int base = Integer.parseInt (System.console().readLine());

    // Altura de la bandera
    System.out.print("Introducir la altura: ");
    int altura = Integer.parseInt(System.console().readLine());

    System.out.println ();

    // Pintar la bandera
    do {

      System.out.printf("\33[34m" + "|");

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