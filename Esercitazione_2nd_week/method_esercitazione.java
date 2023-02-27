package Esercitazione_2nd_week;

public class method_esercitazione {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        double c=10.2;
        double d= 10.3;
        System.out.println(somma(a,b));
        System.out.println(somma(c, d));
    }

    public static int somma(int x, int y){
        return x+y;
    }
    public static double somma(double z,double h){
        return z+h;
    }
}
