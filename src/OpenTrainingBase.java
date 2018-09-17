import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class OpenTrainingBase { // Facade

  private static Archivio archivio = Archivio.getIstance();
  private static int  scelta;
  private static Scanner input = new Scanner(System.in);
  private static ArrayList<Studente> studenti;
  private static ArrayList<Docente> docenti;
  private static ArrayList<Corso> corsi;

  public static void main(String args[]) {

    fetchArchivio();
    menu();

  }

  public static void fetchArchivio() {
    studenti = archivio.getStudenti();
    docenti= archivio.getDocenti();
    corsi = archivio.getCorsi();
  }

  public static void printStudenti(){

    if(studenti.size()==0){
      System.out.println("Non ci sono studenti");
    }
    else{
      for(Studente s : studenti){
        //stampa dati studente
      }
    }

  }

  public static void printDocenti(){

    if(docenti.size()==0){
      System.out.println("Non ci sono studenti");
    }
    else{
      for(Docente d : docenti){
        //stampa dati docente
      }
    }

  }

  public static void printCorsi(){

    if(corsi.size()==0){
      System.out.println("Non ci sono corsi");
    }
    else{
      for(Corso c : corsi){
        //stampa dati corsi
      }
    }

  }

  public static void menu() {

    do {
      System.out.println("Digitare per la scelta\n");
      System.out.println("1) -- Visualizza archivio studenti");
      System.out.println("2) -- Visualizza archivio docenti");
      System.out.println("3) -- Visualizza archivio corsi");
      System.out.println("4) -- Inserisci studente");
      System.out.println("5) -- Inserisci docente");
      System.out.println("6) -- Inserisci corso");
      System.out.println("7) -- Iscrivi studente ad un corso");
      System.out.println("8) -- Coordinamento docente");
      System.out.println("9) -- Elimina studente");
      System.out.println("10) -- Elimina docente");
      System.out.println("11) -- Elimina corso");
      System.out.println("0) -- Per terminare");

      System.out.print("Inserisci scelta: ");
      scelta = Integer.parseInt(input.nextLine());

      int idC;
      switch(scelta){

        case 1:
          printStudenti();
          break;
        case 2:
          printDocenti();
          break;
        case 3:
          printCorsi();
          break;
        case 4:
          registraStudente();
          break;
        case 5:
          registraDocente();
          break;
        case 6:
          registraCorso();
          break;
        case 7:
          System.out.println("Id Studente");
          int idS = Integer.parseInt(input.nextLine());
          System.out.println("Id Corso");
          idC = Integer.parseInt(input.nextLine());
          iscrizione(idS,idC);
          break;
        case 8:
          System.out.println("Id Docente");
          int idD = Integer.parseInt(input.nextLine());
          System.out.println("Id Corso");
          idC = Integer.parseInt(input.nextLine());
          setCoordinamento(idD,idC);
          break;
        case 9:
          eliminaStudente();
          break;
        case 10:
          eliminaDocente();
          break;
        case 11:
          eliminaCorso();
          break;
        default:
          System.out.println("Ricarico menu");
      }

    }while(scelta !=0);

  }

  public static void registraStudente() {
    String nome, cognome, c_f, dataNascita, email;
    String risp;
    CreatorPersona cS = new CreatorStudente();
    Persona stud = cS.creaPersona();

    stud.setId();
    System.out.println("Nome: ");
    nome=input.nextLine();
    System.out.println("Cognome: ");
    cognome=input.nextLine();
    System.out.println("Codice fiscale: ");
    c_f=input.nextLine();
    System.out.println("Data Nascita: ");
    dataNascita=input.nextLine();
    System.out.println("email: ");
    email=input.nextLine();

    stud.setAnagrafica(nome,cognome,c_f,dataNascita);
    stud.setEmail(email);
    System.out.println("Dichiarare reddito : Sì/No");
    risp=input.nextLine();

    Studente s= (Studente)stud;
    if(risp=="Sì") {
      s.setRedditoDichiarato(true);
      s.declareReddito();
      float isee=0;
      int id;
      String cf, data;
      System.out.println("id: ");
      id=Integer.parseInt(input.nextLine());
      System.out.println("isee: ");
      isee=Float.parseFloat(input.nextLine());
      System.out.println("c_f dichiarante: ");
      cf=input.nextLine();
      System.out.println("Data Nascita: ");
      data=input.nextLine();
      s.getStateReddito().setReddito(isee,id,cf,data);
    }
    else
      s.setRedditoDichiarato(false);

    studenti.add(s);
  }

  public static void registraDocente() {
  }

  public static void registraCorso() {
  }

  public static void iscrizione(int idS, int idC){
    //associa lo studente al corso

  }
  public static void modificaStudente() {
  }

  public static void modificaDocente() {
  }

  public static void modificaCorso() {
  }

  public static void eliminaStudente() {
  }

  public static void eliminaDocente() {
  }

  public static void eliminaCorso() {
  }

  public static void setCoordinamento(int idD, int idC){

  }

}
