import java.util.Scanner;

public class FibRecursion{  
    static int n1=0,n2=1,n3=0;   
    static Scanner contator = new Scanner(System.in);
    static void printFibonacci(int count){    
       if(count>0){    
            n3 = n1 + n2;    
            n1 = n2;    
            n2 = n3;    
            System.out.print(" "+n3);   
            printFibonacci(count-1);    
        }    
    }    
    public static void main(String args[]){    
     int count=0;
     System.out.println("Prego inserisca il numero a cui far terminare la serie di Fibonacci\n:");  
     count = contator.nextInt();
     System.out.print(n1+" "+n2);//print 0 and 1    
     printFibonacci(count-2);//n-2 perchè i primi 2 numeri sono già inseriti di base ( 0 e 1)  
    }  
   }  