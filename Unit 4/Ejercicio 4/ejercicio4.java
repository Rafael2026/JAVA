public class ejercicio4 {
    public static void main (String []args) {

        double sueldo;
        int horas;
        int diasLaborales = 5;

        System.out.print ("Horas trabajadas: ");
        horas = Integer.parseInt (System.console().readLine());

        double horasSemanales;
        horasSemanales = (horas * diasLaborales);

        if (horasSemanales <= 40) {

            sueldo = 12;

            double sueldoSemanal = (sueldo * horasSemanales);

            System.out.println ();
            System.out.println ("Sueldo semanal: " + sueldoSemanal);

        } else {

            sueldo = 16;

            double sueldoSemanal = (sueldo * horasSemanales);

            System.out.println ();
            System.out.println ("Sueldo semanal: " + sueldoSemanal);

        }
    }
}
