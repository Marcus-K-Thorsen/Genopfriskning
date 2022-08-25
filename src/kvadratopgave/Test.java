package kvadratopgave;

public class Test {

  public void go() {
    Kvadrat kvadrat = new Kvadrat();
    kvadrat.udskrivKvadrat(0, '£');
  }

  public static void main(String[] args) {
    new Test().go();
  }
}
