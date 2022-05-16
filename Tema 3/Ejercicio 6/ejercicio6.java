public class ejercicio6 {
    public static void main (String []args) {

        double base;
        double altura;

        System.out.print ("Introducir la base: ");
        base = Double.parseDouble (System.console().readLine());

        System.out.print ("Introducir la altura: ");
        altura = Double.parseDouble (System.console().readLine());

        System.out.println ();
        double areaTriangulo = (base * altura)/2;

        System.out.print ("Resultado: " + areaTriangulo);
    }
}
