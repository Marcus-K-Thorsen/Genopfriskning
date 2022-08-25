package søgningsopgave;

public class MissingStringException extends Exception{

  public MissingStringException() {
    super("The string is missing from the array!");
  }
}
