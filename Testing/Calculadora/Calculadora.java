import java.io.FileNotFoundException;

public class Calculadora {

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

    if (divisor == 0) {
      throw new Exception("Error");
    }

    return dividendo/divisor;
  }

  // Metodo dividir con decimales
  public double dividir(double dividendo, double divisor) throws Exception {

    if (divisor == 0) {
      throw new Exception("Error");
    }

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
}