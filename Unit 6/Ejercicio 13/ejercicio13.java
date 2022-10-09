public class ejercicio13 {
  public static void main (String []args) {

    int dado1;
    int dado2;

    do {

      dado1 = (int)(Math.random () * 6 + 1);
      dado2 = (int)(Math.random () * 6 + 1);

    } while (dado1 != dado2);

    System.out.println ("dado1: " + dado1);
    System.out.print ("dado2: " + dado2);
  }
}
