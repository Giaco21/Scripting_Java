import java.util.Scanner;

public class loop_for {

    static int numero;

    static Scanner scelta = new Scanner(System.in);
    static Scanner menu = new Scanner(System.in);
    static Scanner phrase = new Scanner(System.in);

    static boolean verifico1 = false;
    static boolean verifico2 = false;

public static void main(String[] args) {

    Menu();
    Inserimento();


  }
public static void Menu(){
    
    System.out.println("*****************MENU PRINCIPALE**************\n [1]INSERIMENTO NUMERO\n [2]SPLIT DELLA PAROLA INSERITA [3]USCITA ");
    int scelmen= menu.nextInt();
    switch(scelmen){

        case 1:
        Inserimento();
        Contator();
        Menu();

        case 2:
        splitter();
        Menu();
        case 3:
        System.out.println("Arrivederci ! \n");
        break;
    }
}

public static void Inserimento(){

    System.out.println("Prego, inserisca il numero fino a dove contare\n");
    numero = scelta.nextInt();
    verifico1= true;
}

public static void Contator(){
    if(verifico1=true){
        for(int i=0; i<=numero; i++){
                System.out.println("NUMERI VALGONO : "+ i);
        }
    }
}
public static void splitter(){
    System.out.println("Prego, inserisca la parola da splittare\n");
    String parola = phrase.nextLine();
    int lenght = parola.length();
    for(int i=0; i<=lenght;i++){
        for(int j=0; j<=lenght;j++){
        } 
        System.out.println();
    }

}
}
