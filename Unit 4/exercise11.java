public class exercise11 {
  public static void main(String[] args) {

    System.out.print("Introducir hora: ");
    int hora = Integer.parseInt(System.console().readLine());

    System.out.print("Introducir minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());

    if (hora == 23 && minutos == 60) {
      System.out.println("\nYa es la hora ");
    } else {
      System.out.println("\nFaltan " + (23 - hora) + " hora y " + (60 - minutos) + " minutos");
    }
  }
}