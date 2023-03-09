package GESTIONE_ERRORI;

public class first_error{

    public static void main(String[] args) {
        
        try{
            int[] myNumbers ={1,2,3,4};
            System.out.println(myNumbers[12]);

        }catch(Exception e){
            System.out.println("Qualcosa è andato storto");
        }finally{
            System.out.println("è andato");
        }
    }
}