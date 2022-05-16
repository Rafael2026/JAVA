public class ejercicio29 {
  public static void main (String []args) {

    String desayuno;
    String bebida;
    String palmera = "palmera";
    String donut = "donut";
    String pitufo = "pitufo";
    String zumo = "zumo";
    String cafe = "cafe";

    double precioDesayuno;
    double precioBebida;

    System.out.print ("Desayuno (palmera, donut o pitufo): ");
    desayuno = System.console().readLine();

    System.out.print ("Bebida (zumo o cafe): ");
    bebida = System.console().readLine();

    if (desayuno.equals (palmera)) {
      precioDesayuno = 1.4;
      System.out.println ();
      System.out.print ("Palmera: " + precioDesayuno);
      System.out.println ();

      if (bebida.equals (zumo)) {
        precioBebida = 1.5;
        System.out.println ();
        System.out.print ("Zumo: " + precioBebida);
        System.out.println ();
      }

      if (bebida.equals (cafe)) {
        precioBebida = 1.2;
        System.out.println ();
        System.out.print ("Cafe: " + precioBebida);
        System.out.println ();
      }

      System.out.print ("Total: " + (precioDesayuno + precioBebida));
    }

    if (desayuno.equals (donut)) {
      precioDesayuno = 1;
      System.out.println ();
      System.out.print ("Donut: " + precioDesayuno);
      System.out.println ();

      if (bebida.equals (zumo)) {
        precioBebida = 1.5;
        System.out.println ();
        System.out.print ("Zumo: " + precioBebida);
        System.out.println ();
      }

      if (bebida.equals (cafe)) {
        precioBebida = 1.2;
        System.out.println ();
        System.out.print ("Cafe: " + precioBebida);
        System.out.println ();
      }

      System.out.print ("Total: " + (precioDesayuno + precioBebida));
    }

    if (desayuno.equals (pitufo)) {

      boolean pitufoConAceite = Boolean.parseBoolean (System.console().readLine());

      if (pitufoConAceite) {

        precioDesayuno = 1.2;
        System.out.println ();
        System.out.print ("Pitufo con aceite: " + precioDesayuno);
        System.out.println ();

        if (bebida.equals (zumo)) {
          precioBebida = 1.5;
          System.out.println ();
          System.out.print ("Zumo: " + precioBebida);
          System.out.println ();
        }

        if (bebida.equals (cafe)) {
          precioBebida = 1.2;
          System.out.println ();
          System.out.print ("Cafe: " + precioBebida);
          System.out.println ();
        }

        System.out.print ("Total: " + (precioDesayuno + precioBebida));

      } else {

        precioDesayuno = 1.6;
        System.out.println ();
        System.out.print ("Pitufo con tortilla: " + precioDesayuno);
        System.out.println ();

        if (bebida.equals (zumo)) {
          precioBebida = 1.5;
          System.out.println ();
          System.out.print ("Zumo: " + precioBebida);
          System.out.println ();
        }

        if (bebida.equals (cafe)) {
          precioBebida = 1.2;
          System.out.println ();
          System.out.print ("Cafe: " + precioBebida);
          System.out.println ();
        }

        System.out.print ("Total: " + (precioDesayuno + precioBebida));
      }
    }
  }
}
