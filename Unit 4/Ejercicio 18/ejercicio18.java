public class ejercicio18 {
    public static void main (String []args) {

        int numero;
        int primeraCifra;

        System.out.println("Introducir un numero: ");
        numero = Integer.parseInt(System.console().readLine());

        if (numero < 10) {
            primeraCifra = numero;
            System.out.println();
            System.out.print("La primera cifra es: " + primeraCifra);
        }

        if ((numero >= 10) && (numero < 100)) {
            primeraCifra = numero / 10;
            System.out.println();
            System.out.print("La primera cifra es: " + primeraCifra);
        }

        if ((numero >= 100) && (numero < 1000)) {
            primeraCifra = numero / 100;
            System.out.println();
            System.out.print("La primera cifra es: " + primeraCifra);
        }

        if ((numero >= 1000) && (numero < 10000)) {
            primeraCifra = numero / 1000;
            System.out.println();
            System.out.print("La primera cifra es: " + primeraCifra);
        }

        if ((numero >= 10000) && (numero < 100000)) {
            primeraCifra = numero / 10000;
            System.out.println();
            System.out.print("La primera cifra es: " + primeraCifra);
        }

    }
}
