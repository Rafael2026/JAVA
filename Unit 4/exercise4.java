public class exercise4 {
  public static void main(String[] args) {

    System.out.print("Horas trabajadas: ");
    int horas = Integer.parseInt(System.console().readLine());

    /* Five days working */
    double horasSemanales = (horas * 5); /* Total hours per week */

    if (horasSemanales <= 40) {

      /*
        Daily Salary : 12
        Weekly salary: 12 * hourWeek
      */

      System.out.println("\nSueldo semanal: " + (12 * horasSemanales));

    } else {

      /*
        Daily Salary : 16
        Weekly salary: 16 * hourWeek
      */

      System.out.println("\nSueldo semanal: " + (16 * horasSemanales));
    }
  }
}