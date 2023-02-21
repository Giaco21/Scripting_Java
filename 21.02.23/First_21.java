import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import javax.naming.directory.SchemaViolationException;
public class First_21 {
    static Scanner menu = new Scanner(System.in);
    static int scelta;
    static boolean verificato;
    static ArrayList<String> nome = new ArrayList<String>();
    static ArrayList<String> pw = new ArrayList<String>();
    static ArrayList<Integer> eta = new ArrayList<Integer>(); 

    public static void main(String[] args) {
        menu();



    }


    public static void menu(){
        System.out.println("Prego, selezioni una modalità: \n [0]USCIRE\n [1]INSERIMENTO DATI\n [2]VISUALIZZAZIONE DATI\n [3]MODIFICARE DATI INSERITI");
        scelta = menu.nextInt();
        switch(scelta){

            case 0: break;
            case 1: registrazione();
            menu();
            case 2: visualizzazione();
            menu();
            case 3: Controllo();
            menu();
            default: System.out.println("ERRORE! SELEZIONARE UN VALORE VALIDO");
        }

    }


    public static void registrazione(){
        verificato = false;
        int cont =0;

        Scanner nameinp = new Scanner(System.in);
        Scanner pwinp = new Scanner(System.in);
        Scanner etainp = new Scanner(System.in);

        while(verificato!=true){

        do{
        System.out.println("Prego, inserisca il suo nome\n");
        String name = nameinp.nextLine();
        nome.add(name);
        System.out.println("Prego, inserisca una password\n");
        String psw = pwinp.nextLine();
        pw.add(psw);
        System.out.println("Prego, inserisca la sua età\n");
        int etacor = etainp.nextInt();
        eta.add(etacor);
        cont++;
        }while(cont<3);
        verificato = true;
    }
}


    public static void visualizzazione(){

        System.out.println("I dati del primo utente sono: \n");
        System.out.println("NOME: " + nome.get(0));
        System.out.println("PASSWORD: "+ pw.get(0));
        System.out.println("ETA': " + eta.get(0));

        System.out.println("I dati del secondo utente sono: \n");
        System.out.println("NOME: " + nome.get(1));
        System.out.println("PASSWORD: "+ pw.get(1));
        System.out.println("ETA': " + eta.get(1));

        System.out.println("I dati del terzo utente sono: \n");
        System.out.println("NOME: " + nome.get(2));
        System.out.println("PASSWORD: "+ pw.get(2));
        System.out.println("ETA': " + eta.get(2));
    }

public static void Controllo(){
    Scanner nome2 = new Scanner(System.in);
    Scanner psw2 = new Scanner(System.in);
    Scanner eta2 = new Scanner(System.in);
    boolean controllato = false;
    System.out.println("Prego inserisca il nome per modificare i dati\n");
    String nomecontrollo = nome2.nextLine();
    System.out.println("Prego inserisca la password per modificare i dati\n");
    String passwordcontrollo = psw2.nextLine();

    do{

        for(int j=0; j<nome.size();j++){

            if(nomecontrollo.equals(nome.get(j)) && passwordcontrollo.equals(pw.get(j))){

                System.out.println("Prego inserisca il nuovo nome dell'utente n°: " + j + "\n" );
                System.out.println("NUOVO NOME: ");
                String nuovo_nome = nome2.nextLine();
                nome.set(j, nuovo_nome);

                System.out.println("Prego inserisca la nuova password dell'utente n°: " + j + "\n" );
                System.out.println("NUOVA PASSWORD: ");
                String nuova_password = psw2.nextLine();
                pw.set(j, nuova_password);

                System.out.println("Prego inserisca la nuova età dell'utente n°: " + j + "\n" );
                System.out.println("NUOVA ETA': ");
                int nuova_eta = eta2.nextInt();
                eta.set(j, nuova_eta);
                
                controllato = true;

            }continue;

    }
}while(controllato != true);
}
}
