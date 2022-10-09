import java.lang.Math;

public class ejercicio9 {
    public static void main (String []args) {

        double a;
        double b;
        double c;
        double resultado1;
        double resultado2;

        System.out.print ("Introducir a: ");
        a = Double.parseDouble (System.console().readLine());

        System.out.print ("Introducir b: ");
        b = Double.parseDouble (System.console().readLine());

        System.out.print ("Introducir c: ");
        c = Double.parseDouble (System.console().readLine());

        if (b > c) {

            resultado1 = ((-b) + Math.sqrt ((b * b) + (4 * a * c))) / (2 * a);
            resultado2 = ((-b) + Math.sqrt ((b * b) - (4 * a * c))) / (2 * a);

            System.out.println ();
            System.out.print ("Resultado1 = " + resultado1);

            System.out.println ();
            System.out.print ("Resultado2 = " + resultado2);

        }
    }
}