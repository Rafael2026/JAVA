public class exercise7 {
  public static void main(String[] args) {

    System.out.print("Introducir la primera nota: ");
    double nota1 = Double.parseDouble(System.console().readLine());

    System.out.print("\nIntroducir la segunda nota: ");
    double nota2 = Double.parseDouble(System.console().readLine());

    System.out.print("\nIntroducir la tercera nota: ");
    double nota3 = Double.parseDouble(System.console().readLine());

    double notaFinal = (nota1 + nota2 + nota3) / 3;

    System.out.print("\nTu nota final es: " + notaFinal);
  }
}