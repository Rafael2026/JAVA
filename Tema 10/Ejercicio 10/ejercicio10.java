import java.util.HashMap;

public class ejercicio10 {
  public static void main (String[] args) {

    HashMap <String, String> m = new HashMap <String, String> ();

    m.put ("ordenador", "computer"); // 1º
    m.put ("gato", "cat"); // 2º
    m.put ("rojo", "red"); // 3º
    m.put ("árbol", "tree"); // 4º
    m.put ("pingüino", "penguin"); // 5º
    m.put ("sol", "sun"); // 6º
    m.put ("agua", "water"); // 7º
    m.put ("viento", "wind"); // 8º
    m.put ("siesta", "siesta"); // 9º
    m.put ("arriba", "up"); // 10º
    m.put ("ratón", "mouse"); // 11º
    m.put ("estadio", "arena"); // 12º
    m.put ("calumnia", "aspersion"); // 13º
    m.put ("aguacate", "avocado"); // 14º
    m.put ("cuerpo", "body"); // 15º
    m.put ("concurso", "contest"); // 16º
    m.put ("cena", "dinner"); // 17º
    m.put ("salida", "exit"); // 18º
    m.put ("lenteja", "lentil"); // 19º
    m.put ("cacerola", "pan"); // 20º
    m.put ("pastel", "pie"); // 21º
    m.put ("membrillo", "quince"); // 22º

    System.out.print ("Introduzca una palabra en español: ");
    String palabraIntro = System.console().readLine();

    if (m.containsKey (palabraIntro)) {
      System.out.println (palabraIntro + " --> " + m.get (palabraIntro));
    }

    else {
      System.out.print ("Lo siento, no conozco esa palabra");
    }
  }
}
