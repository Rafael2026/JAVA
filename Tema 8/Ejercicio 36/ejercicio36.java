public class ejercicio36 {

  public static void main (String[] args) {

    int[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    int[] numerosPrimosDevueltos = devuelveNumerosPrimos (numeros);

    for (int i = 0; i < numerosPrimosDevueltos.length; i++) {

      if (numerosPrimosDevueltos[i] != 0) {
        System.out.print (numerosPrimosDevueltos[i] + ", ");
      }
    }
  }

  public static int[] devuelveNumerosPrimos (int[] numeros) {

    int j = 0;
    int[] numerosPrimos = new int [numeros.length];

    for (int i = 0; i < numeros.length; i++) {

      if ((numeros[i] == 2) || (numeros[i] == 3)) {

        if ((numeros[i]%2 != 0) || (numeros[i]%3 != 0)) {
          numerosPrimos[j] = numeros[i];
          j++;
        }
      }

      else if ((numeros[i] == 1)) {
        numerosPrimos[j] = numeros[i];
        j++;
      }

      else if (numeros[i] > 3) {

        if ((numeros[i]%2 != 0) && (numeros[i]%3 != 0)) {
          numerosPrimos[j] = numeros[i];
          j++;
        }
      }
    }

    return numerosPrimos;
  }
}
