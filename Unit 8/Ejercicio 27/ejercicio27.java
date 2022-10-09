public class ejercicio27 {
  public static void main (String[] args) {

    int[] arrayNumeros = {0, 1, 2, 3, 4, 5};

    girarArrayHaciaDerecha (arrayNumeros);

    // Mostrar el array por pantalla
    for (int i = 0; i < arrayNumeros.length; i++) {
      System.out.print (arrayNumeros[i] + " | ");
    }
  }

  public static void girarArrayHaciaDerecha (int[] arrayNumeros) {

    // Guardamos el 5 en una vaiable entera llamada aux
    int aux = arrayNumeros [arrayNumeros.length - 1];

    // ¿Qué? -> Desplazar cada numero hacia la derecha excepto el 5
    // ¿Cómo? -> Recorriendo el array de derecha a izquierda
    for (int i = arrayNumeros.length - 1; i > 0; i--) {

      if (i == 1) {

        arrayNumeros[i] = arrayNumeros[i - 1];

        // Asignamos aux a la posicion 0 del array arrayNumeros
        arrayNumeros[i - 1] = aux;
      }

      else  {
        arrayNumeros[i] = arrayNumeros[i - 1];
      }
    }
  }
}
