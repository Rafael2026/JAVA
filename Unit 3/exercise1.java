public class exercise1 {
  public static void main (String []args) {

    System.out.print("First number: ");
    double numero1 = Double.parseDouble(System.console().readLine());

    System.out.print("\nSecond number: ");
    double numero2 = Double.parseDouble(System.console().readLine());

    System.out.print("\nResultado: " + (numero1 * numero2));
  }
}