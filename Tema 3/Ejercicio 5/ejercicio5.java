public class ejercicio5 {
  public static void main (String[] args) {

    System.out.print ("Introducir la base: ");
    double base = Double.parseDouble(System.console().readLine());

    System.out.print ("Introducir la altura: ");
    double altura = Double.parseDouble(System.console().readLine());

    System.out.println ();

    System.out.print ("Resultado: " + (base * altura));
  }
}
