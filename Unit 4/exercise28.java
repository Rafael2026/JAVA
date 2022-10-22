public class exercise28 {
  public static void main(String[] args) {

    System.out.print("Turno del jugador 1: ");
    String jugada1 = System.console().readLine();

    System.out.print("Turno del jugador 2: ");
    String jugada2 = System.console().readLine();

    if (jugada1.equals(jugada2)) {
      System.out.print("\nEmpate");
    } else {

      int ganador = 2;

      switch (jugada1) {

        case "piedra":
          
          if (jugada2.equals("tijera")) {
            ganador = 1;
          }
          
        break;

        case "papel":

          if (jugada2.equals("piedra")) {
            ganador = 1;
          }

        break;

        case "tijera":

          if (jugada2.equals("papel")) {
            ganador = 1;
          }

        break;
      }

      System.out.print("\nGana el jugador " + ganador);
    }
  }
}