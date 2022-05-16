public class ejercicio3 {
    public static void main (String []args) {

        String dia;

        System.out.print ("Introducir un numero: ");
        int diaSemana = Integer.parseInt (System.console().readLine());

        switch (diaSemana) {

            case 1:
                dia = "lunes";
            break;

            case 2:
                dia = "martes";
            break;

            case 3:
                dia = "miercoles";
            break;

            case 4:
                dia = "jueves";
            break;

            case 5:
                dia = "viernes";
            break;

            case 6:
                dia = "sabado";
            break;

            case 7:
                dia = "domingo";
            break;
        }

        System.out.print (dia);
    }
}
