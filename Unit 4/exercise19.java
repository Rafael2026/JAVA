import java.lang.Math;

public class exercise19 {
  public static void main(String[] args) {

    System.out.println("Introducir un numero: ");
    int numero = Math.abs(Integer.parseInt(System.console().readLine()));

    if (numero < 10) {
      System.out.print("\nNumero de cifras: " + 1);
    } else if ((numero >= 10) && (numero < 100)) {
      System.out.print("\nNumero de cifras: " + 2);
    } else if ((numero >= 100) && (numero < 1000)) {
      System.out.print("\nNumero de cifras: " + 3);
    } else if ((numero >= 1000) && (numero < 10000)) {
      System.out.print("\nNumero de cifras: " + 4);
    } else if (numero >= 10000) {
      System.out.print("\nNumero de cifras: " + 5);
    }
  }
}
