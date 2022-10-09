import java.lang.Math;

public class ejercicio6 {
    public static void main (String []args) {

        double g = 9.81;
        double h;

        System.out.print ("Introducir altura: ");
        h = Double.parseDouble (System.console().readLine());

        double t = Math.sqrt ((2 * h) / g);

        System.out.println ();
        System.out.print ("Tiempo: " + t);
    }
}
