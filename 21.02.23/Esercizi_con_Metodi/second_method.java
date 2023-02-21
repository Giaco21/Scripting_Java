package Esercizi_con_Metodi;

import java.util.Scanner;
import java.util.ArrayList;

public class second_method {

    static Scanner menu = new Scanner(System.in);
    static Scanner nome2 = new Scanner(System.in);
    static Scanner psw2 = new Scanner(System.in);
    static Scanner parolScanner = new Scanner(System.in);
    static String nomecontrollo;
    static String passwordcontrollo;
    static int scelta;
    static boolean verificato, controllato, loggato;
    static ArrayList<String> nome = new ArrayList<String>();
    static ArrayList<String> pw = new ArrayList<String>();
    static ArrayList<String> frase = new ArrayList<String>();

    public static void main(String[] args) {

        menu();
    }

    public static void menu() {
        System.out.println("Prego, selezioni una modalità: \n [0]USCIRE\n [1]REGISTRAZIONE\n [2]LOGIN\n [3]INSERIMENTO DATI\n [4]VISUALIZZAZIONE DATI\n");
        scelta = menu.nextInt();
        switch (scelta) {

            case 0:
                break;
            case 1:
                Create();
                menu();
            case 2:
                Login();
                menu();
            case 3:
                Inserimento();
                menu();
            case 4: Visualizzazione();
            menu();
            default:
                System.out.println("ERRORE! SELEZIONARE UN VALORE VALIDO");
        }

    }

    public static void Create() {

        verificato = false;
        int cont = 0;

        Scanner nameinp = new Scanner(System.in);
        Scanner pwinp = new Scanner(System.in);
        Scanner etainp = new Scanner(System.in);

        while (verificato != true) {
                System.out.println("Prego, inserisca il suo nome\n");
                String name = nameinp.nextLine();
                nome.add(name);
                System.out.println("Prego, inserisca una password\n");
                String psw = pwinp.nextLine();
                pw.add(psw);
            verificato = true;
        }
    };

    public static void Login() {
        loggato = false;
        System.out.println("Prego inserisca il nome utente\n");
        String nomecontrollo = nome2.nextLine();
        System.out.println("Prego inserisca la password \n");
        String passwordcontrollo = psw2.nextLine();

        do{
        for(int i=0;i<nome.size();i++){
            if(nomecontrollo.equals(nome.get(i)) && passwordcontrollo.equals(pw.get(i))){
                System.out.println("Loggato con successo!\n");
                loggato = true;
            }else {
                System.out.println("ERRORE ! NESSUN UTENTE REGISTRATO\n");
            }
        }
    }while(loggato != true);
    };

    public static void Inserimento(){

        if(controllato=true){
            System.out.println("Prego inserisca una stringa da inserire nell'array\n");
            String phrase = parolScanner.nextLine();
            frase.add(phrase);
        }
    }

    public static void Visualizzazione(){
        System.out.println(frase);
    }
}
