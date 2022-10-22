public class operation {
  public static void main (String[] args) {
    
    System.out.print("Introducir numero1: ");
    double numero1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("\nIntroducir numero2: ");
    double numero2 = Double.parseDouble(System.console().readLine());

    System.out.println("\nSumar: " + (numero1 + numero2));
    
    System.out.println("\nRestar: " + (numero1 - numero2));
    
    System.out.println("\nMultiplicar: " + (numero1 * numero2));
    
    System.out.println("\nDividir: " + (numero1 / numero2));
    
    System.out.println("\nModulo: " + (numero1 % numero2));
  }
}