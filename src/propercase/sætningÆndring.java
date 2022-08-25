package propercase;

import java.util.ArrayList;

public class sætningÆndring {

  public String ændretSætning(String sætning) {
    sætning = sætning.trim();
    ArrayList<Integer> spaceIndeces = new ArrayList<>();
    String nySætning = "";
    if (sætning.length() > 0) {
      int sætningsLængde = sætning.length();
      for (int i = 0; i < sætningsLængde; i++) {
        char symbol = sætning.charAt(i);
        if (symbol == ' ') {
          spaceIndeces.add(i);
        }
      }
      int antalSpaces = spaceIndeces.size();
      for (int i = 0; i <= antalSpaces; i++) {
        String etOrd = "";

        if (i != antalSpaces) {
          if (i == 0) {
            etOrd = sætning.substring(0, spaceIndeces.get(0));
          } else {
            etOrd = sætning.substring(spaceIndeces.get(i - 1) + 1, spaceIndeces.get(i));
          }
        } else {
          etOrd = sætning.substring(spaceIndeces.get(i - 1) + 1);
        }
        String ordCaps = etOrd.toUpperCase();
        if (!etOrd.equals(ordCaps)) {
          etOrd = etOrd.toLowerCase();
          if (etOrd.length() > 3) {
            etOrd = ordCaps.substring(0, 1).concat(etOrd.substring(1));
          }
        }
        nySætning = nySætning.concat(etOrd);
        if (i < antalSpaces) {
          nySætning = nySætning.concat(" ");
        }
      }
    }
    return nySætning;
  }

  public static void main(String[] args) {
    sætningÆndring sætÆndring = new sætningÆndring();
    String txt = " fisk og fugle MÅSKE MÅ jEg lave lORT";
    System.out.println(txt);
    String nyText = sætÆndring.ændretSætning(txt);

    System.out.println(nyText);
  }
}
