import java.util.Scanner;

public class HappyNumber {

  public static void main(String[] args) {

    Scanner sc = new Scanner (System.in);
    
    int numero;

    //Math.pow(base, exponente)
    while (true) {
      
      do {
        System.out.println("Introducir numero mayor que 1: ");
        numero = sc.nextInt();
      } while (numero <= 0);

      System.out.println();

      boolean respuesta = isHappyNumber(numero);

      if (respuesta) {
        System.out.println("\nEl numero " + numero + " es un numero feliz");
        System.out.println("----------------------------");
      } else {
        System.out.println("\nEl numero " + numero + " no es un numero feliz");
        System.out.println("----------------------------");
      }
    }
  }

  public static boolean isHappyNumber(int num) {

    int resultado;
    int aux = num;
    boolean esFeliz = false;
    
    do {

      resultado = 0;
      
      while (aux != 0) {
        resultado += ((aux%10) * (aux%10));
        aux = aux/10;
      }

      if (resultado > 0 && resultado < 10 && resultado != 1) {
        esFeliz = false;
        resultado = 0;
      } else if (resultado == 1) {
        esFeliz = true;
        System.out.println("Resultado final: " + resultado);
      } else {
        System.out.println("Resultado final: " + resultado);
        aux = resultado;
      }

    } while (resultado != 0 && resultado != 1);

    return esFeliz;
  }
}