public class ejercicio9 {
	public static void main(String []args) {

		int x = 0;
		int y = 0;
		int base;
		int altura;

		// Anchura de la bandera
		System.out.print ("Introducir base: ");
		base = Integer.parseInt (System.console().readLine());

		System.out.println ();

		// Altura de la bandera
		System.out.print ("Introducir altura: ");
		altura = Integer.parseInt (System.console().readLine());

		System.out.println ();

		// Pintar la bandera
		do {

      System.out.print ("|");

			for (x = 0; x < base; x++) {

        System.out.print ("*");

				if (x == base - 1) {
          System.out.print ("|");
					System.out.println ();
				}
			}

      y++;

		} while (y < altura);
	}
}
