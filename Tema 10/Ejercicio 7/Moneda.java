public class Moneda {

  private int valor;
  private boolean tipo;

  // True -> cent
  // False -> euro

  private boolean posicion;
  // True -> cara
  // False -> cruz

  public Moneda () {

    int aux = (int)(Math.random () * 2);
    int[] valores = {1, 2, 5, 10, 20, 50};

    if (aux == 0) {
      this.tipo = true;
      int i = (int)(Math.random () * valores.length);
      valor = valores[i];
    }

    else {
      this.tipo = false;
      valor = (int)(Math.random () * 2) + 1;
    }

    aux = (int) (Math.random() * 2);

    if (aux == 0) {
      this.posicion = true;
    }

    else {
      this.posicion = false;
    }
  }

  public String dameValor () {

    String resultado = "" + this.valor;

    if (this.tipo == true) {
      resultado += " centimos";
    }

    else {
      resultado += " euros";
    }

    return resultado;
  }

  public String damePosicion () {

    String resultado;

    if (this.posicion == true) {
      resultado = " cara";
    }

    else {
      resultado = " cruz";
    }

    return resultado;
  }

  public String toString () {
    return this.dameValor () + " - " + this.damePosicion ();
  }
}
