import java.util.Scanner;
public class FibNoRecursion{  
  static int n1=0,n2=1,n3,i,count=0, sc;            //variabili
  static Scanner contator = new Scanner(System.in); //scanner
  static Scanner scelta = new Scanner(System.in);
public static void main(String args[])  
{    
menu();
}


public static void FibonacciGeneratorEvenNumber(){
  System.out.println("Prego inserisca il numero a cui far terminare la serie di Fibonacci: \n");   
 count = contator.nextInt();

 System.out.print(n1+" "+n2);//printing 0 and 1    

 for(i=2;i<count;++i)//il loop inizia da 2 perchè 0 e 1 vengono già stampati
 {    

  n3=n1+n2;   
  if(n3%2!=0){
  System.out.print(" "+n3);    
  }
  n1=n2;    
  n2=n3;  
 }    
 //reclusion
  contator.close();
}

public static void FibonacciGenerator(){
  System.out.println("Prego inserisca il numero a cui far terminare la serie di Fibonacci: \n");   
 count = contator.nextInt();

 System.out.print(n1+" "+n2);//printing 0 and 1    

 for(i=2;i<count;++i)//il loop inizia da 2 perchè 0 e 1 vengono già stampati
 {    

  n3=n1+n2;   
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;  
 }    
 //reclusion
  contator.close();
}


public static void FibonacciFinderNmr(){

  Scanner scan = new Scanner(System.in);
  System.out.print("Input a number: ");
  int n = scan.nextInt();	       
if (n>0)
{	
  if(isFibonacci(n) == true){
    System.out.println("Il numero inserito e' un numero della serie di Fibonacci\n");

  }else System.out.println("Il numero inserito non e' un numero della serie di Fibonacci\n");

} 
}

public static boolean isPerfectSquare(int x)
{
   int s = (int) Math.sqrt(x); 
   return (s*s == x);
 }

public static boolean isFibonacci(int x)
{
   return isPerfectSquare(5*x*x + 4) || isPerfectSquare(5*x*x - 4);
}

public static void menu(){

  System.out.println("Prego inserisca una scelta\n [0]Esci\n [1]Genera Fibonacci\n [2]Genera Fibonacci solo per dispari\n [3]Trova in Fibonacci\n");
  sc = scelta.nextInt();
  switch(sc){
    case 0:
    System.out.println("Arrivederci!");
    break;
    case 1:
    FibonacciGenerator();
    break;
    case 2:
    FibonacciGeneratorEvenNumber();
    break;
    case 3:
    FibonacciFinderNmr();
    break;
    default : System.out.println("ERRORE! SELEZIONARE UN VALORE VALIDO");
    menu();
  }

}
}  