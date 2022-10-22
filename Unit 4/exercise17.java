public class exercise17 {
  public static void main(String[] args) {

    System.out.println("Introducir un numero: ");
    int numero = Integer.parseInt(System.console().readLine());

    System.out.println();
    System.out.print("La ultima cifra es: " + (numero % 10));
  }
}