public class ejercicio5 {
  public static void main (String []args) {

    // Colores en Java
    String rojo = "\033[31m";
    String azul = "\033[34m";
    String amarillo = "\033[33m";
    String naranja = "\33[38;5;202m";
    String violeta = "\033[35m";
    String verde = "\033[32m";

    // Horarios de clase 2020/201
    System.out.println("------------------------------------------");
    System.out.println("|Lunes\t|Martes\t|Miercoles|Jueves|Viernes|");
    System.out.println("------------------------------------------");
    System.out.println(rojo + "|PRO    |" + naranja + "SINF\t|" + rojo + "PRO      |" + rojo + "PRO   |" + naranja + "SINF   |");
    System.out.println("------------------------------------------");
    System.out.println(rojo + "|PRO    |" + naranja + "SINF\t|" + rojo + "PRO      |" + rojo + "PRO   |" + naranja + "SINF   |");
    System.out.println("------------------------------------------");
    System.out.println(azul + "|BBDD   |" + naranja + "SINF\t|" + azul + "BBDD     |" + rojo + "PRO   |" + naranja + "SINF   |");
    System.out.println("------------------------------------------");
    System.out.println(azul + "|BBDD   " + "|" + rojo + "PRO    " + "|" + violeta + "ED\t " + "|" + azul + "BBDD  " + "|" + verde + "FOL     " + "|");
    System.out.println("------------------------------------------");
    System.out.println (amarillo + "|LM     |" + amarillo + "LM     |" + violeta + "ED\t |" + azul + "BBDD  |" + verde + "FOL     |");
    System.out.println ("------------------------------------------");
    System.out.println (amarillo + "|LM     |" + amarillo + "LM     |" + violeta + "ED\t " + "|" + azul + "BBDD  |" + verde + "FOL     |");
    System.out.println ("------------------------------------------");

    // PRO -> programación (Rojo)
    // BBDD -> base de datos (Azul)
    // LM -> lengauje de marcas (Amarillo)
    // SINF -> sistemas informátios (Naranja)
    // ED -> Entorno de desarrollo (Violeta)
    // FOL (Verde)
  }
}