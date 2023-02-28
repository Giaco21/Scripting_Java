package Fibonacci_Exercises;

public class Recurs {
    public static void main(String[] args) {
        int num = (int) (Math.random() *50);
        System.out.println("il valore di partenza vale: " + num);
        NumRandom(num);

    }


    public static int NumRandom(int x){
        //CALCOLI DEL METODO

        int y = (int) (Math.random() *50);

        //CONDIZIONE DI EXIT

        if(x!=y){
            System.out.println("Nuovo valore trovato: " + y);
            return y;
        }

        //RICORSIONE

        System.out.println("Provo con un altro numero");
        return NumRandom(x);

    }
}
