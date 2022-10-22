public class exercise21 {
  public static void main(String[] args) {

    System.out.print("Introducir la primera nota de programacion: ");
    double nota1 = Double.parseDouble(System.console().readLine());

    System.out.print("Introducir la segunda nota de programacion: ");
    double nota2 = Double.parseDouble(System.console().readLine());

    double media = (nota1 + nota2) / 2;

    System.out.println();

    if (media >= 5) {
      System.out.print("Tu nota final de programacion es: " + media);
    } else {

      System.out.print("Introducir nota de la recuperacion: ");
      double recuperacion = Double.parseDouble(System.console().readLine());

      System.out.println();

      if (recuperacion >= 5) {
        System.out.println("Recuperacion final de programacion es: " + recuperacion);
        System.out.println("Apto");
      } else {
        System.out.println("Nota final de programacion es: " + recuperacion);
        System.out.println("No apto");
      }
    }
  }
}