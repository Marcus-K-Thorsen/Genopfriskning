package sorteringsopgave;

public class TekstString implements Comparable<TekstString> {

  private String txt;

  public TekstString(String txt) {
    this.txt = txt;
  }

  public String getTxt() {
    return txt;
  }
  public void setTxt(String txt) {
    this.txt = txt;
  }

  @Override
  public int compareTo(TekstString object) {
    return object.txt.compareToIgnoreCase(this.txt);
  }
}
