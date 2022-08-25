package kvadratopgave;

public class Kvadrat {

  public void udskrivKvadrat(int antal, char sym) {
    if (antal < 1) {
      antal = 5;
    }
    if (sym == ' ') {
      sym = '*';
    }
    for (int i = 0; i < antal; i++) {
      String enLinje = "";
      for (int j = 0; j < antal; j++) {
        enLinje = enLinje.concat("" + sym);
        if (j != antal - 1) {
          enLinje += "  ";
        }
      }
      System.out.println(enLinje);
    }
  }
}
