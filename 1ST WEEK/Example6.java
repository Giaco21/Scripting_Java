import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {

        //scanner primo valore
        Scanner myNum1 = new Scanner(System.in);
        int num1;

        //inserisco primo numero

        System.out.println("Inserisci il primo numero");
        num1 = myNum1.nextInt();

        //scanner secondo numero

        Scanner myNum2 = new Scanner(System.in);
        int modulo;

        //inserisco il modulo
        System.out.println("Inserisci il secondo numero");
        modulo =  myNum2.nextInt();

        //stampo il risultato
        System.out.println(num1 + " modulo " + modulo + " è " + (num1 % modulo) );


        // divido il numero per 2, se il risultato della divisione riporta resto, il numero inserito è dispari. Altrimenti è pari.
        boolean pari = (num1 % 2) == 0;

        //if contratto
        String tipoNumero = (num1 % 2 == 0) ? "pari" : "dispari";

        //stampo il risultato del boolean
        System.out.println( "*********** Il numero pari è true ********** \n*********** Il numero dispari è false ***********\n"+ num1 + " è : " + pari );

        //stampo se dispari o pari
        System.out.println("il numero inserito è : " + tipoNumero);

        myNum1.close();
        myNum2.close();
    }
}