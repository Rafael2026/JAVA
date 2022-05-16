public class ejercicio2 {
  public static void main (String []args) {

    String numero = "";
    String nombrePalo = "";

    int numeroPalo = (int)(Math.random() * 14) + 1;

    switch (numeroPalo) {

      case 1:
        numero = "A";
      break;

      case 11:
        numero = "J";
      break;

      case 12:
        numero = "Q";
      break;

      case 13:
        numero = "K";
      break;

      default:
        numero = String.valueOf (numeroPalo);
    }

    int numeroCarta = (int)(Math.random() * 5) + 1;

    switch (numeroCarta) {

      case 1:
        nombrePalo = "picas";
      break;

      case 2:
        nombrePalo = "corazones";
      break;

      case 3:
        nombrePalo = "diamantes";
      break;

      case 4:
        nombrePalo = "treboles";
      break;

      default:
        String.valueOf (numeroPalo);
    }

    System.out.print (numero + " de " + nombrePalo);
  }
}
