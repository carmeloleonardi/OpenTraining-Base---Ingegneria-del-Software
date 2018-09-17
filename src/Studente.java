import com.sun.org.apache.regexp.internal.RE;

public class Studente extends Persona {

  private boolean redditoDichiarato;
  private CorsoFormazione iscrizione;
  private Reddito stateReddito;

  @Override
  public void setId() {
    //genera l'id dello studente
  }

  @Override
  public String getStringPersona() {

    return "";
  }

  @Override
  public void setDatiPersona(String []data){
    // assegna i data del vettore data agli attibuti della classe
  }

  public void setRedditoDichiarato(boolean f){
    redditoDichiarato=f;
  }

  public void declareReddito() {
    if(redditoDichiarato){
      stateReddito = new DatiReddito();
    }
  }

  public Reddito getStateReddito(){
    return stateReddito;
  }

  public boolean isDeclaredReddito() {
    return redditoDichiarato ? true : false;
  }

}