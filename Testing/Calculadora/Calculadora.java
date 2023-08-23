public class Calculadora {

  String message = "You cannot divide by zero";

  // Metodo sumar
  public int sumar(int sumando1, int sumando2) {
    return sumando1 + sumando2;
  }

  // Metodo restar
  public int restar(int minuendo, int sustraendo) {
    return minuendo - sustraendo;
  }
  
  // Metodo multiplicar
  public int multiplicar(int factor1, int factor2) {
    return factor1 * factor2;
  }

  // Metodo dividir
  public int dividir(int dividendo, int divisor) throws Exception {

    assertDivisor(divisor*1.0);

    return dividendo/divisor;
  }

  // Metodo dividir con decimales
  public double dividir(double dividendo, double divisor) throws Exception {

    assertDivisor(divisor);

    return dividendo/divisor;
  }

  // Metodo potencia
  public int potencia(int base, int exponente) {

    int potenciaResultado = 1;

    for (int i = 0; i < exponente; i++) {
      potenciaResultado *= base;
    }

    return potenciaResultado;
  }

  public void assertDivisor(double divisor) throws Exception {

    if (divisor == 0) {
      throw new Exception(message);
      //Logger.error(message, severity.low);
    }
  }
}