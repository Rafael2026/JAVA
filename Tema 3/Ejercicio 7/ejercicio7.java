public class ejercicio7 {
  public static void main (String[] args) {

    System.out.println ("Introducir cantidades: ");
    
    System.out.print ("x: ");
    int cantidad1 = Integer.parseInt (System.console().readLine());
    
    System.out.print ("a: ");
    int cantidad2 = Integer.parseInt (System.console().readLine());
    
    System.out.print ("m: ");
    int cantidad3 = Integer.parseInt (System.console().readLine());
    
    System.out.println();

    System.out.println ("Introducir precios: ");
    
    System.out.print ("y: ");
    double precio1 = Double.parseDouble (System.console().readLine());
    
    System.out.print ("b: ");
    double precio2 = Double.parseDouble (System.console().readLine());
    
    System.out.print ("n: ");
    double precio3 = Double.parseDouble (System.console().readLine());
    
    
    System.out.println ();
    
    System.out.println ("Articulo\t" + "|" + "Cantidad\t" + "|" + "Precio\t" + "|" + "Subtotal\t" + "|");
    System.out.println ("---------------------------------------------------------");
    System.out.println ("Articulo1\t|" + cantidad1 + "\t\t|" + precio1 + "\t|" + (cantidad1 * precio1) + "\t\t|");
    System.out.println ("Articulo2\t|" + cantidad2 + "\t\t|" + precio2 + "\t|" + (cantidad2 * precio2) + "\t\t|");
    System.out.println ("Articulo3\t|" + cantidad3 + "\t\t|" + precio3 + "\t|" + (cantidad3 * precio3) + "\t\t|");
    System.out.println ("---------------------------------------------------------");
    
    System.out.print("\t\t\t\t\t" + "|" + ((cantidad1 * precio1) + (cantidad2 * precio2) + (cantidad3 * precio3)));
  }
}