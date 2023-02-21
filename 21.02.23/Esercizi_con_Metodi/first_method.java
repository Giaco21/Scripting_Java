package Esercizi_con_Metodi;

public class first_method {
    
    public static void Stampa(String str){
        System.out.println(str);
    }

    public static void Somma(){
        int x= 10+5;
        System.out.println(x);
    }

    public static int mySum(int x){
        return 10+x;
    }

    public static float mySumF(Float x){
        return 10+x;
    }

    public static double mySumD(Double x){
        return 10+x;
    }

    public static String myStr(String Str){
        return "ciao " + Str;
    }
    
    public static void main(String[] args) {
        Stampa("Giacomo");
        Stampa("Ama");
        Stampa("Sabrina");
        Somma();
       System.out.println(mySum(10));
       System.out.println(mySumF(10.f));
       System.out.println(mySumD(10.00));
       System.out.println(myStr("Giacomo"));
    }
}
