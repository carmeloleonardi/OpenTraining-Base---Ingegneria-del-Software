import java.util.ArrayList;

public class Corso extends CorsoFormazione {

  private int id;
  private String categoria;
  private String nome;
  private String descrizione;
  private float costo;
  private int postiTotali;
  private int postiOccupati;
  private ArrayList<CorsoFormazione> moduli;

  public void setId() { /*id è autogenerato */}
  
  public Corso(String nome, String categoria) {
    this.nome=nome;
    this.categoria=categoria;
    moduli = new ArrayList<CorsoFormazione>();
  }

  public void add(CorsoFormazione c) {
    moduli.add(c);
  }

  public void remove( CorsoFormazione c) {
    moduli.remove(c);
  }

  public void setCategoria(String c) {
    categoria=c;
  }

  public void setNome(String n) {
    nome=n;
  }

  public void setDescrizione(String d) {
    descrizione=d;
  }

  public void setPostiTotali(int p) {
    postiTotali=p;
  }

  public void occupaPosto() {
    postiOccupati++;
  }

  public void liberaPosto() {
    postiOccupati--;
  }

  @Override
  public String getStringData() {
  return "";
  }

  public int getPostiTotali() {
  return postiTotali;
  }

  public int getPostiOccupati() {
  return postiOccupati;
  }

  public int getPostiLiberi() {
  return postiTotali-postiOccupati;
  }

}