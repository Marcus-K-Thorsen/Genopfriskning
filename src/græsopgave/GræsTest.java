package græsopgave;

import java.util.Scanner;

public class GræsTest {

  public double doubleInput() {
    Scanner input = new Scanner(System.in);
    if (input.hasNextDouble()) {
      double talInput = input.nextDouble();
      input.nextLine();
      return talInput;
    } else {
      System.out.print("Venligst indtast et tal: ");
      return doubleInput();
    }
  }

  public void go() {
    System.out.print("Indtast græs i cm. nu: ");
    double græsNu = doubleInput();
    System.out.print("Indtast græs i cm. når det skal slås: ");
    double græsSlås = doubleInput();

    Græs græs1 = new Græs();
    Græs græs2 = new Græs(1.0);
    int dageTilGræs1SkalSlås = græs1.dageTilGræsSkalSlås(græsNu, græsSlås);
    int dageTilGræs2SkalSlås = græs2.dageTilGræsSkalSlås(græsNu, græsSlås);

    System.out.println("Græsplæne 1 skal slås om: " + dageTilGræs1SkalSlås + " dage.");
    System.out.println("Græsplane 2 skal slås om: " + dageTilGræs2SkalSlås + " dage.");
  }

  public static void main(String[] args) {
    new GræsTest().go();
  }
}
