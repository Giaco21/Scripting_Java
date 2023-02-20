import java.util.Scanner;
 import java.math.BigInteger;
  
 /** Classe FibFinder **/
 public class FibFinder
 {
     /** Funzione per generare il numero nella posizione del numero inserito in input **/
     public void genFib(long n)
     {
         BigInteger arr1[][] = {{BigInteger.ONE, BigInteger.ONE}, 
                                {BigInteger.ONE, BigInteger.ZERO}};
         if (n == 0)
             System.out.println("\nFirst Fibonacci number = 0");
         else
         {
             power(arr1, n - 1);          
               System.out.println("\n"+ n +" th Fibonacci number = "+ arr1[0][0]);
         }          
     }
     /** Funzione che incrementa la matrice per effettuare la ricorsività **/    
     private void power(BigInteger arr1[][], long n)
     {
         if (n == 0 || n == 1)
             return;
         BigInteger arr2[][] = {{BigInteger.ONE, BigInteger.ONE}, 
                                 {BigInteger.ONE, BigInteger.ZERO}};     
         power(arr1, n / 2);
         multiply(arr1, arr1);     
         if (n % 2 != 0)
             multiply(arr1, arr2);
     }     
     /** Funzione che moltiplica due matrici **/
     private void multiply(BigInteger arr1[][], BigInteger arr2[][])
     {
         BigInteger x = (arr1[0][0].multiply(arr2[0][0])).add(arr1[0][1].multiply(arr2[1][0]));
         BigInteger y = (arr1[0][0].multiply(arr2[0][1])).add(arr1[0][1].multiply(arr2[1][1]));
         BigInteger z = (arr1[1][0].multiply(arr2[0][0])).add(arr1[1][1].multiply(arr2[1][0]));
         BigInteger w = (arr1[1][0].multiply(arr2[0][1])).add(arr1[1][1].multiply(arr2[1][1])); 
         arr1[0][0] = x;
         arr1[0][1] = y;
         arr1[1][0] = z;
         arr1[1][1] = w;     
     }
     /** Funzione Main **/
     public static void main(String[] args) 
     {
         Scanner scan = new Scanner(System.in);
         System.out.println("*******FINDER DELLA SERIE DI FIBONACCI*******\n");
         System.out.println("Inserire un numero n per trovare il numero nella serie di fibonacci corrispondente a quel numero\n");
         long n = scan.nextLong();
         FibFinder fg = new FibFinder();
         fg.genFib(n);
     }
 }
