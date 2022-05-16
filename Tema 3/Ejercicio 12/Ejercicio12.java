public class ejercicio12 {
  public static void main (String []args) {
    
    double nota1;
    double media;
    
    System.out.print ("Introducir nota del examen1: ");
    nota1 = Double.parseDouble (System.console().readLine());

    System.out.println ();
    
    System.out.print ("Introducir media del trimestre: ");
    media = Double.parseDouble (System.console().readLine());

    System.out.println ();
    
    double nota2;
    nota2 = (media - (nota1 * 0.4)) / 0.6;
    
    System.out.print ("Si quieres que tu media sea un " + media + ", debes sacar en el segundo examen un " + nota2);

  }
}
