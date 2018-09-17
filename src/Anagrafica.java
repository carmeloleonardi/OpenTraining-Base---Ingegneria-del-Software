public class Anagrafica {

  private String nome;
  private String cognome;
  private String c_f;
  private Data dataNascita;

  public void setNome(String n) {
    nome=n;
  }

  public void setCognome(String c) {
    cognome=c;
  }

  public void setC_f(String cf) {
    c_f=cf;
  }

  public void setData(Data d) {
    dataNascita=d;
  }

  public String getNome() {
    return nome;
  }

  public String getCognome() {
    return cognome;
  }

  public String getC_f() {
    return c_f;
  }

  public Data getData() {
    return dataNascita;
  }

}