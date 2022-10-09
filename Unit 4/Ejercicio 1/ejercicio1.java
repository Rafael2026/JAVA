public class ejercicio1 {
  public static void main (String []args) {


    System.out.print ("Introducir dia de la semana: ");
    String diaSemana = System.console().readLine();

    switch (diaSemana) {

      case "lunes":
        System.out.print ("Programacion");
      break;

      case "martes":
        System.out.print ("Sistemas Informaticos");
      break;

      case "miercoles":
        System.out.print ("Programacion");
      break;

      case "jueves":
        System.out.print ("Programacion");
      break;

      case "viernes":
        System.out.print ("Sistemas Informaticos");
      break;

      default:
      System.out.println ("No hay clase");
    }
  }
}