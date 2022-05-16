public class ejercicio17 {
    public static void main (String []args) {

        int numero;

        System.out.println ("Introducir un numero: ");
        numero = Integer.parseInt (System.console().readLine());

        System.out.println ();
        System.out.print ("La ultima cifra es: " + (numero%10));

    }
}
