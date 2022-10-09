public class ejercicio8 {
    public static void main (String []args) {

        double nota1;
        double nota2;
        double nota3;
        double notaFinal;

        System.out.print ("Introducir la primera nota: ");
        nota1 = Double.parseDouble (System.console().readLine());

        System.out.print ("Introducir la segunda nota: ");
        nota2 = Double.parseDouble (System.console().readLine());

        System.out.print ("Introducir la tercera nota: ");
        nota3 = Double.parseDouble (System.console().readLine());

        notaFinal = (nota1 + nota2 + nota3) / 3;

        if ((notaFinal >= 0) && (notaFinal < 5)) {
            System.out.println ();
            System.out.print ("Tu nota final es: " + notaFinal);
            System.out.println ();
            System.out.print ("Suspenso");
        }

        if ((notaFinal >= 5) && (notaFinal < 6)) {
            System.out.println ();
            System.out.print ("Tu nota final es: " + notaFinal);
            System.out.println ();
            System.out.print ("Suficiente");
        }

        if ((notaFinal >= 6) && (notaFinal < 7)) {
            System.out.println ();
            System.out.print ("Tu nota final es: " + notaFinal);
            System.out.println ();
            System.out.print ("Bien");
        }

        if ((notaFinal >= 7) && (notaFinal < 9)) {
            System.out.println ();
            System.out.print ("Tu nota final es: " + notaFinal);
            System.out.println ();
            System.out.print ("Notable");
        }

        if ((notaFinal >= 9) && (notaFinal <= 10)) {
            System.out.println ();
            System.out.print ("Tu nota final es: " + notaFinal);
            System.out.println ();
            System.out.print ("Sobresaliente");
        }
    }
}