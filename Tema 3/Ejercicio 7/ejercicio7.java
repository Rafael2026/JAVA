public class ejercicio7 {
    public static void main (String []args) {

        int x;
        int a;
        int m;
        double y;
        double b;
        double n;

        System.out.println ("Introducir cantidades: ");
    
        System.out.print ("x: ");
        x = Integer.parseInt (System.console().readLine());
    
        System.out.print ("a: ");
        a = Integer.parseInt (System.console().readLine());
        
        System.out.print ("m: ");
        m = Integer.parseInt (System.console().readLine());
    
        System.out.println ();
        System.out.println ("Introducir precios: ");
        
        System.out.print ("y: ");
        y = Double.parseDouble (System.console().readLine());
        
        System.out.print ("b: ");
        b = Double.parseDouble (System.console().readLine());
        
        System.out.print ("n: ");
        n = Double.parseDouble (System.console().readLine());
    
        double subtotal1 = (y * x);
        double subtotal2 = (b * a);
        double subtotal3 = (n * m);
    
        System.out.println ();
    
        System.out.println ("Articulo\t" + "|" + "Cantidad\t" + "|" + "Precio\t" + "|" + "Subtotal\t" + "|");
        System.out.println ("---------------------------------------------------------");
        System.out.println ("Articulo1\t" + "|" + x + "\t\t" + "|" + y + "\t" + "|" + subtotal1 + "\t\t" + "|");
        System.out.println ("Articulo2\t" + "|" + a + "\t\t" + "|" + b + "\t" + "|" + subtotal2 + "\t\t" + "|");
        System.out.println ("Articulo3\t" + "|" + m + "\t\t" + "|" + n + "\t" + "|" + subtotal3 + "\t\t" + "|");
        System.out.println ("---------------------------------------------------------");
    
        double total = subtotal1 + subtotal2 + subtotal3;
        System.out.print("\t\t\t\t\t" + "|" + total);
    }
}
