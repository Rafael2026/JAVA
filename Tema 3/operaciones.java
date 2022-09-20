public class operaciones {
  public static void main (String[] args) {
    
    System.out.print("Introducir numero1: ");
    double numero1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introducir numero2: ");
    double numero2 = Double.parseDouble(System.console().readLine());
    
    double suma = numero1 + numero2;

    System.out.println("suma: " + suma);
    
    double resta = numero1 - numero2;
    System.out.println("resta: " + resta);
    
    double multiplicacion = numero1 * numero2;
    System.out.println("multiplicacion: " + multiplicacion);
    
    double division = numero1 / numero2;
    System.out.println("division: " + division);
    
    double modulo = numero1 % numero2;
    System.out.println("modulo: " + modulo);
  }
}