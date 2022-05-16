public class ejercicio10 {
    public static void main (String []args) {

        double megaBits;

        System.out.print("Introducir una cantidad en megaBits: ");
        megaBits = Double.parseDouble (System.console().readLine());

        System.out.println ();
        double kiloBits = megaBits * 1000;

        System.out.print (megaBits + " Mb son " + kiloBits + " kb");
    }
}
