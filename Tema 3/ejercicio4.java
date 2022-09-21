public class ejercicio4 {
  public static void main (String []args) {


    System.out.print("x = ");
    double x = Double.parseDouble (System.console().readLine());

    System.out.print("y = ");
    double y = Double.parseDouble (System.console().readLine());

    System.out.println("\nSuma: " + (x + y));
    
    System.out.println("\nResta1: " + (x - y));
    
    System.out.println("\nResta2: " + (y - x));
    
    System.out.println("\nMultiplicacion: " + (x * y));
    
    System.out.println("\nDivision1: " + (x/y));
    
    System.out.println("\nDivision2: " + (y/x));
  }
}