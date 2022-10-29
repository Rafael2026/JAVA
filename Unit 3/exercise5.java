public class exercise5 {
  public static void main (String[] args) {

    System.out.print("Introducir la base: ");
    double base = Double.parseDouble(System.console().readLine());

    System.out.print("\nIntroducir la altura: ");
    double altura = Double.parseDouble(System.console().readLine());

    System.out.print("\nResultado: " + (base * altura));
  }
}