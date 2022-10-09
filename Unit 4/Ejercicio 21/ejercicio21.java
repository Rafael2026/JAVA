public class ejercicio21 {
    public static void main (String []args) {

        double nota1;
        double nota2;
        double nota;

        System.out.print ("Introducir la primera nota de programacion: ");
        nota1 = Double.parseDouble (System.console().readLine());

        System.out.print ("Introducir la segunda nota de programacion: ");
        nota2 = Double.parseDouble (System.console().readLine());

        double media = (nota1 + nota2) / 2;

        System.out.println ();

        if (media >= 5) {

            System.out.print ("Tu nota final de programacion es: " + media);

        } else {

            System.out.print ("Introducir nota de la recuperacion: ");
            nota = Double.parseDouble (System.console().readLine());

            System.out.println ();

            if (nota >= 5) {

                System.out.println ("Apto");
                nota = 5;
                System.out.print ("Nota final de programacion es: " + nota);

            } else {
                System.out.println ("No apto");
                System.out.print ("Nota final de programacion es: " + media);
            }
        }
    }
}