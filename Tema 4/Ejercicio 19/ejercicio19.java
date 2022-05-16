import java.lang.Math;

public class ejercicio18 {
    public static void main (String []args) {

        int cantidadCifras;
        int numero;

        System.out.println("Introducir un numero: ");
        numero = Math.abs(Integer.parseInt(System.console().readLine()));

        if (numero < 10) {
            cantidadCifras = 1;
            System.out.println();
            System.out.print("Numero de cifras: " + cantidadCifras);
        }

        if ((numero >= 10) && (numero < 100)) {
            cantidadCifras = 2;
            System.out.println();
            System.out.print("Numero de cifras: " + cantidadCifras);
        }

        if ((numero >= 100) && (numero < 1000)) {
            cantidadCifras = 3;
            System.out.println();
            System.out.print("Numero de cifras: " + cantidadCifras);
        }

        if ((numero >= 1000) && (numero < 10000)) {
            cantidadCifras = 4;
            System.out.println();
            System.out.print("Numero de cifras: " + cantidadCifras);
        }

        if ((numero >= 10000)) {
            cantidadCifras = 5;
            System.out.println();
            System.out.print("Numero de cifras: " + cantidadCifras);
        }

    }
}
