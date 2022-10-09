public class ejercicio10 {
    public static void main (String []args) {

        String horoscopo = " ";

        System.out.print ("Introducir mes: ");
        String mes = System.console().readLine();

        System.out.print ("Introducir dia: ");
        int dia = Integer.parseInt(System.console().readLine());

        switch (mes) {

            case "enero":

                if (dia < 21) {
                    horoscopo = "Capricornio";
                } else {
                    horoscopo = "acuario";
                }

            break;

            case "febrero":

                if (dia < 20) {
                    horoscopo = "acuario";
                } else {
                    horoscopo = "piscis";
                }

            break;

            case "marzo":

                if (dia < 21) {
                    horoscopo = "piscis";
                } else {
                    horoscopo = "aries";
                }

            break;

            case "abril":

                if (dia < 21) {
                    horoscopo = "aries";
                } else {
                    horoscopo = "tauro";
                }

            break;

            case "mayo":

                if (dia < 20) {
                    horoscopo = "tauro";
                } else {
                    horoscopo = "géminis";
                }

            break;

            case "junio":

                if (dia < 22) {
                    horoscopo = "géminis";
                } else {
                    horoscopo = "cáncer";
                }

            break;

            case "julio":

                if (dia < 22) {
                    horoscopo = "cáncer";
                } else {
                    horoscopo = "Leo";
                }

            break;

            case "agosto":

                if (dia < 24) {
                    horoscopo = "leo";
                } else {
                    horoscopo = "virgo";
                }

            break;

            case "septiembre":

                if (dia < 23) {
                    horoscopo = "virgo";
                } else {
                    horoscopo = "libra";
                }

            break;

            case "octubre":

                if (dia < 23) {
                    horoscopo = "libra";
                } else {
                    horoscopo = "escorpio";
                }

            break;

            case "noviembre":

                if (dia < 23) {
                    horoscopo = "escorpio";
                } else {
                    horoscopo = "sagitario";
                }

            break;

            case "diciembre":

                if (dia < 21) {
                    horoscopo = "sagitario";
                } else {
                    horoscopo = "capricornio";
                }

            break;
        }

        System.out.println ();
        System.out.print ("Tu horoscopo es: " + horoscopo);
    }
}
