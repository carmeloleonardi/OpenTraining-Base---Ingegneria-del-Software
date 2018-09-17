public class CreatorCorsoFormazione {

  public static CorsoFormazione createCorso(String nome, String categoria) {
    return new Corso(nome,categoria);
  }

  public static CorsoFormazione createModulo(String nome, int ore, String ssd) {

    return new Modulo(nome,ore,ssd);
  }

}