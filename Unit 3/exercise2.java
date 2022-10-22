public class exercise2 {
  public static void main (String[] args) {

    System.out.print("Introducir una cantidad en euros: ");
    double cantidadEnEuros = Double.parseDouble(System.console().readLine());
    
    double total = (cantidadEnEuros * 166.386);
    
    System.out.println("\nEuros introducidos: " + cantidadEnEuros);
    System.out.println("Pesetas: " + total);
    
  }
}
