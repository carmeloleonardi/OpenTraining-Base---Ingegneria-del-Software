import java.util.ArrayList;
import java.io.*;


public class Archivio {

  private static Archivio archivio;
  private ArrayList<Studente> studenti;
  private ArrayList<Docente> docenti;
  private ArrayList<Corso> corsi;

  private Archivio() {
    studenti = new ArrayList<Studente>();
    docenti = new ArrayList<Docente>();
    corsi = new ArrayList<Corso>();
  }

  private String[] splitData(String line) {

    String [] arrSplit = line.split(" - ");
    return arrSplit;

  }

  private void fetchData() {

   //lettura file di Studenti, Docenti, Corsi

  }

  public static Archivio getIstance() {

    if(archivio==null){
      archivio = new Archivio();
    }
    return archivio;
  }

  public void insertStudente(String [] record){

    CreatorPersona pc = new CreatorStudente();
    Persona stud = pc.creaPersona();
    stud.setDatiPersona(record);
    studenti.add((Studente)stud);

  }

  public ArrayList<Corso> getCorsi() {
    return corsi;
  }

  public ArrayList<Studente> getStudenti() {
    return studenti;
  }

  public ArrayList<Docente> getDocenti() {
    return docenti;
  }
}