import java.lang.Math;

public class exercise6 {
  public static void main(String[] args) {

    double g = 9.81;

    System.out.print("Introducir altura: ");
    double h = Double.parseDouble(System.console().readLine());

    double t = Math.sqrt((2 * h) / g);

    System.out.print("\nTiempo: " + t);
  }
}