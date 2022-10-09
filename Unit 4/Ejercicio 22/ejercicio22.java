public class ejercicio22 {
    public static void main(String []args) {

        System.out.print("Introducir un dia de la semana: ");
        String dia = System.console().readLine();

        int diaNumerico = 1;
        int ultimoDiaLaboral = 5;

        switch (dia) {

            case "lunes":
                diaNumerico = 1;
            break;

            case "martes":
                diaNumerico = 2;
            break;

            case "miercoles":
                diaNumerico = 3;
            break;

            case "jueves":
                diaNumerico = 4;
            break;

            case "viernes":
                diaNumerico = 5;
            break;

            default:
                System.out.print("El dia de la semana no es correcto.");
        }

        System.out.println ();

        System.out.print("Hora: ");
        int horas = Integer.parseInt(System.console().readLine());

        System.out.println ();

        System.out.print("Minutos: ");
        int minutos = Integer.parseInt(System.console().readLine());

        System.out.println ();

        System.out.print ("Faltan " + (ultimoDiaLaboral - diaNumerico) + " dia, " + (14 - horas) + " horas, " + (60 - minutos) + " minutos para el fin de semana");
    }
}