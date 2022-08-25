package søgningsopgave;

public class Søgning {

  public int stringIndeksPosition(String[] txter, String txt) throws MissingStringException {
    for (int i = 0; i < txter.length; i++) {
      if (txter[i].equalsIgnoreCase(txt)) {
        return i;
      }
    }
    throw new MissingStringException();
  }
}
