public abstract class Persona {

  protected int matricola;

  protected String email;

  private Anagrafica anagrafica;

  public abstract void setId();

  public abstract String getStringPersona();

  public abstract void setDatiPersona(String[] data);

  public void setAnagrafica(String nome, String cognome, String c_f, String dataNascita){
    anagrafica=new Anagrafica();
    anagrafica.setNome(nome);
    anagrafica.setCognome(cognome);
    anagrafica.setC_f(c_f);
    String[] data =dataNascita.split("/");
    Data d = new Data(Integer.parseInt(data[0]),Integer.parseInt(data[1]),Integer.parseInt(data[2]));
    anagrafica.setData(d);
  }

  public void setEmail(String e){
    email=e;
  }



  public int getMatricola() {

    return matricola;

  }

  public String getEmail() {

    return email;
  }



}