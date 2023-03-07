public class Bank{
    int getRateOfInterest(){
        return 0;
    }

    String nome(){
        return "Bank";
    }

    public static void main(String[] args) {
        
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();

        System.out.println(s.nome() + " Rate of Interest :" + s.getRateOfInterest());
        System.out.println(i.nome() + " Rate of Interest :" + i.getRateOfInterest());
        System.out.println(a.nome() + " Rate of Interest :" + a.getRateOfInterest());
    }
}