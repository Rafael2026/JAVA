public class ejercicio4 {
  public static void main (String []args) {


    System.out.print("x = ");
    double x = Double.parseDouble (System.console().readLine());

    System.out.print("y = ");
    double y = Double.parseDouble (System.console().readLine());
    
    System.out.println();

    System.out.println("suma: " + (x + y));
    System.out.println();
    
    System.out.println("resta1: " + (x - y));
    System.out.println();
    
    System.out.println("resta2: " + (y - x));
    System.out.println();
    
    System.out.println("multiplicacion: " + (x * y));
    System.out.println();
    
    System.out.println("division1: " + (x/y));
    System.out.println();
    
    System.out.println("division2: " + (y/x));
    System.out.println();
  }
}