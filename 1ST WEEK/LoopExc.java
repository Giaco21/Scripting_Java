import java.util.Scanner;


public class LoopExc {
    public static void main(String[] args) {

        //scanners
        Scanner input = new Scanner(System.in);	
        Scanner inpStr = new Scanner(System.in);
        Scanner first_scelta = new Scanner(System.in);

        //prima richiesta
        System.out.println("Cosa vuole effettuare ?\n [1] Per Inserire un numero\n [2] Per inserire una stringa da dividere\n [3] Per uscire dal programma\n ");

        //inizializzo il first che serve per la prima selezione
        int first = first_scelta.nextInt();


        //switch per la selezione [1]Numero [2]Stringa [3]Uscita
        switch(first){

            //Numero 
            case 1:
            System.out.println("Inserire un numero compreso tra 1 e 10\n");
            int sel = input.nextInt();

            //fin quando il numero inserito sia nel range tra 1 e 10
            while(sel>0 && sel<=10){
                boolean pari = sel%2 ==0;

                //verifico se pari o dispari
                if(pari == true){
                    int risultato = sel/2;
                    System.out.println("Il risultato della divisione vale : \n" +risultato);  //stampo pari
                }else{
                    System.out.println("Prego inserisca un numero per effettuare il modulo \n");
                    Scanner modulo= new Scanner(System.in);
                    int modo = modulo.nextInt();
    
                    int res = sel%modo; 
                    System.out.println("Il modulo vale : \n" + res);  //stampo dispari
                }
                sel = 0;
            }
            break;

            case 2:

            System.out.println("Prego inserisca una stringa da dividere : \n");
            String parola = inpStr.nextLine();
            System.out.println("Prego inserisca in quante parole dividere la frase : \n ");
            Scanner splitter = new Scanner(System.in);
            int splitterino = splitter.nextInt();
            String frase_divisa[] = parola.split(" ", splitterino);  //qui so problemi
            System.out.println("La frase scelta divisa vale : \n "+ frase_divisa);
            sel = 0;
            break;

            case 3:
            System.out.println("Arrivederci !\n");
            break;
        }
    }

    }
