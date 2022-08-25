package arraylist;

import java.util.ArrayList;

public class ArrayListOpgave {
  public boolean doesArraylistContainString(ArrayList<String> liste, String txt) {
    for (String listTxt: liste) {
      if (listTxt.equalsIgnoreCase(txt)) {
        System.out.println("The String has been found");
        return true;
      }
    }
    liste.add(txt);
    return false;
  }

  public static void main(String[] args) {
    ArrayList<String> enListe = new ArrayList<>();
    enListe.add("Noget");
    enListe.add("Noget Mere");
    enListe.add("noget");
    enListe.add("mere");
    for (String listeTxt: enListe) {
      System.out.println(listeTxt);
    }
    String enTxt = "noget andet";
    ArrayListOpgave opgave = new ArrayListOpgave();
    boolean erTxtIListe = opgave.doesArraylistContainString(enListe, enTxt);
    System.out.println(erTxtIListe);
    for (String listeTxt: enListe) {
      System.out.println(listeTxt);
    }
  }
}
