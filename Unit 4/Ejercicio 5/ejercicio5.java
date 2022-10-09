public class ejercicio5 {
    public static void main (String []args) {

        double a;
        double b;
        double resultado;

        System.out.print ("Introducir a: ");
        a = Double.parseDouble (System.console().readLine());

        System.out.print ("Introducir b: ");
        b = Double.parseDouble (System.console().readLine());

        if (a != 0) {

            resultado = (-b) / a;

            System.out.println ();
            System.out.print ("resultado " + "= " + resultado);

        } else {
            System.out.println ();
            System.out.print ("No tiene solucion");
        }
    }
}