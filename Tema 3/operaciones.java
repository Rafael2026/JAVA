public class operaciones {
  public static void main (String[] args) {
    
    System.out.print("Introducir numero1: ");
    double numero1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introducir numero2: ");
    double numero2 = Double.parseDouble(System.console().readLine());
    
    double suma = numero1 + numero2;
    double resta = numero1 - numero2;
    double multiplicacion = numero1 * numero2;
    double division = numero1 / numero2;
    double modulo = numero1 % numero2;

    System.out.println("\nSuma: " + suma);
    
    System.out.println("\nResta: " + resta);
    
    System.out.println("\nMultiplicacion: " + multiplicacion);
    
    System.out.println("\nDivision: " + division);
    
    System.out.println("\nModulo: " + modulo);
  }
}