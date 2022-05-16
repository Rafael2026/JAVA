public class ejercicio2 {
    public static void main (String []args) {

        int i;

        System.out.print ("Introducir una hora: ");
        i = Integer.parseInt (System.console().readLine());

        if ((i >= 6) && (i <= 12)) {
            System.out.print ("Buenos dias");
        }

        if ((i >= 13) && (i <= 20)) {
            System.out.print ("Buenas tardes");
        }

        if (((i >= 21) && (i < 24)) || ((i >= 0) && (i <= 5))) {
            System.out.println ("Buenas noches");
        }
    }
}
