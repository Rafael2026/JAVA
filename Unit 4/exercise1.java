public class exercise1 {
  public static void main (String []args) {

    System.out.print("Introducir dia de la semana: ");
    String diaSemana = System.console().readLine();

    switch (diaSemana) {

      case "lunes":
        System.out.println("Programacion");
      break;

      case "martes":
        System.out.println("Sistemas Informaticos");
      break;

      case "miercoles":
        System.out.println("Programacion");
      break;

      case "jueves":
        System.out.println("Programacion");
      break;

      case "viernes":
        System.out.println("Sistemas Informaticos");
      break;

      default:
      System.out.println("No hay clase");
    }
  }
}