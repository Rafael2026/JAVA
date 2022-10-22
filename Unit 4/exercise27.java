public class exercise27 {
  public static void main(String[] args) {

    String color;
    double precioTarta;
    double precioColor;
    double precioNata;
    double precioNombre;

    System.out.print("Que sabor de tarta prefieres: ");
    String sabor = System.console().readLine();

    switch (sabor) {

      case "manzana":
        precioTarta = 18;
        System.out.print("\nPrecio de la tarta de manzana: " + precioTarta);
      break;

      case "fresa":
        precioTarta = 16;
        System.out.print("\nPrecio de la tarta de fresa: " + precioTarta);
      break;

      case "chocolate":

        System.out.print("\nChocolate negro o blanco\n");

        System.out.print("\nColor del chocolate: ");
        color = System.console().readLine();

        if (color == "negro") {
          precioColor = 14;
        } else {
          precioColor = 15;
        }

        System.out.print("\n¿Quieres nata?: ");
        boolean nata = Boolean.parseBoolean(System.console().readLine());

        if (nata) {
          precioNata = 2.5;
        } else {
          precioNata = 0;
        }

        System.out.print("\n¿Quieres que le pongamos tu nombre en la tarta?: ");
        boolean nombre = Boolean.parseBoolean(System.console().readLine());

        if (nombre) {
          precioNombre = 2.75;
        } else {
          precioNombre = 0;
        }

        System.out.print("\nPrecio total de la tarta de chocolate: " + (precioColor + precioNata + precioNombre));

      break;
    }
  }
}