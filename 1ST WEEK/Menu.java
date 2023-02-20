import java.util.Scanner;

public class Menu {

    static int carbonara = 10, amatriciana =8, cacio_e_pepe = 5;
    static int pasta;
    static String pw = "ciao";
    static Scanner scelta = new Scanner(System.in);
    static Scanner opzione = new Scanner(System.in);
    static boolean sent1 = false;
    static boolean conferma = false;
    public static void main(String[] args) {

        Menu();
        
    }


    public static void Carbo(){

        System.out.println("Hai selezionato : CARBONARA\n");
        String ingr_carbo = "Guanciale\n Uovo\n Pecorino\n ";
        System.out.println("Gli ingredienti sono :\n "+ ingr_carbo);
        carbonara--;
        int prezzo_carb = 10;
        System.out.println("SONO RIMASTI SOLO :\n" + carbonara + " CARBONARA\n" );
        System.out.println("IL PREZZO E' DI " + prezzo_carb);
        Conf();
    }

    public static void Amatr(){
        System.out.println("Hai selezionato : AMATRICIANA\n");
        String ingr_amatr = "Amore\n Guanciale\n Peperoncino\n ";
        System.out.println("Gli ingredienti sono :\n "+ ingr_amatr);
        amatriciana--;
        int prezzo_amatr = 8;
        System.out.println("SONO RIMASTI SOLO :\n" + amatriciana + " AMATRICIANA\n" );
        System.out.println("IL PREZZO E' DI " + prezzo_amatr);
        Conf();

    }

    public static void Cac(){
        System.out.println("Hai selezionato : CACIO E PEPE\n");
        String ingr_cacio_pepe = "Caciocavallo\n Amore\n Pepe\n ";
        System.out.println("Gli ingredienti sono :\n "+ ingr_cacio_pepe);
        cacio_e_pepe--;
        int prezzo_cacio = 6;
        System.out.println("SONO RIMASTI SOLO :\n" + cacio_e_pepe + " CACIO E PEPE\n" );
        System.out.println("IL PREZZO E' DI " + prezzo_cacio);
        Conf();
    }

    public static void Conf(){

        do{
            System.out.println("VUOLE CONFERMARE LA SUA SCELTA ?\n");
            String option = opzione.nextLine();

            if(option.equals("SI")){
                System.out.println("ORDINE CONFERMATO\n ");
                break;
            }else Menu(); 


        }while(conferma =false);
        }


public static void Menu(){

    do{
        System.out.println("PREGO SELEZIONI UNA FUNZIONE\n [1]CARBONARA\n [2]AMATRICIANA\n [3]CACIO E PEPE\n [4]USCITA\n");
        pasta = scelta.nextInt();
        boolean sent1 = true;
        }while(sent1=false);


        switch(pasta){

            case 4: System.out.println("Arrivederci ! \n");
            break;

            case 1:
            Carbo();
            break;

            case 2:
            Amatr();
            break;

            case 3:
            Cac();
            break;

        }
}

}