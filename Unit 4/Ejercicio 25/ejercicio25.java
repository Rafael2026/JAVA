public class ejercicio25 {
    public static void main (String []args) {

        double altura;
        double anchura;
        double precio;
        boolean quieresEscudo;

        System.out.print ("Introducir la altura: ");
        altura = Double.parseDouble (System.console().readLine());

        System.out.print ("Introducir la anchura: ");
        anchura = Double.parseDouble (System.console().readLine());

        System.out.println ();

        double area = anchura * altura;

        System.out.print ("La bandera " + (anchura * altura) + (" de cm2 vale: ") + (area * 0.01));

        System.out.println ();
        System.out.println ();

        System.out.print ("Quieres que le ponga un escudo: ");
        quieresEscudo = Boolean.parseBoolean (System.console().readLine());


        if (quieresEscudo) {

            precio = 2.5;
            System.out.println ();
            System.out.print ("Precio del escudo: " + precio);
            System.out.println ();

        } else {

            precio = 0;

            System.out.println ();
            System.out.print ("Precio del escudo: " + precio);
            System.out.println ();

        }

        double gastosEnvio = 3.25;

        System.out.println();
        System.out.print ("Total: " + ((area * 0.01) + precio + gastosEnvio));

    }
}
