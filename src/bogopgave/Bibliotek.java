package bogopgave;

import java.util.ArrayList;

public class Bibliotek {

  private ArrayList<Bog> bøger;

  public Bibliotek() {
    bøger = new ArrayList<>();
  }

  public void tilføjBog(Bog bog) {
    boolean bogenFindesIkke = true;
    for (Bog bibBog: bøger) {
      if (bibBog == bog) {
        bogenFindesIkke = false;
      }
    }
    if (bogenFindesIkke) {
      bøger.add(bog);
    }
  }

  public boolean ensISBN(Bog bog) {
    for (Bog bibBog: bøger) {
      if (bibBog.getISBN_Num() == bog.getISBN_Num()){
        return true;
      }
    }
    return false;
  }

  @Override
  public String toString() {
    String bøgerne = "";
    int bogNummer = 1;
    for (Bog enBog: bøger) {
      bøgerne += enBog.toString();
      if (bogNummer < bøger.size()) {
        bøgerne += "\n";
      }
      bogNummer++;

    }
    return bøgerne;
  }
}
