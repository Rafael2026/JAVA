public class exercise2 {
  public static void main(String[] args) {

    System.out.print("Introducir una hora: ");
    int i = Integer.parseInt(System.console().readLine());

    if ((i >= 6) && (i <= 12)) {
      System.out.println("Buenos dias");
    } else if ((i >= 13) && (i <= 20)) {
      System.out.println("Buenas tardes");
    } else if (((i >= 21) && (i < 24)) || ((i >= 0) && (i <= 5))) {
      System.out.println("Buenas noches");
    }
  }
}