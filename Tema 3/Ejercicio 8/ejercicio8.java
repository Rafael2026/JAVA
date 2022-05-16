public class ejercicio8 {
  public static void main(String []args){  
    
    double sueldo = 12;
    int horas;
    int diasLaborales = 5;
    double sueldoSemanal;
    
    System.out.print ("Horas trabajadas: ");
    horas = Integer.parseInt (System.console().readLine());
    
    double sueldoDiario;
    sueldoDiario = sueldo * horas;
    
    System.out.println ();
    System.out.println ("Sueldo diario: " + sueldoDiario);
    
    sueldoSemanal = (sueldoDiario * diasLaborales);

    System.out.println ();
    System.out.print ("Sueldo semanal: " + sueldoSemanal);

  }
}