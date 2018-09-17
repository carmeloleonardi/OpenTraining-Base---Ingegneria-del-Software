public class Data {

  private int giorno;
  private int mese;
  private int anno;
    
  public Data(int g, int m, int a) {
    giorno=g;
    mese=m;
    anno=a;
  }

  public String getStringData() {
    return giorno + "/" + mese + "/" + anno;
  }

}