package bogopgave;

public class MainTest {

  public void go() {
    Bog bog1 = new  Bog(123, "Bog 1", 2020);
    Bog bog2 = new Bog(234, "Bog 2", 2021);
    Bog bog3 = new Bog(345, "Bog 3", 2022);
    Bog bog4 = new Bog(129, "Bog 4", 2000);
    Bibliotek bibliotek = new Bibliotek();
    bibliotek.tilføjBog(bog1);
    bibliotek.tilføjBog(bog2);
    bibliotek.tilføjBog(bog3);

    System.out.println(bibliotek);
    System.out.println();
    System.out.println("Har bogen: " + bog4.getTitel() + " ens ISBN-nummer til en bog i biblioteket?");
    System.out.println(bibliotek.ensISBN(bog4));
  }

  public static void main(String[] args) {
    new MainTest().go();
  }
}
