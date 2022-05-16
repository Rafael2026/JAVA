public class cuentas {
  public static void main(String []args){
    
    int sueldo = 12;
    int horas = 8;
    int i;
    int diasLaborales = 5;
    
    i = Integer.parseInt (System.console().readLine());
    
    while (i > horas) {
      
      System.out.println ();
      i = Integer.parseInt (System.console().readLine());
      
    }
    
    double sueldoDiario;
    sueldoDiario = sueldo * i;
    
    System.out.println (sueldoDiario);
    
    double sueldoSemanal;
    sueldoSemanal = (sueldoDiario * diasLaborales);
    System.out.println (sueldoSemanal);
  }
}
