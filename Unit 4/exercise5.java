public class exercise5 {
  public static void main(String[] args) {

    double resultado;

    System.out.print("Introducir a: ");
    double a = Double.parseDouble(System.console().readLine());

    System.out.print("Introducir b: ");
    double b = Double.parseDouble(System.console().readLine());

    if (a != 0) {

      resultado = (-b) / a;

      System.out.print("\nResultado " + "= " + resultado);

    } else {
      System.out.print("\nNo tiene solucion");
    }
  }
}