public class CreatorDocente implements CreatorPersona {

  @Override
  public Persona creaPersona() {
    return new Docente();
  }

}