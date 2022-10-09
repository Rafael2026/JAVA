import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {

        int ocupa;
        int mesas[] = new int[10];
        int i;
        int suma;
        boolean mesaVacia = false;
        int numeroDeMesa = 0;

        Scanner scanner = new Scanner(System.in);

        for (i = 0; i <= mesas.length - 1; i++) {
            mesas[i] = (int)(Math.random() * 5);
        }

        System.out.print("| Numeo de mesa | ");

        for (i = 1; i < 11; i++) {
            System.out.print(i + " | ");
        }

        System.out.println();
        System.out.print("| Ocupacion \t | ");

        for (i = 0; i < mesas.length; i++) {
            System.out.print(mesas[i] + " | ");
        }

        i = 0;

        System.out.println();
        System.out.println();

        do {

            do {

                System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
                ocupa = scanner.nextInt(); // Leemos ocupa

                if (ocupa > 4) {

                    System.out.println ("Lo siento, no admitimos grupos de " + ocupa + ", haga grupos de 4 personas como máximo e intente de nuevo ");
                    System.out.println ();

                    System.out.print("| Numeo de mesa | ");

                    for (i = 1; i < 11; i++) {
                        System.out.print(i + " | ");
                    }

                    System.out.println();
                    System.out.print("| Ocupacion \t | ");

                    for (i = 0; i < mesas.length; i++) {
                        System.out.print(mesas[i] + " | ");
                    }

                    System.out.println ();
                    System.out.println ();
                }

            } while (ocupa > 4);

            if (ocupa == -1) {
                System.out.print("Gracias. Hasta Pronto."); // Somos libres
            } else {

                for (i = numeroDeMesa; i < mesas.length && !mesaVacia; i++) {

                    if (mesas[i] == 0) {
                        mesaVacia = true;
                        numeroDeMesa = i;
                    }
                }

                mesaVacia = (mesas[numeroDeMesa] == 0);

                if (mesaVacia) {

                    mesas[numeroDeMesa] = ocupa;
                    System.out.print("Por favor, siéntense en la mesa numero " + (numeroDeMesa + 1));
                    System.out.println();
                    System.out.println();
                    System.out.print("| Numeo de mesa | ");

                    for (i = 1; i < 11; i++) {
                        System.out.print(i + " | ");
                    }

                    System.out.println();
                    System.out.print("| Ocupacion \t | ");

                    for (i = 0; i < mesas.length; i++) {
                        System.out.print(mesas[i] + " | ");
                    }

                    System.out.println ();
                    System.out.println();

                } else {

                    i = 0;

                    do {

                        suma = mesas[i] + ocupa;
                        int aforoTotal = 4;

                        if (suma > aforoTotal) {
                            i++;
                        }

                    } while ((suma > 4) && (i < mesas.length));

                    if (suma > 4) {

                        System.out.print ("Lo siento, en estos momentos no queda sitio. ");
                        System.out.println ();
                        System.out.println ();
                        System.out.print("| Numeo de mesa | ");

                        for (i = 1; i < 11; i++) {
                            System.out.print(i + " | ");
                        }

                        System.out.println();
                        System.out.print("| Ocupacion \t | ");

                        for (i = 0; i < mesas.length; i++) {
                            System.out.print(mesas[i] + " | ");
                        }

                        System.out.println ();
                        System.out.println ();

                    } else {

                        numeroDeMesa = i;
                        mesas[numeroDeMesa] = suma;

                        System.out.println ("Tendrán que compartir mesa. Por favor, siéntense en la mesa número " + (numeroDeMesa + 1));
                        System.out.println ();

                        System.out.print("| Numeo de mesa | ");

                        for (i = 1; i < 11; i++) {
                            System.out.print(i + " | ");
                        }

                        System.out.println();
                        System.out.print("| Ocupacion \t | ");

                        for (i = 0; i < mesas.length; i++) {
                            System.out.print(mesas[i] + " | ");
                        }

                        System.out.println ();
                        System.out.println ();

                    }
                }
            }

            mesaVacia = false;

        } while (ocupa != -1);

        System.out.println ();
    }
}