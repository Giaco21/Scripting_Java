import java.util.ArrayList;
import java.util.Scanner;
public class First_21 {
    static Scanner menu = new Scanner(System.in);
    static Scanner nome2 = new Scanner(System.in);
    static Scanner psw2 = new Scanner(System.in);
    static Scanner eta2 = new Scanner(System.in);
    static String nomecontrollo;
    static String passwordcontrollo;
    static int scelta;
    static boolean verificato,controllato;
    static ArrayList<String> nome = new ArrayList<String>();
    static ArrayList<String> pw = new ArrayList<String>();
    static ArrayList<Integer> eta = new ArrayList<Integer>(); 

    public static void main(String[] args) {
        menu();
    }


    public static void menu(){
        System.out.println("Prego, selezioni una modalità: \n [0]USCIRE\n [1]INSERIMENTO DATI\n [2]VISUALIZZAZIONE DATI\n [3]MODIFICARE DATI INSERITI\n [4]ELIMINAZIONE DATI");
        scelta = menu.nextInt();
        switch(scelta){

            case 0: break;
            case 1: registrazione();
            menu();
            case 2: visualizzazione();
            menu();
            case 3: Controllo();
            menu();
            case 4: cancel();
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

    public static void cancel(){

    System.out.println("Prego inserisca il nome per modificare i dati\n");
    String nomecontrollo = nome2.nextLine();
    System.out.println("Prego inserisca la password per modificare i dati\n");
    String passwordcontrollo = psw2.nextLine();

    Scanner scelta_canc = new Scanner(System.in);
    Scanner scelta_difficile = new Scanner(System.in);
    do{

        for(int j=0; j<nome.size();j++){

            if(nomecontrollo.equals(nome.get(j)) && passwordcontrollo.equals(pw.get(j))){

                System.out.println("ATTENZIONE! COSI' FACENDO VERRANNO RIMOSSI TUTTI I DATI\n VUOLE CONTINUARE ?\n [1]SI\n [2]NO\n");
                int scelta_cancell = scelta_canc.nextInt();
                if(scelta_cancell == 1){
            
                    System.out.println("VUOLE CANCELLARE TUTTI I DATI O SOLO I DATI DI UN UTENTE?\n [1]UN SOLO UTENTE (specificare numero)\n [2]TUTTI I DATI\n");
                    int scelta_brutta = scelta_difficile.nextInt();
                    if(scelta_brutta==2){
                    nome.clear();
                    pw.clear();
                    eta.clear();
                }else{
                    System.out.println("QUALE UTENTE VUOLE RIMUOVERE I DATI?\n");
                    Scanner numero_utente = new Scanner(System.in);
                    int numero_rimosso = numero_utente.nextInt();
                    nome.remove(numero_rimosso);
                    pw.remove(numero_rimosso);
                    eta.remove(numero_rimosso);
                }
                }else {
                    System.out.println("RITORNO AL MENU INIZIALE...");
                    try {
                        Thread.sleep(3600);
                        menu();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                
                controllato = true;

            }continue;

    }
}while(controllato != true);
}
}
