import java.util.ArrayList;

public class ejercicio7 {
  public static void main (String[] args) {

    ArrayList <Moneda> monedero = new ArrayList <Moneda> ();

    Moneda aux;

    aux = new Moneda ();
    monedero.add (aux);

    for (int i = 0; i < 5; i++) {

      do {
        aux = new Moneda ();
      } while (! ((monedero.get (monedero.size () - 1).dameValor ().equals (aux.dameValor ())) ||
              (monedero.get (monedero.size () - 1).damePosicion ().equals (aux.damePosicion ()))));

      monedero.add (aux);
    }

    for (Moneda m : monedero) {
      System.out.println (m);
    }
  }
}
