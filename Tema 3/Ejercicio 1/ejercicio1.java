public class ejercicio1 {
    public static void main (String []args) {

        double numero1;
        double numero2;

        System.out.print("Número1: ");
        numero1 = Double.parseDouble (System.console().readLine());

        System.out.print("Número2: ");
        numero2 = Double.parseDouble (System.console().readLine());

        double multiplicacion = numero1 * numero2;

        System.out.println ();
        System.out.print ("Resultado: " + multiplicacion);
    }
}
