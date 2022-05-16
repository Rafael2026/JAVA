import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        int filas = 4;
        int columnas = 5;
        int numerosIntroducidos[][] = new int [filas][columnas];
        int x;
        int y;
        int sumaTotal;

        Scanner scanner = new Scanner (System.in);

        System.out.println ("Introducir numeros en el array bidimensional: ");

        for (x = 0; x < filas; x++) {

            for (y = 0; y < columnas; y++) {
                numerosIntroducidos[x][y] = scanner.nextInt ();
            }
        }

        System.out.println ();

        y = 0;
        x = 0;

        sumaTotal = numerosIntroducidos[x][y] + numerosIntroducidos[x][y + 1] + numerosIntroducidos[x][y + 2] + numerosIntroducidos[x][y + 3] + numerosIntroducidos[x][y + 4];

        System.out.println (numerosIntroducidos[x][y] + "  | " + numerosIntroducidos[x][y + 1] + "  | " + numerosIntroducidos[x][y + 2] + "  | " + numerosIntroducidos[x][y + 3] + "  | " + numerosIntroducidos[x][y + 4] + "  | " + sumaTotal + " |");

        System.out.println ("-----------------------------");

        x++;

        sumaTotal = numerosIntroducidos[x][y] + numerosIntroducidos[x][y + 1] + numerosIntroducidos[x][y + 2] + numerosIntroducidos[x][y + 3] + numerosIntroducidos[x][y + 4];

        System.out.println (numerosIntroducidos[x][y] + "  | " + numerosIntroducidos[x][y + 1] + "  | " + numerosIntroducidos[x][y + 2] + "  | " + numerosIntroducidos[x][y + 3] + "  | " + numerosIntroducidos[x][y + 4] + "  | " + sumaTotal + " |");

        System.out.println ("-----------------------------");

        x++;

        sumaTotal = numerosIntroducidos[x][y] + numerosIntroducidos[x][y + 1] + numerosIntroducidos[x][y + 2] + numerosIntroducidos[x][y + 3] + numerosIntroducidos[x][y + 4];

        System.out.println (numerosIntroducidos[x][y] + " | " + numerosIntroducidos[x][y + 1] + " | " + numerosIntroducidos[x][y + 2] + " | " + numerosIntroducidos[x][y + 3] + " | " + numerosIntroducidos[x][y + 4] + " | " + sumaTotal + " |");

        System.out.println ("-----------------------------");

        x++;

        sumaTotal = numerosIntroducidos[x][y] + numerosIntroducidos[x][y + 1] + numerosIntroducidos[x][y + 2] + numerosIntroducidos[x][y + 3] + numerosIntroducidos[x][y + 4];

        System.out.println (numerosIntroducidos[x][y] + " | " + numerosIntroducidos[x][y + 1] + " | " + numerosIntroducidos[x][y + 2] + " | " + numerosIntroducidos[x][y + 3] + " | " + numerosIntroducidos[x][y + 4] + " | " + sumaTotal + " |");

        System.out.println ("-----------------------------");

        y = 0;
        x = 0;

        sumaTotal = numerosIntroducidos[x][y] + numerosIntroducidos[x + 1][y] + numerosIntroducidos[x + 2][y] + numerosIntroducidos[x + 3][y];
        System.out.print (sumaTotal + " | ");

        y++;

        sumaTotal = numerosIntroducidos[x][y] + numerosIntroducidos[x + 1][y] + numerosIntroducidos[x + 2][y] + numerosIntroducidos[x + 3][y];
        System.out.print (sumaTotal + " | ");

        y++;

        sumaTotal = numerosIntroducidos[x][y] + numerosIntroducidos[x + 1][y] + numerosIntroducidos[x + 2][y] + numerosIntroducidos[x + 3][y];
        System.out.print (sumaTotal + " | ");

        y++;

        sumaTotal = numerosIntroducidos[x][y] + numerosIntroducidos[x + 1][y] + numerosIntroducidos[x + 2][y] + numerosIntroducidos[x + 3][y];
        System.out.print (sumaTotal + " | ");

        y++;

        sumaTotal = numerosIntroducidos[x][y] + numerosIntroducidos[x + 1][y] + numerosIntroducidos[x + 2][y] + numerosIntroducidos[x + 3][y];
        System.out.print (sumaTotal + " |");

        System.out.print ("Tot |");
    }
}
