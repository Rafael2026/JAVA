public class exercise7 {
  public static void main (String[] args) {

    System.out.println("Introducir cantidades: ");
    
    System.out.print("\nx: ");
    int cantidad1 = Integer.parseInt (System.console().readLine());
    
    System.out.print("\na: ");
    int cantidad2 = Integer.parseInt (System.console().readLine());
    
    System.out.print("\nm: ");
    int cantidad3 = Integer.parseInt (System.console().readLine());

    System.out.println("\nIntroducir precios: ");
    
    System.out.print("\ny: ");
    double precio1 = Double.parseDouble (System.console().readLine());
    
    System.out.print("\nb: ");
    double precio2 = Double.parseDouble (System.console().readLine());
    
    System.out.print("\nn: ");
    double precio3 = Double.parseDouble (System.console().readLine());
    
    System.out.println("\nArticulo\t|" + "Cantidad\t|" + "Precio\t|" + "Subtotal\t|");
    System.out.println("---------------------------------------------------------");
    System.out.println("Articulo1\t|" + cantidad1 + "\t\t|" + precio1 + "\t|" + (cantidad1 * precio1) + "\t\t|");
    System.out.println ("Articulo2\t|" + cantidad2 + "\t\t|" + precio2 + "\t|" + (cantidad2 * precio2) + "\t\t|");
    System.out.println ("Articulo3\t|" + cantidad3 + "\t\t|" + precio3 + "\t|" + (cantidad3 * precio3) + "\t\t|");
    System.out.println("---------------------------------------------------------");
    
    System.out.print("\t\t\t\t\t|" + ((cantidad1 * precio1) + (cantidad2 * precio2) + (cantidad3 * precio3)));
  }
}