public class exercise8 {
  public static void main(String[] args) {

    System.out.print("Introducir la primera nota: ");
    double nota1 = Double.parseDouble(System.console().readLine());

    System.out.print("\nIntroducir la segunda nota: ");
    double nota2 = Double.parseDouble(System.console().readLine());

    System.out.print("\nIntroducir la tercera nota: ");
    double nota3 = Double.parseDouble(System.console().readLine());

    double notaFinal = (nota1 + nota2 + nota3) / 3;

    if (notaFinal >= 0 && notaFinal < 5) {
      System.out.println("\nTu nota final es: " + notaFinal);
      System.out.print("Suspenso");
    } else if ((notaFinal >= 5) && (notaFinal < 6)) {
      System.out.println("\nTu nota final es: " + notaFinal);
      System.out.print("Suficiente");
    } else if ((notaFinal >= 6) && (notaFinal < 7)) {
      System.out.println("\nTu nota final es: " + notaFinal);
      System.out.print("Bien");
    } else if ((notaFinal >= 7) && (notaFinal < 9)) {
      System.out.println("\nTu nota final es: " + notaFinal);
      System.out.print("Notable");
    } else if ((notaFinal >= 7) && (notaFinal < 9)) {
      System.out.println("\nTu nota final es: " + notaFinal);
      System.out.print("Sobresaliente");
    }
  }
}