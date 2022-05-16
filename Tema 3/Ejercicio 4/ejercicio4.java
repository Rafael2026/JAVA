public class ejercicio4 {
    public static void main (String []args) {

        double x;
        double y;

        System.out.print("x = ");
        x = Double.parseDouble (System.console().readLine());

        System.out.print("y = ");
        y = Double.parseDouble (System.console().readLine());
  
        double suma = (x + y);
        double resta1 = (x - y);
        double resta2 = (y - x);
        double multiplicacion = (x * y);
        double division1 = (x/y);
        double division2 = (y/x);
        
        System.out.println();

        System.out.println ("suma: " + suma);
        System.out.println ();
    
        System.out.println ("resta1: " + resta1);
        System.out.println ();
    
        System.out.println ("resta2: " + resta2);
        System.out.println ();
    
        System.out.println ("multiplicacion: " + multiplicacion);
        System.out.println ();
    
        System.out.println ("division1: " + division1);
        System.out.println ();
    
        System.out.println ("division2: " + division2);
        System.out.println ();
    }
}
