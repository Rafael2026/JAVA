public class exercise6 {
  public static void main (String []args) {

    System.out.println("Introducir cantidades: ");
    
    System.out.print("Primera cantidad: ");
    int cant1 = Integer.parseInt (System.console().readLine());

    System.out.print("Segunda cantidad: ");
    int cant2 = Integer.parseInt(System.console().readLine());

    System.out.print("Tercera cantidad: ");
    int cant3 = Integer.parseInt(System.console().readLine());

    System.out.print("\n" + "Introducir precios: " + "\n");

    System.out.print("Primer precio: ");
    double precio1 = Double.parseDouble (System.console().readLine());

    System.out.print("Segundo Precio: ");
    double precio2 = Double.parseDouble (System.console().readLine());

    System.out.print("Tercer precio: ");
    double precio3 = Double.parseDouble (System.console().readLine());

    System.out.println("\nArticulo  |" + "Cantidad |" +
                        "Precio " + "|" + "Subtotal |");
    System.out.println("---------------------------------------");
    System.out.println("Articulo1 |" + cant1 + "\t    |" +
                        precio1 + "    |" +
                        (cant1 * precio1) + "      |");

    System.out.println("Articulo2 |" + cant2 + "\t    |" + precio2 + "    |" + (cant2 * precio2) + "      |");

    System.out.println("Articulo3 |" + cant3 + "\t    |" +
                        precio3 + "    |" +
                        (cant3 * precio3) + "      |");

    System.out.println("---------------------------------------");

    double total = ((cant1 * precio1) + (cant2 * precio2) + (cant3 * precio3));
    System.out.print("\t\t\t    |" + total);
  }
}