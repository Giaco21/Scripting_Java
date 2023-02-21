import java.util.*;
public class javaArray {
    public static void main(String[] args){
        Scanner oggetto = new Scanner(System.in);
        Scanner oggetto2 = new Scanner(System.in);
        String input;
        int x;
        String[] cars ={"Volvo", "BMW", "Ford", "Mazda"};
        String[] copy ={"Volvo", "BMW", "Ford", "Mazda"};
        int[] nums = {0,0,0,0};
        cars[0]="Fiat";
        System.out.println("Inserisci nome, cognome, email, eta: ");
        
        //inserisci i dati nel primo array
        for(int i = 0; i<4; i++){
            input = oggetto.nextLine();
            cars[i]=input;
        }
        System.out.println("\n");
        for(int i = 0; i<4; i++){
            System.out.println(cars[i]);
        }
        
        //copia nel secondo array
        for(int i = 0; i<4; i++){
            copy[i] = cars[i];
        }

        for(int i = 0; i<4; i++){
            x = oggetto2.nextInt();
            nums[i]=x;
        }
        System.out.println("\n");
        for(int i = 0; i<4; i++){
            System.out.println("array 1: ");
            System.out.println(copy[i]);
            System.out.println("array 2: ");
            System.out.println(nums[i]);
        }
        oggetto.close();
        oggetto2.close();
    }
}
