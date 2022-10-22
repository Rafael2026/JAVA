import java.lang.Math;

public class exercise9 {
  public static void main(String[] args) {

    System.out.print("Introducir a: ");
    double a = Double.parseDouble(System.console().readLine());

    System.out.print("Introducir b: ");
    double b = Double.parseDouble(System.console().readLine());

    System.out.print("Introducir c: ");
    double c = Double.parseDouble(System.console().readLine());

    if (b > c) {

      double resultado1 = ((-b) + Math.sqrt((b * b) + (4 * a * c))) / (2 * a);
      double resultado2 = ((-b) + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);

      System.out.print("\nResultado1 = " + resultado1);
      System.out.print("\nResultado2 = " + resultado2);
    }
  }
}