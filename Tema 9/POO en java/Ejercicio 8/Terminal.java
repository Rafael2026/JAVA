class Terminal {

  private String numero;
  private int tiempoLlamada;

  Terminal (String numero) {
    this.numero = numero;
    this.tiempoLlamada = 0;
  }

  public String getNumero () {
    return numero;
  }

  public void setNumero (String numero) {
    this.numero = numero;
  }

  public int getTiempoLlamada () {
    return numero;
  }

  public void setTiempoLlamada (int tiempoLlamada) {
    this.tiempoLlamada = tiempoLlamada;
  }

  @Override
  public String toString() {
    return "Numero: " + numero + "\n" + this.tiempoLlamada + " segundos de conversación\n";
  }

  public void llama (Terminal t, int segundosDeLlamada) {
    this.tiempoLlamada += segundosDeLlamada;
    t.tiempoLlamada += segundosDeLlamada;
  }
}
