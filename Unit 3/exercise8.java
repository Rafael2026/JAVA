public class exercise8 {
  public static void main(String []args){  
    
    double sueldo = 12;
    int diasLaborales = 5;
    
    System.out.print ("Horas trabajadas: ");
    int horas = Integer.parseInt (System.console().readLine());
    
    double sueldoDiario = (sueldo * horas);
    
    System.out.println("\nSueldo diario: " + sueldoDiario);
    
    double sueldoSemanal = (sueldoDiario * diasLaborales);

    System.out.print("\nSueldo semanal: " + sueldoSemanal);

  }
}