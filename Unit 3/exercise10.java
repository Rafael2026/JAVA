public class exercise10 {
  public static void main (String[] args) {

    System.out.print("Introducir una cantidad en megaBits: ");
    double megaBits = Double.parseDouble (System.console().readLine());
    
    double kiloBits = megaBits * 1000;

    System.out.print("\n" + megaBits + " Mb son " + kiloBits + " kb");
  }
}