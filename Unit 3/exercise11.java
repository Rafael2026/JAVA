public class exercise11 {
  public static void main (String []args) {

    System.out.print("Introducir una cantidad en kiloBits: ");
    double kiloBits = Double.parseDouble(System.console().readLine());
    
    double megaBits = kiloBits / 1000;

    System.out.print("\n" + kiloBits + " kb son " + megaBits + " Mb");
  }
}