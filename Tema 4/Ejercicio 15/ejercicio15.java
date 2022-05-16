public class ejercicio15 {
  public static void main (String []args) {

    int altura ;
    boolean verticeHaciaArriba = true;
    boolean verticeHaciaAbajo = true;
    boolean verticeHaciaDerecha = true;
    boolean verticeHaciaIzquierda = true;

    System.out.print ("Introducir caracter: ");
    String caracter = System.console().readLine();

    if (verticeHaciaArriba) {

      altura = 0;

      if (altura == 0) {
        System.out.println ("  " + caracter + "  ");
        altura++;

      }

      if (altura == 1) {
        System.out.println (" " + caracter + caracter + caracter + " ");
        altura++;
      }

      if (altura == 2) {
        System.out.println (caracter + caracter + caracter + caracter + caracter);
      }

    }

    System.out.println ();
    System.out.println ();

    if (verticeHaciaDerecha) {

      altura = 0;

      if (altura == 0) {
        System.out.println (caracter  );
        altura++;
      }

      if (altura == 1) {
        System.out.println (caracter + caracter );
        altura++;
      }

      if (altura == 2) {
        System.out.println (caracter + caracter + caracter);
        altura++;
      }

      if (altura == 3) {
        System.out.println (caracter + caracter );
        altura++;
      }

      if (altura == 4) {
        System.out.println (caracter  );
      }

    }

    System.out.println ();
    System.out.println ();

    if (verticeHaciaIzquierda) {

      altura = 0;

      if (altura == 0) {
        System.out.println ("  " + caracter);
        altura++;
      }

      if (altura == 1) {
        System.out.println (" " + caracter + caracter);
        altura++;
      }

      if (altura == 2) {
        System.out.println (caracter + caracter + caracter);
        altura++;
      }

      if (altura == 3) {
        System.out.println (" " + caracter + caracter);
        altura++;
      }

      if (altura == 4) {
        System.out.println ("  " + caracter);
      }

    }

    System.out.println ();
    System.out.println ();

    if (verticeHaciaAbajo) {

      altura = 0;

      if (altura == 0) {
        System.out.println (caracter + caracter + caracter + caracter + caracter);
        altura++;
      }

      if (altura == 1) {
        System.out.println (" " + caracter + caracter + caracter );
        altura++;
      }

      if (altura == 2) {
        System.out.println ("  " + caracter + "  ");
      }

    }
  }
}