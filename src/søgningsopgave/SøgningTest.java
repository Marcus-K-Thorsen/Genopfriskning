package søgningsopgave;

public class SøgningTest {

  public void run() {
    String[] tekster = {"Dyr", "svampe", "Bakterier", "planter"};
    String tekst = "vampe";
    Søgning søg = new Søgning();

    try {
      int indeksPosition = søg.stringIndeksPosition(tekster, tekst);
      System.out.println("teksten: " + tekst + " findes og er på indeks: " + indeksPosition);
    } catch (MissingStringException ex){
      System.out.println(ex);
    }
  }

  public static void main(String[] args) {
    new SøgningTest().run();
  }
}
