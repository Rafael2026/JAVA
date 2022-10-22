public class work {
  public static void main(String[] args){
    
    int sueldo = 12;
    int horas = 8;
    int i;
    
    do {
      System.out.println();
      i = Integer.parseInt(System.console().readLine());
    } while (i > horas);
    
    System.out.println(sueldo * i);
    
    double sueldoSemanal = (sueldo * i * 5);
    System.out.println(sueldoSemanal);
  }
}