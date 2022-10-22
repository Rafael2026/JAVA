public class exercise8 {
  public static void main(String[] args) {

    System.out.print("Introducir la primera nota: ");
    double nota1 = Double.parseDouble(System.console().readLine());

    System.out.print("\nIntroducir la segunda nota: ");
    double nota2 = Double.parseDouble(System.console().readLine());

    System.out.print("\nIntroducir la tercera nota: ");
    double nota3 = Double.parseDouble(System.console().readLine());

    double notaFinal = (nota1 + nota2 + nota3) / 3;

    if ((notaFinal >= 0) && (notaFinal < 5)) {
      System.out.print("\nTu nota final es: " + notaFinal);
      System.out.print("\nSuspenso");
    } else if ((notaFinal >= 5) && (notaFinal < 6)) {
      System.out.print("\nTu nota final es: " + notaFinal);
      System.out.print("\nSuficiente");
    } else if ((notaFinal >= 6) && (notaFinal < 7)) {
      System.out.print("\nTu nota final es: " + notaFinal);
      System.out.print("\nBien");
    } else if ((notaFinal >= 7) && (notaFinal < 9)) {
      System.out.print("\nTu nota final es: " + notaFinal);
      System.out.print("\nNotable");
    } else if ((notaFinal >= 7) && (notaFinal < 9)) {
      System.out.print("\nTu nota final es: " + notaFinal);
      System.out.print("\nSobresaliente");
    }
  }
}