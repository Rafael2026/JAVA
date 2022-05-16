public class ejercicio13 {
    public static void main (String []args) {

        System.out.print ("Introducir a: ");
        int a = Integer.parseInt (System.console().readLine());

        System.out.print ("Introducir b: ");
        int b = Integer.parseInt (System.console().readLine());

        System.out.print ("Introducir c: ");
        int c = Integer.parseInt (System.console().readLine());

        if ((a >= b) && (b >= c)) {
            System.out.println ();
            System.out.print (c + " < " + b + " < " + a);
        }

        if ((a >= c) && (c >= b)) {
            System.out.println ();
            System.out.print (b + " < " + c + " < " + a);
        }

        if ((b >= a) && (a >= c)) {
            System.out.println ();
            System.out.print (c + " < " + a + " < " + b);
        }

        if ((b >= c) && (c >= a)) {
            System.out.println ();
            System.out.print (a + " < " + c + " < " + b);
        }

        if ((c >= a) && (a >= b)) {
            System.out.println ();
            System.out.print (b + " < " + a + " < " + b);
        }

        if ((c >= b) && (b >= a)) {
            System.out.println ();
            System.out.print (a + " < " + b + " < " + c);
        }
    }
}
