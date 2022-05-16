public class ejercicio14 {
    public static void main (String []args) {

        int numero;

        System.out.print ("Introducir un numero: ");
        numero = Integer.parseInt (System.console().readLine());

        boolean par = (numero%2 == 0);
        boolean divisibleEntreCinco = (numero%5 == 0);

        if (par) {
            System.out.println ();
            System.out.print ("El numero " + numero + " es par");
            System.out.println ();
        } else {
            System.out.println ();
            System.out.print ("El numero " + numero + " es impar");
            System.out.println ();
        }

        if (divisibleEntreCinco) {
            System.out.println ();
            System.out.print ("El numero " + numero + " es divisible entre cinco");
        } else {
            System.out.println ();
            System.out.print ("El numero " + numero + " no es divisible entre cinco");
        }
    }
}
