import java.util.Scanner;

public class FibNoRecursion{  
public static void main(String args[])  
{    
 int n1=0,n2=1,n3,i,count=0;                //variabili
 Scanner contator = new Scanner(System.in); //scanner

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
  contator.close();
}}  