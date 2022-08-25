package sorteringsopgave;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Sortering  {

  public String inputTxt() {
    Scanner input = new Scanner(System.in);
    String stringInput = input.nextLine().trim();
    while (stringInput.length() < 1) {
      System.out.println("Indtast mindst 1 bogstav:");
      stringInput = input.nextLine().trim();
    }
    return stringInput;
  }

  public void printOutFiveStrings() {
    System.out.println("Indtast 5 stringe:");
    ArrayList<TekstString> strings = new ArrayList<>();
    for (int i = 0; i < 5; i++){
      TekstString aString = new TekstString(inputTxt());
      strings.add(aString);
    }

    System.out.println("Der blev indlæst:");
    for (TekstString enString: strings) {
      System.out.println("\t" + enString.getTxt());
    }
    System.out.println();
    System.out.println("Der udskrives på skærmen:");
    Collections.sort(strings);
    for (TekstString enString: strings) {
      System.out.println("\t" + enString.getTxt());
    }
  }


}
