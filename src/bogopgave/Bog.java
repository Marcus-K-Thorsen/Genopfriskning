package bogopgave;

public class Bog {

  private int ISBN_Num;
  private String titel;
  private  int udgivelsesår;

  public Bog(int ISBN_Num, String titel, int udgivelsesår) {
    this.ISBN_Num = ISBN_Num;
    this.titel = titel;
    this.udgivelsesår = udgivelsesår;
  }

  public int getISBN_Num() {
    return ISBN_Num;
  }
  public void setISBN_Num(int ISBN_Num) {
    this.ISBN_Num = ISBN_Num;
  }

  public String getTitel() {
    return titel;
  }
  public void setTitel(String titel) {
    this.titel = titel;
  }

  public int getUdgivelsesår() {
    return udgivelsesår;
  }
  public void setUdgivelsesår(int udgivelsesår) {
    this.udgivelsesår = udgivelsesår;
  }

  @Override
  public  String toString() {
    return "ISBN-nummer: " + ISBN_Num + "\n" + "Titel: " + titel + "\n" + "Udgivelsesår: " + udgivelsesår;
  }
}
