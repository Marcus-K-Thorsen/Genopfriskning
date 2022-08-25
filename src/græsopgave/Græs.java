package græsopgave;

public class Græs {

  private final double Græs_Gror_Cm_Per_Dag;

  public Græs() {
    Græs_Gror_Cm_Per_Dag = 0.8;
  }
  public Græs(double cmGræsGrorDagligt) {
    this.Græs_Gror_Cm_Per_Dag = cmGræsGrorDagligt;
  }

  public int dageTilGræsSkalSlås(double græsNu, double græsSlås) {
    int dageTilGræsSlalSlås = 0;
    if(græsNu >= græsSlås || græsSlås <= 0) {
      return dageTilGræsSlalSlås;
    }
    while (græsNu < græsSlås) {
      dageTilGræsSlalSlås++;
      græsNu += Græs_Gror_Cm_Per_Dag;
    }
    return dageTilGræsSlalSlås;
  }
}
