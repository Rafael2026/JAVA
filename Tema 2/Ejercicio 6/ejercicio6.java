public class ejercicio6 {
  public static void main (String []args) {
    
    System.out.println ("Introducir cantidades: ");
    int x;
    System.out.print ("x: ");
    x = Integer.parseInt (System.console().readLine());
    
    int a;
    System.out.print ("a: ");
    a = Integer.parseInt (System.console().readLine());
    
    int m;
    System.out.print ("m: ");
    m = Integer.parseInt (System.console().readLine());
    
    System.out.println ();
    System.out.println ("Introducir precios: ");
    
    double y;
    System.out.print ("y: ");
    y = Double.parseDouble (System.console().readLine());
    
    double b;
    System.out.print ("b: ");
    b = Double.parseDouble (System.console().readLine());
    
    double n;
    System.out.print ("n: ");
    n = Double.parseDouble (System.console().readLine());
    
    double subtotal1 = (y * x);
    double subtotal2 = (b * a);
    double subtotal3 = (n * m);
    
    System.out.println ();
    
    double precioParcial1 = (subtotal1 - (subtotal1 * 21) / 100);
    double precioParcial2 = (subtotal2 - (subtotal2 * 21) / 100);
    double precioParcial3 = (subtotal3 - (subtotal3 * 21) / 100);
    
    System.out.println ("Articulo\t" + "|" + "Cantidad\t" + "|" + "Precio\t" + "|" + "Subtotal\t" + "|");
    System.out.println ("---------------------------------------------------------");
    System.out.println ("Articulo1\t" + "|" + x + "\t\t" + "|" + y + "\t" + "|" + precioParcial1 + "\t\t" + "|");
    System.out.println ("Articulo2\t" + "|" + a + "\t\t" + "|" + b + "\t" + "|" + precioParcial2 + "\t\t" + "|");
    System.out.println ("Articulo3\t" + "|" + m + "\t\t" + "|" + n + "\t" + "|" + precioParcial3 + "\t\t" + "|");
    System.out.println ("---------------------------------------------------------");
    
    double total = precioParcial1 + precioParcial2 + precioParcial3;
    System.out.print("\t\t\t\t\t" + "|" + total);
  }
}
