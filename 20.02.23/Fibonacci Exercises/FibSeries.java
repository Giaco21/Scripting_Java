import java.util.Scanner;

public class FibSeries {

 public static void main(String[] args) {
    PrintFibo();
 }


 public static void PrintFibo(){

    int FibLength;
    Scanner sc = new Scanner(System.in); //creazione oggetto
  
    System.out.print("Prego inserisca una lunghezza: ");
    FibLength = sc.nextInt();
  
    int[] num = new int[FibLength];
    //inizializza il primo elemento a 0
    num[0] = 0;
    //inizializza il secondo elemento a 1
    num[1] = 1;
    
    //Il nuovo numero sarà la somma dei primi due precedenti
    for (int i = 2; i < FibLength; i++) {
     num[i] = num[i - 1] + num[i - 2];
    }
  
    //Print Serie di Fibonacci della lunghgezza data
    System.out.println("La serie di fibonacci vale: ");
    for (int i = 0; i < FibLength; i++) {
     System.out.print(num[i] + " ");
    }
    sc.close();
 }
 

}