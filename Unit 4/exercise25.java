public class exercise25 {
  public static void main(String[] args) {

    double precio;

    System.out.print("Introducir la altura: ");
    double altura = Double.parseDouble(System.console().readLine());

    System.out.print("Introducir la anchura: ");
    double anchura = Double.parseDouble(System.console().readLine());

    double area = anchura * altura;

    System.out.print("\nLa bandera " + (anchura * altura) + (" de cm2 vale: ") + (area * 0.01));

    System.out.print("\n\nQuieres que le ponga un escudo: ");
    boolean escudo = Boolean.parseBoolean(System.console().readLine());

    if (escudo) {
      precio = 2.5;
      System.out.print("\nPrecio del escudo: " + precio + "\n"); /* Prize: 2.5 */
    } else {
      precio = 0;
      System.out.print("\nPrecio del escudo: " + precio + "\n"); /* Prize: 0 */
    }

    double gastosEnvio = 3.25;

    System.out.print("\nTotal: " + ((area * 0.01) + precio + gastosEnvio));
  }
}
