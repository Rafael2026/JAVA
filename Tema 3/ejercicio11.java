public class ejercicio11 {
  public static void main (String []args) {

    System.out.print("Introducir una cantidad en kiloBits: ");
    double kiloBits = Double.parseDouble(System.console().readLine());

    System.out.println();
    
    double megaBits = kiloBits / 1000;

    System.out.print(kiloBits + " kb son " + megaBits + " Mb");
  }
}
