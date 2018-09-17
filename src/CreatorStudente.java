public class CreatorStudente implements CreatorPersona {

  @Override
  public Persona creaPersona() {

    return new Studente();

  }

}