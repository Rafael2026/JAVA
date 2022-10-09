import java.util.Scanner;

public class ejercicio11 {
    public static void main (String []args) {

        int longitudArray = 10;
        int cantidadNumerosPrimos = 0;
        int cantidadNumerosNoPrimos = 0;
        int secuenciaNumeros[] = new int [longitudArray];
        int numerosPrimos[] = new int [longitudArray];
        int numerosNoPrimos[] = new int [longitudArray];
        int p = 0;
        int n = 0;
        boolean esPrimo;

        Scanner scanner = new Scanner (System.in);

        System.out.println ("Introducir un numero: ");

        for (int i = 0; i < secuenciaNumeros.length; i++) {

            secuenciaNumeros[i] = scanner.nextInt ();

            if (secuenciaNumeros[i] <= 0) {

                do {
                    System.out.println ();
                    System.out.println ("Introducir un numero: ");
                    secuenciaNumeros[i] = scanner.nextInt ();
                } while (secuenciaNumeros[i] <= 0);

            } else {

            }

            if (secuenciaNumeros[i] > 0 && secuenciaNumeros[i] <= 3) {

                esPrimo = (((secuenciaNumeros[i]%1) == 0) || ((secuenciaNumeros[i]%2) == 0) || ((secuenciaNumeros[i]%3) == 0));

                if (esPrimo) {
                    numerosPrimos[p] = secuenciaNumeros[i];
                    p++;
                    cantidadNumerosPrimos++;
                }

            } else if (secuenciaNumeros[i] > 3) {

                esPrimo = (((secuenciaNumeros[i]%2) > 0) && ((secuenciaNumeros[i]%3) > 0));

                if (esPrimo) {
                    numerosPrimos[p] = secuenciaNumeros[i];
                    p++;
                    cantidadNumerosPrimos++;
                } else {
                    numerosNoPrimos[n] = secuenciaNumeros[i];
                    n++;
                    cantidadNumerosNoPrimos++;
                }
            }
        }

        System.out.println ();
        System.out.println ("Array original: ");

        for (int i = 0; i < secuenciaNumeros.length; i++) {
            System.out.print (i + " | ");
        }

        System.out.println ();

        for (int i = 0; i < secuenciaNumeros.length; i++) {
            System.out.print (secuenciaNumeros[i] + " | ");
        }

        System.out.println ();
        System.out.println ();

        System.out.println ("Array final: ");

        for (int i = 0; i < secuenciaNumeros.length; i++) {
            System.out.print (i + " | ");
        }

        System.out.println ();

        p = 0;
        n = 0;

        for (p = 0; p < cantidadNumerosPrimos; p++) {
            System.out.print (numerosPrimos[p] + " | ");
        }

        for (n = 0; n < cantidadNumerosNoPrimos; n++) {
            System.out.print (numerosNoPrimos[n] + " | ");
        }
    }
}
