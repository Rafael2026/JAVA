public class exercise20 {
  public static void main(String[] args) {

    int aux;

    System.out.print("Introducir un numero: ");
    int numero = Integer.parseInt(System.console().readLine());

    System.out.println();

    if (numero >= 10000) {
      aux = numero % 10;
      numero = numero / 10;
      System.out.print(aux);
    } else if (numero >= 1000 && numero < 10000) {
      aux = numero % 10;
      numero = numero / 10;
      System.out.print(aux);
    } else if (numero >= 100 && numero < 1000) {
      aux = numero % 10;
      numero = numero / 10;
      System.out.print(aux);
    } else if (numero >= 10 && numero < 100) {
      aux = numero % 10;
      numero = numero / 10;
      System.out.print(aux);
    } else if (numero < 10) {
      aux = numero % 10;
      System.out.print(aux);
    }
  }
}