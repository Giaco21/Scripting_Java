import java.util.*;

public class Costructed {
    int sum;
    public Costructed(int x, int y){
        sum = x+y;
    }
    public static void main(String[] args) {
        System.out.println("Prego inserisca il primo numero: \n");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Prego inserisca il secondo numero: \n");
        int num2 = scanner.nextInt();
        Costructed myObj1 = new Costructed(num1, num2);
        System.out.println(myObj1.sum);
    }
}
