public class ejercicio9 {
  public static void main (String[] args) {

    double pi = 3.14159265359;
        
    System.out.print("Introducir el radio de la base del cono: ");
    double radio = Double.parseDouble(System.console().readLine());

    System.out.print("\nIntroducir la altura del cono: ");
    double altura = Double.parseDouble(System.console().readLine());

    double volumen = (pi * radio * radio * altura) / 3;

    System.out.print("\nResultado: " + volumen);
  }
}
