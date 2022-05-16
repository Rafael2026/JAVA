public class ejercicio2 {
    public static void main (String []args) {

        double cantidadEnEuros;

        System.out.print("Introducir una cantidad en euros: ");
        cantidadEnEuros = Double.parseDouble (System.console().readLine());
  
        double total;
        total = (cantidadEnEuros * 166.386);
    
        System.out.println ();
        System.out.println ("Euros introducidos: " + cantidadEnEuros);
        System.out.println ("Pesetas: " + total);
        
    }
}
