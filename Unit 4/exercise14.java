public class exercise14 {
  public static void main(String[] args) {

    System.out.print("Introducir un numero: ");
    int numero = Integer.parseInt(System.console().readLine());

    boolean par = (numero % 2 == 0);
    boolean divisibleCinco = (numero % 5 == 0);

    if (par && divisibleCinco) {
      System.out.print("\nEl numero " + numero + " es par");
      System.out.print("\nEl numero " + numero + " es divisible entre cinco");
    } else if (par && !divisibleCinco) {
      System.out.print("\nEl numero " + numero + " es par");
      System.out.print("\nEl numero " + numero + " no es divisible entre cinco");
    } else if (!par && divisibleCinco) {
      System.out.print("\nEl numero " + numero + " es impar");
      System.out.print("\nEl numero " + numero + " es divisible entre cinco");
    } else {
      System.out.print("\nEl numero " + numero + " es impar");
      System.out.print("\nEl numero " + numero + " no es divisible entre cinco");
    }
  }
}
