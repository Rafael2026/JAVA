public class exercise29 {
  public static void main (String []args) {

    double precioDesayuno = 0;
    double precioBebida = 0;

    System.out.println("Desayuno (palmera, donut o pitufo): ");
    String desayuno = System.console().readLine();

    System.out.println("Bebida (zumo o cafe): ");
    String bebida = System.console().readLine();

    if (desayuno.equals("palmera")) {

      precioDesayuno = 1.4;

      System.out.println("Palmera: " + precioDesayuno);

      if (bebida.equals("zumo")) {

        precioBebida = 1.5;

        System.out.println("Zumo: " + precioBebida);
      } else if (bebida.equals("cafe")) {

        precioBebida = 1.2;

        System.out.println("Cafe: " + precioBebida);
      }

      System.out.print ("Total: " + (precioDesayuno + precioBebida));
      
    } else if (desayuno.equals("donut")) {
      
      precioDesayuno = 1;

      System.out.println("Donut: " + precioDesayuno);

      if (bebida.equals("zumo")) {

        precioBebida = 1.5;

        System.out.println("Zumo: " + precioBebida);

      } else if (bebida.equals ("cafe")) {
        
        precioBebida = 1.2;

        System.out.println("Cafe: " + precioBebida);
      }

      System.out.println("Total: " + (precioDesayuno + precioBebida));

    } else if (desayuno.equals ("pitufo")) {

      boolean pitufoConAceite = Boolean.parseBoolean (System.console().readLine());

      if (pitufoConAceite) {

        precioDesayuno = 1.2;

        System.out.println("Pitufo con aceite: " + precioDesayuno);

        if (bebida.equals ("zumo")) {
          
          precioBebida = 1.5;

          System.out.println("Zumo: " + precioBebida);

        } else if (bebida.equals ("cafe")) {

          precioBebida = 1.2;

          System.out.println("Cafe: " + precioBebida);
        }

        System.out.println("Total: " + (precioDesayuno + precioBebida));

      } else {

        precioDesayuno = 1.6;

        System.out.println("Pitufo con tortilla: " + precioDesayuno);

        if (bebida.equals ("zumo")) {
          
          precioBebida = 1.5;

          System.out.println("Zumo: " + precioBebida);

        } else if (bebida.equals ("cafe")) {
          
          precioBebida = 1.2;

          System.out.println("Cafe: " + precioBebida);
        }

        System.out.println("Total: " + (precioDesayuno + precioBebida));
      }
    }
  }
}