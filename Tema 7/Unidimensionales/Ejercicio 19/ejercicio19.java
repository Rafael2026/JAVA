import java.util.Scanner;

public class ejercicio19 {
    public static void main (String []args) {

        int cantidadNumerosAleatorios = 12;
        int numerosAleatorios [] = new int [cantidadNumerosAleatorios];

        Scanner scanner = new Scanner (System.in);

        System.out.println ("Array Original: ");
        System.out.println ();

        System.out.print ("Indice" + "\t|  ");

        for (int i = 0; i < numerosAleatorios.length; i++) {
            System.out.print (i + "\t|  ");
        }

        System.out.println ();

        System.out.print ("valor " + " |  ");

        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = (int)(Math.random () * 201);
        }

        for (int i = 0; i < numerosAleatorios.length; i++) {
            System.out.print (numerosAleatorios[i] + "\t|  ");
        }

        System.out.println ();
        System.out.println ();

        System.out.print ("Introduzca un numero: ");
        int numeroIntroducido = scanner.nextInt ();

        System.out.print ("Introduzca una posicion: ");
        int posicionIntroducida = scanner.nextInt ();

        System.out.println ();

        System.out.println ("Array Resultado: ");

        System.out.println ();

        System.out.print ("Indice" + "\t|  ");

        for (int i = 0; i < numerosAleatorios.length; i++) {
            System.out.print (i + "\t|  ");
        }

        System.out.println ();

        System.out.print ("valor " + " |  ");

        for (int i = numerosAleatorios.length - 1; i >= posicionIntroducida; i--) {

            if (i == posicionIntroducida) {
                numerosAleatorios[i] = numeroIntroducido;
            } else {
                numerosAleatorios[i] = numerosAleatorios[i - 1];
            }
        }

        for (int i = 0; i < numerosAleatorios.length; i++) {
            System.out.print (numerosAleatorios[i] + "\t|  ");
        }
    }
}
