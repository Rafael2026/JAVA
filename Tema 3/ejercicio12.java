public class ejercicio12 {
  public static void main (String[] args) {
    
    System.out.print("Introducir nota del examen1: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("\nIntroducir media del trimestre: ");
    double media = Double.parseDouble(System.console().readLine());

    //double nota2 = ((media - (nota1 * 0.4)) / 0.6);
    
    System.out.print("\nSi quieres que tu media sea un " + media + ", debes sacar en el segundo examen un " + ((media - (nota1 * 0.4)) / 0.6));
  }
}
