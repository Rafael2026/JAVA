public class operaciones {
  public static void main (String []args) {
    
    double numero1;
    double numero2;
    double suma;
    double resta;
    double multiplicacion;
    double division;
    double modulo;
    
    System.out.print ("Introducir numero1: ");
    numero1 = Double.parseDouble (System.console().readLine());
    
    System.out.print ("Introducir numero2: ");
    numero2 = Double.parseDouble (System.console().readLine());
    
    suma = numero1 + numero2;
    System.out.println ("suma: " + suma);
    
    resta = numero1 - numero2;
    System.out.println ("resta: " + resta);
    
    multiplicacion = numero1 * numero2;
    System.out.println ("multiplicacion: " + multiplicacion);
    
    division = numero1 / numero2;
    System.out.println ("division: " + division);
    
    modulo = numero1 % numero2;
    System.out.println ("modulo: " + modulo);
  }
}
