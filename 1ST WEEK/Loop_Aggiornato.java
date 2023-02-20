import java.util.Scanner;

public class Loop_Aggiornato {
    
    static int eta;
    static int err = 1;
    static String nome,cognome;
    static String data;
    static String copy;
    static String pw = "ciao";

    static Scanner inpNome = new Scanner(System.in);
    static Scanner inpCognome = new Scanner(System.in);
    static Scanner inpEta = new Scanner(System.in);
    static Scanner inpDate = new Scanner(System.in);
    static Scanner password = new Scanner(System.in);
    static Scanner scelta = new Scanner(System.in);
    static Scanner menu = new Scanner(System.in);
    static Scanner scelta2 = new Scanner(System.in);

    static boolean verifico = false;
    static boolean inserita = false;
    static boolean controllo = false;
    static boolean verifico2 = false;


    public static void main(String[] args) {
        Menu();
    }

public static  void Inizializza_Campi (){
    do{

        System.out.println("Prego inserisca il suo nome : \n");
        nome = inpNome.nextLine();
        System.out.println("Prego inserisca il suo cognome : \n");
        cognome = inpCognome.nextLine();
        System.out.println("Prego inserisca la sua età : \n");
        eta = inpEta.nextInt();
        System.out.println("Prego inserisca la sua data di nascita come dd-mm-yy : \n");
        data = inpDate.nextLine();
        verifico = true;

    }while(verifico!= true);
}

public static void Inserimento_Password(){
    if(verifico = true){
        System.out.println("Prego inserisca una password per modificare i suoi dati in futuro : \n");
        pw = password.nextLine();
        inserita = true;
    }
}

public static void Controllo_e_inserimento_Campi(){
    System.out.println("Desidera modificare i dati inseriti in precedenza ? \n [1] SI \n [2] NO \n");
    int scel = scelta.nextInt();
    
        int pinco = 1;
        while(verifico==true && inserita==true && pinco != 0){
            if(err<=2){

            System.out.println("Prego inserisca la password per modificare i dati\n");
            String psw = password.nextLine();
                if(psw.equals(pw)== true){

                
                do{
                    System.out.println("Prego inserisca il suo nome : \n");
                    nome = inpNome.nextLine();
                    System.out.println("Prego inserisca il suo cognome : \n");
                    cognome = inpCognome.nextLine();
                    System.out.println("Prego inserisca la sua età : \n");
                    eta = inpEta.nextInt();
                    System.out.println("Prego inserisca la sua data di nascita come dd-mm-yy : \n");
                    data = inpDate.nextLine();
                    verifico2 = true;
        
                }while(verifico2!= true);

                pinco =0;
                err = 3;
            }else{
                System.out.println("Hai Sbagliato\n ");
                err++;
            }
        }else{
            System.out.println("Troppi tentativi errati !\n");
            break;
        }
        }

    }

public static void Scelta_Canc(){

    System.out.println("ATTENZIONE! COSI' FACENDO STA ELIMINANDO TUTTI I DATI. VUOLE CONTINUARE ?\n [1]SI\n [2]NO\n ");
    int delete = scelta2.nextInt();
    if(delete ==1){
        System.out.println("ATTENDERE MENTRE SI ELIMINANO I DATI...\n");
        try {
            Thread.sleep(3600);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        nome = " ";
        cognome = " ";
        eta = 0;
        data = " ";

        System.out.println("ADESSO PUO' INSERIRE I NUOVI DATI : \n");
        try {
            Thread.sleep(3600);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Inizializza_Campi();

    }




}

public static void Menu(){
    
    System.out.println("*****************MENU PRINCIPALE**************\n [0]INSERIMENTO DATI\n [1]INSERIMENTO PASSWORD\n [2]CANCELLA DATI INSERITI \n [3]MODIFICARE DATI INSERITI\n [4]ESCI\n ");
    int scelmen= menu.nextInt();
    switch(scelmen){

        case 0: 
        Inizializza_Campi();

        case 1:
        Inserimento_Password();
        break;

        case 2:
        Scelta_Canc();
        break;

        case 3:
        Controllo_e_inserimento_Campi();
        break;

        case 4:
        System.out.println("Arrivederci ! \n");
        break;
    }
}
}