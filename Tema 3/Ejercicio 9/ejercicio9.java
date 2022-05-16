public class ejercicio9 {
    public static void main (String []args) {

        double radio;
        double altura;
        double pi = 3.14159265359;
        
        System.out.print ("Introducir el radio de la base del cono: ");
        radio = Double.parseDouble (System.console().readLine());

        System.out.println();

        System.out.print ("Introducir la altura del cono: ");
        altura = Double.parseDouble (System.console().readLine());

        System.out.println();

        double h = altura;

        double volumen = (pi * radio * radio * h) / 3;

        System.out.print("Resultado: " + volumen);
    }
}
