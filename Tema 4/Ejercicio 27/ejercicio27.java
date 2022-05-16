public class ejercicio27 {
    public static void main (String []args) {

        String sabor;
        String color;
        double precioTarta;
        double precioColor;
        double precioNata;
        double precioNombre;

        System.out.print ("Que sabor de tarta prefieres: ");
        sabor = System.console().readLine();

        switch (sabor) {

            case "manzana":
                precioTarta = 18;
                System.out.println ();
                System.out.print ("Precio de la tarta de manzana: " + precioTarta);
            break;

            case "fresa":
                precioTarta = 16;
                System.out.println ();
                System.out.print ("Precio de la tarta de fresa: " + precioTarta);
            break;

            case "chocolate":

                System.out.println ();
                System.out.print ("Chocolate negro o blanco");
                System.out.println ();
                System.out.println ();

                System.out.print ("Color del chocolate: ");
                color = System.console().readLine();

                if (color == "negro") {
                    precioColor = 14;
                } else {
                    precioColor = 15;
                }

                System.out.println ();

                System.out.print ("Quieres nata: ");
                boolean nata = Boolean.parseBoolean (System.console().readLine());

                if (nata) {
                    precioNata = 2.5;
                } else {
                    precioNata = 0;
                }

                System.out.println ();

                System.out.print ("Quieres que le pongamos tu nombre en la tarta: ");
                boolean nombre = Boolean.parseBoolean (System.console().readLine());

                if (nombre) {
                    precioNombre = 2.75;
                } else {
                    precioNombre = 0;
                }

                System.out.println ();
                System.out.print ("Precio total de la tarta de chocolate: " + (precioColor + precioNata + precioNombre));

            break;

        }
    }
}
