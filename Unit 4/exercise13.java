public class exercise13 {
  public static void main(String[] args) {

    System.out.print("Introducir a: ");
    int a = Integer.parseInt(System.console().readLine());

    System.out.print("Introducir b: ");
    int b = Integer.parseInt(System.console().readLine());

    System.out.print("Introducir c: ");
    int c = Integer.parseInt(System.console().readLine());

    if ((a >= b) && (b >= c)) {
      System.out.print("\n" + c + " < " + b + " < " + a);
    } else if ((a >= c) && (c >= b)) {
      System.out.print("\n" + b + " < " + c + " < " + a);
    } else if ((b >= a) && (a >= c)) {
      System.out.print("\n" + c + " < " + a + " < " + b);
    } else if ((b >= c) && (c >= a)) {
      System.out.print("\n" + a + " < " + c + " < " + b);
    } else if ((c >= a) && (a >= b)) {
      System.out.print("\n" + b + " < " + a + " < " + b);
    } else if ((c >= b) && (b >= a)) {
      System.out.print("\n" + a + " < " + b + " < " + c);
    }
  }
}
