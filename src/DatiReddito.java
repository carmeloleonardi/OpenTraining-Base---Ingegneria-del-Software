import java.util.Vector;

public class DatiReddito implements Reddito {

  private float isee;

  private int id;

  private String c_f_dichiarante;

  public Data dataRichiesta;

  @Override
  public void setReddito(float isee, int id, String c_f, String d){
    this.isee=isee;
    this.id=id;
    c_f_dichiarante=c_f;
    String []arrData =d.split("/");
    dataRichiesta=new Data(Integer.parseInt(arrData[0]),Integer.parseInt(arrData[3]),Integer.parseInt(arrData[2]));
  }

  @Override
  public Reddito getReddito(){
    return this;
  }

}