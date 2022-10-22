public class exercise22 {
  public static void main(String[] args) {

    System.out.print("Introducir un dia de la semana: ");
    String dia = System.console().readLine();

    int diaNumerico = 1;
    int ultimoDiaLaboral = 5;

    switch (dia) {

      case "lunes":
        diaNumerico = 1;
      break;

      case "martes":
        diaNumerico = 2;
      break;

      case "miercoles":
        diaNumerico = 3;
      break;

      case "jueves":
        diaNumerico = 4;
      break;

      case "viernes":
        diaNumerico = 5;
      break;

      default:
        System.out.print("El dia de la semana no es correcto.");
    }

    System.out.print("\nHora: ");
    int horas = Integer.parseInt(System.console().readLine());

    System.out.print("\nMinutos: ");
    int minutos = Integer.parseInt(System.console().readLine());

    System.out.print("\nFaltan " + (ultimoDiaLaboral - diaNumerico) + " dia, " + (14 - horas) + " horas, " + (60 - minutos) + " minutos para el fin de semana");
  }
}