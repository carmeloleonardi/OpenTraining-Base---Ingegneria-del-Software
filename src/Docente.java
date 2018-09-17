import java.util.ArrayList;

public class Docente extends Persona {

  private String qualifica;
  private String homepage;
  public Corso coordinamento;
  public ArrayList<Modulo>  insegnamento;

  public Docente(){
    insegnamento = new ArrayList<Modulo>();
  }
  @Override
  public void setId() {
    //id generato automaticamente
  }

  @Override
  public String getStringPersona() {
  return "";
  }

  @Override
  public void setDatiPersona(String []data){

  }

  public void setQualifica(String q) {
    qualifica=q;
  }

  public String getQualifica() {
  return qualifica;
  }

  public String getHomepage() { return homepage; }

  public void setHomepage(String h){homepage=h;}

  public void setCoordinamento(String nome, String categoria){

  }
}