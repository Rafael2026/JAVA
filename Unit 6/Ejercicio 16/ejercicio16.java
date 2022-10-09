public class ejercicio16 {
  public static void main (String []args) {

    int mostrarFiguras= 3;
    String figura[] = new String [mostrarFiguras];
    String figura1 = "corazon";
    String figura2 = "diamante";
    String figura3 = "herradura";
    String figura4 = "campana";
    String figura5 = "limon";
    int opcion;

    for (int i = 0; i < mostrarFiguras; i++) {

      opcion = (int)(Math.random () * 5);

      switch (opcion) {

        case 0:
          figura[i] = figura1;
          System.out.print (figura[i] + ", ");
        break;

        case 1:
          figura[i] = figura2;
          System.out.print (figura[i] + ", ");
        break;

        case 2:
          figura[i] = figura3;
          System.out.print (figura[i] + ", ");
        break;

        case 3:
          figura[i] = figura4;
          System.out.print (figura[i] + ", ");
        break;

        case 4:
          figura[i] = figura5;
          System.out.print (figura[i] + ", ");
        break;
      }

      if (i == (mostrarFiguras - 1)) {

        if ((figura[i - 2] == figura[i - 1]) && (figura[i - 2] == figura[i])) {
          System.out.println ();
          System.out.println ();
          System.out.print ("Enhorabuena, ha ganado 10 monedas ");
        }

        if (((figura[i - 2] == figura[i - 1]) && (figura[i - 2] != figura[i])) || ((figura[i - 2] != figura[i - 1]) && (figura[i - 2] == figura[i]))) {
          System.out.println ();
          System.out.println ();
          System.out.print ("Bien, ha recuperado su moneda ");
        }

        if ((figura[i - 2] != figura[i - 1]) && (figura[i - 1] != figura[i]) && (figura[i - 2] != figura[i])) {
          System.out.println ();
          System.out.println ();
          System.out.print ("Lo siento, ha perdido ");
        }
      }
    }
  }
}
