public class ejercicio3 {
  public static void main (String []args) {

    System.out.print("Introducir una cantidad en euros: ");
    double cantidadEnPesetas = Double.parseDouble(System.console().readLine());
  
    double total = (cantidadEnPesetas / 166.386);
    
    System.out.println();
    System.out.println("Pesetas: " + cantidadEnPesetas);
    System.out.println("Euros introducidos: " + total);
  }
}
