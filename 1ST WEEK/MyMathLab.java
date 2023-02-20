import java.lang.Math;
import java.util.Scanner;
public class MyMathLab {
    public static void main(String[] args) {

    //scanner primo valore
    Scanner myNum1 = new Scanner(System.in);
    int num1, num2, num3, num4;

    //inserisco primo numero
    System.out.println("Inserisci il primo numero da sommare");
    num1 = myNum1.nextInt();

    //inserisco secondo numero
    System.out.println("Inserisci il secondo numero da sommare");
    num2 = myNum1.nextInt();

    //somma
    int sum = Math.addExact(num1, num2);
    System.out.println("La somma dei due numeri è : " + sum);

    //inserisco primo numero da vedere max
    System.out.println("Inserisci il primo numero per vedere il massimo");
    num3= myNum1.nextInt();


    //inserisco secondo numero da vedere max
    System.out.println("Inserisci il secondo numero per vedere il massimo");
    num4= myNum1.nextInt();

    //massimo
    int max = Math.max(num3, num4);
    System.out.println("Il massimo tra i due numeri inseriti è : " + max);
    
    //random
    int random = (int)Math.random() * 101;
    System.out.println("Congratulazioni, sei lo studente n° : " + random);

    myNum1.close();

    }    
}
