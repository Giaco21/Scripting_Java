import java.util.Scanner;

public class Bancomat {
    public static void main(String[] args) {
        InserisciPin();
        if(InserisciPin()==true){


        }

    }

public static boolean InserisciPin(){
    Scanner input = new Scanner(System.in);	
		
    int PINCarta=1234,PINUtente=0,Tentativi=0;
    
    
    
    while(Tentativi<3) {
        
        System.out.println("inserisci PIN:");
        PINUtente = input.nextInt();
        
        if(PINCarta == PINUtente) {
            System.out.println("Your pin is correct");
            return true;
        }
        if(PINCarta != PINUtente && Tentativi<3) {
            System.out.println("Your PIN is incorrect\n");
            
        }
        Tentativi++;
    }
    if(Tentativi==3){
        System.out.println("Troppi tentativi. Riprovare tra qualche minuti\n");
    }
    return true;
}

public static void SelezionaOperazione(){

    Scanner input = new Scanner(System.in);	
    System.out.println("Selezionare un'operazione : \n[1]Prelievo\n [2]Versamento\n");
    int sel = input.nextInt();

    switch(sel){
        case 1:
                

        break;

        case 2:





        break;
        default: System.out.println("ERRORE! SELEZIONARE UN'OPERAZIONE VALIDA !");
    }
}
}
