public class ejercicio7 {
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

        System.out.println ();
        System.out.print ("Tu nota final es: " + notaFinal);
    }
}