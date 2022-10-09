public class operaciones {
  public static void main (String[] args) {
    
    System.out.print("Introducir numero1: ");
    double numero1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introducir numero2: ");
    double numero2 = Double.parseDouble(System.console().readLine());

    System.out.println("\nSuma: " + (numero1 + numero2));
    
    System.out.println("\nResta: " + (numero1 - numero2));
    
    System.out.println("\nMultiplicacion: " + (numero1 * numero2));
    
    System.out.println("\nDivision: " + (numero1 / numero2));
    
    System.out.println("\nModulo: " + (numero1 % numero2));
  }
}